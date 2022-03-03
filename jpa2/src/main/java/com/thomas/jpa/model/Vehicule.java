package com.thomas.jpa.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="vehicle_type")
public abstract class Vehicule {

	@EmbeddedId
	@NonNull
	private VehiculeId id;
	
	@NonNull
	@Column(name = "color") 
	private String couleur;
	
	@OneToOne(mappedBy="car")
	private Engine engine;
}
