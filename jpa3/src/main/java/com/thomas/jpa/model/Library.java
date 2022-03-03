package com.thomas.jpa.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="librairie")
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nom")
	private String name;
	
	@OneToMany(mappedBy = "libraryAssocie")
	private List<Person> visitors;
	
	@OneToMany(mappedBy = "lieuDeTravail")
	private List<Person> employees;
	
	@ManyToMany
	@JoinTable( name="librarybooks",
	joinColumns = @JoinColumn(name="libraryyyyy_id"),
	inverseJoinColumns = @JoinColumn(name="bookkkkk_id"))
	private List<Book> books;
	
}
