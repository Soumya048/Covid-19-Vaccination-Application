package com.masai.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VaccinationCenter {
	
	@Id
	@SequenceGenerator(name = "center_generator", sequenceName = "center_sequence", allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "center_generator")
	private Integer centerCode;
	@NotNull
	private String centerName;
	@Size(min = 3, max = 20, message = "Street should be in between 3 to 20")
	private String street;
	@Size(min = 3, max = 20, message = "City should be in between 3 to 20")
	private String city;
	@Size(min = 3, max = 20, message = "State should be in between 3 to 20")
	private String state;
	@Size(min = 6, max = 6, message = "Pincode should be 6 digit")
	private String pincode;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Slot> slots = new ArrayList<>();
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<VaccineInventory> VaccineInventories = new HashSet<>();
	

}
