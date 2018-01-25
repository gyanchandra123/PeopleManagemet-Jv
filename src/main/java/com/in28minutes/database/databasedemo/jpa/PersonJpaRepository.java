package com.in28minutes.database.databasedemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.Person;

// define as repository
@Repository

// define transaction : used  for crud DB operation.
@Transactional
public class PersonJpaRepository {

	// connect to the DB.
	@PersistenceContext
	EntityManager entityManager;

	// All the activities related with DB are stored through "PersistenceContext"
	// which implements the interface "EntityManager"
	// find Employee by id
	public Person findById(int id) {
		return entityManager.find(Person.class, id);
		// first argument = entity class name ; 2nd argument = primary key column name.
	}

	// to insert or update a table , we will used the merge() method of the
	// entityManger.
	/*
	 * 1. it will first check whether the id property is there in the person table
	 * or 2. if it is there , then it will update. 3. else it will create the new id
	 * column.
	 */

	public Person update(Person person) {
		return entityManager.merge(person);
	}

	public Person insert(Person person) {
		return entityManager.merge(person);
	}

	public void deleteById(int id) {
		Person person = findById(id);
		entityManager.remove(person);
	}
	
	// get all employees
	public List<Person> findAll() {
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
		return namedQuery.getResultList();
	}

}
