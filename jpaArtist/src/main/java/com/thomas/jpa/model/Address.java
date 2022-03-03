package com.thomas.jpa.model;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public @Data class Address {
	
	private int streetNumber;
	private String streetName;
	private String postalCode;
}
