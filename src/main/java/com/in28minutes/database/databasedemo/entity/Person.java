package com.in28minutes.database.databasedemo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "person") // used for  mapping the table name of the DB && the entity class's name.
@NamedQuery(name="find_all_persons", query="select p from Person p")
public class Person {

	@Id 				// it indicate that the particular column is a primary key.
	@GeneratedValue     
	// it allow the value of this column to be automatically generate.&& 
	// its apply only on the primary key column only.
	
	@Column(name = "id") 
	// used for mapping the column name for the entity class property name && the table column name.
	// this work is done by the RowMapper in the springJDBC.
	
	private int id;
	
	private String name;
	private String location;
	private Date birthDate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	
	
	public Person(int id, String name, String location, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}
	
	public Person(){
		
	}
	
	public Person( String name, String location, Date birthDate) {
		super();		 
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}
	
	
	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate + "]";
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
