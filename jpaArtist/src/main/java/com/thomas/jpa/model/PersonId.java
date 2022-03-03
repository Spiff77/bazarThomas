package com.thomas.jpa.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public @Data class PersonId implements Serializable {

	private static final long serialVersionUID = -4995377793674342247L;
	
	private String firstName;
	private String lastName;
	
}
