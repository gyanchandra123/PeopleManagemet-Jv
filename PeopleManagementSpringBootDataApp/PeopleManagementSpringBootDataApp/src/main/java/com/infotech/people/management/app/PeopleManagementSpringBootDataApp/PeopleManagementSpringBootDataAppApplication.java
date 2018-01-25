package com.infotech.people.management.app.PeopleManagementSpringBootDataApp;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infotech.people.management.app.PeopleManagementSpringBootDataApp.entities.Person;
import com.infotech.people.management.app.PeopleManagementSpringBootDataApp.service.PeopleManagementService;

@SpringBootApplication
public class PeopleManagementSpringBootDataAppApplication implements CommandLineRunner {

	@Autowired
	PeopleManagementService peopleManagementService;

	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementSpringBootDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// its a callBack() method that will be call automatically
		// thats why its written outside the main() method.

		createPerson();
		//createPersons();

	}

	/**
	 * 
	 
	private void createPersons() {
		List<Person> personList = Arrays.asList(new Person("BBB", "Bmith", "B@gmail.com", new Date()),
			                                	new Person("CCC", "Cmith", "C@gmail.com", new Date()));

		Iterable<Person> listOfPerson = peopleManagementService.createPersons(personList);

		for (Person person : listOfPerson) {
			System.out.println(person);
		}

	}
*/
	private void createPerson() {                

		Person person1 = new Person("AAA", "Smith", "A@gmail.com", new Date());
		Person personDb = peopleManagementService.createPerson(person1);

		System.out.println(personDb);

	}

}
