package com.thomas.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;

@Entity
@SecondaryTable(name = "salaryinfos")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	@Column(table="salaryinfos")
	private float salary;

	@Column(table="salaryinfos")
	private float comission;
	
	@Column(table="salaryinfos")
	private boolean extraMonth;
	
}
