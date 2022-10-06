package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vaccine {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer vaccineId;
	@Size(min=4, max = 15, message = "Please enter valid name in between 4 to 15 length")
	private String vaccineName;
	@NotNull
	@Size(min=5, max = 30, message = "Description should be in between 5 to 30 length")
	private String description;
	@NotNull
	private Integer quantity;
	@NotNull
	private Double price;

}
