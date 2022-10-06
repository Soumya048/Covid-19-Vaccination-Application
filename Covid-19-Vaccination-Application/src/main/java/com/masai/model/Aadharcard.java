package com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Aadharcard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer aid;
	@NotNull
	private String aadharnumber;
	@NotNull
	private String fingerprint;
	@NotNull
	private String irisscan;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "aadharcard")
	private Idcard idcard;

}
