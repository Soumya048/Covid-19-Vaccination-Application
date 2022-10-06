package com.masai.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Slot {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer slotId;
	@NotNull
	private Integer slotNumber;
	@NotNull
	private LocalDate date;
	@NotNull
	private String slotTime;
	@NotNull
	private Integer seats;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "slots")
	private List<Appointment> appointments = new ArrayList<>();
	
}
