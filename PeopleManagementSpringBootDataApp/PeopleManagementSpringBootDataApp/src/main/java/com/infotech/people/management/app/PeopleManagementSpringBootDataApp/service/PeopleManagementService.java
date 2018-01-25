package com.infotech.people.management.app.PeopleManagementSpringBootDataApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.people.management.app.PeopleManagementSpringBootDataApp.dao.PeopleManagementDao;
import com.infotech.people.management.app.PeopleManagementSpringBootDataApp.entities.Person;

@Service
public class PeopleManagementService {

	@Autowired
	PeopleManagementDao peopleManagementDao;

	public Person createPerson(Person person1) {

		return peopleManagementDao.save(person1);
	}

	public Iterable<Person>  createPersons(List<Person> personList) {
		Iterable<Person> list=  peopleManagementDao.saveAll(personList);
		return list;
		
	}

}
