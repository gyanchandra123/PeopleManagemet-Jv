package com.in28minutes.jpa.hibernate.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.jpa.hibernate.demo.entity.Course;
import com.in28minutes.jpa.hibernate.demo.repository.CourseRepository;
import com.in28minutes.jpa.hibernate.demo.repository.StudentRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CourseRepository CourseRepository;
	
	@Autowired
	private StudentRepository studentRepository;

	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		//Course course = repository.findById(10001L);
		
		//logger.info("Course 10001 -> {}", course);
		
		//repository.deleteById(10001L);
		//repository.save(new Course("Microservices in 100 Steps")); // insert and update.
		
		// play with the entity manager.
		//repository.playWithEntityManager();
		
		studentRepository.saveStudentWithPassport();
	}
}
