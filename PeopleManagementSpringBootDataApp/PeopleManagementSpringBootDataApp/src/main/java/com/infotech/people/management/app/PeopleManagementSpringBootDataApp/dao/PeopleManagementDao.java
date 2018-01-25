package com.infotech.people.management.app.PeopleManagementSpringBootDataApp.dao;

import org.springframework.data.repository.CrudRepository;

import com.infotech.people.management.app.PeopleManagementSpringBootDataApp.entities.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer> {

}
