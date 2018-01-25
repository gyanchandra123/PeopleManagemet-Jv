package com.in28minutes.jpa.hibernate.demo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.jpa.hibernate.demo.DemoApplication;
import com.in28minutes.jpa.hibernate.demo.entity.Passport;
import com.in28minutes.jpa.hibernate.demo.entity.Student;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
class StudentRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentRepository repository;
	
	@Autowired
	EntityManager em;
 
	
	
	@Test
	@Transactional
	public void sometest() {
		repository.someOperationToUnderstandPersistenceContext();
	}
	
	
	@Test
	@Transactional
	public void retrieveStudentAndPassportDetails() {
		 Student student = em.find(Student.class, 20001L);
		 logger.info("Student -> {}" , student);
		 logger.info("passport -> {}" , student.getPassport());		 
		 
	} 

	@Test
	@Transactional
	public void retrievePassportAndStudentDetails() {
		 Passport passport = em.find(Passport.class, 40001L);
		 logger.info("passport -> {}" , passport);
		 logger.info("student -> {}" , passport.getStudent());		 
		 
	} 

	
	
}
