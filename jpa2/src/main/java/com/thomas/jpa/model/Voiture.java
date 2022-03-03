package com.thomas.jpa.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Entity 
@Table(name = "car" )
@RequiredArgsConstructor
public @Data class Voiture extends Vehicule {

	@ManyToOne
	private Person owner;

	public Voiture(@NonNull VehiculeId id, @NonNull String couleur) {
		super(id, couleur);
	}

	
	
}
