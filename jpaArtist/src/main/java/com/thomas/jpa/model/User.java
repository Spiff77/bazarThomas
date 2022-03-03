package com.thomas.jpa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;

@Entity
@Table(name="user")
@PrimaryKeyJoinColumns(value = {
		@PrimaryKeyJoinColumn(name="p_firstname"),
		@PrimaryKeyJoinColumn(name="p_lastname")
})
public class User extends Person{
	

	private int size;
	
	private String bandName;
	
	@OneToMany(mappedBy = "artist")
	private List<Album> albums;
	

	
}
