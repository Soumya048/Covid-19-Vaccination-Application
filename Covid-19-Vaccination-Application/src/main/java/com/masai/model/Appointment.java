package com.masai.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
	
	@Id
	@SequenceGenerator(name = "bookingid_generator", sequenceName = "bookingid_sequence", allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookingid_generator")
	private Integer bookingId;
	@Size(min=10, max=10, message = "Mobile Number should be 10 digit")
	private String mobileNo;
	private LocalDate dateOfBooking;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Slot slots;
	
	private Boolean bookingStatus;

}
