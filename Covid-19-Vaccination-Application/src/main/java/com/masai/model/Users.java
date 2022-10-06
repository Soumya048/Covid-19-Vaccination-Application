package com.masai.model;

import java.util.Date;

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
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	
	private boolean dose1status;
	
	private boolean dose2status;
	
	private boolean dose3status;
	
	private Date dose1;
	
	private Date dose2;
	
	private Date dose3;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "user")
	private Idcard idcard;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Appointment appointment;
	
	
	
	
	

}
