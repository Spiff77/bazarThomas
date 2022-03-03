package com.thomas.jpa.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Embeddable
@AllArgsConstructor
public @Data class VehiculeId implements Serializable {
	private static final long serialVersionUID = -3803961995003701640L;
	private String immat;
	private String model;
	
}
