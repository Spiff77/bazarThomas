package com.thomas.jpa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="artist")
//@PrimaryKeyJoinColumn(name="p_id")
public class Artist extends Person{

	private int size;
	
	private String bandName;
	
	@OneToMany(mappedBy = "artist")
	private List<Album> albums;
	

	
}
