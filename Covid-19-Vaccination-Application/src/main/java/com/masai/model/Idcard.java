package com.masai.model;

import java.time.LocalDate;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Idcard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	
	@NotNull
	private LocalDate dob;
	@NotNull
	private String mobile;
	@NotNull
	private String gender;
	@NotNull
	private String state;
	@NotNull
	private String city;
	@NotNull
	private String street;
	@NotNull
	private String pincode;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Aadharcard aadharcard;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Users user;
	
	
	
	
}
