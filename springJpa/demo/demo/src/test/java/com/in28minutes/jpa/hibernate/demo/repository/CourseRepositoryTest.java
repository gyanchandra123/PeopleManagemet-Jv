package com.in28minutes.jpa.hibernate.demo.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.jpa.hibernate.demo.DemoApplication;
import com.in28minutes.jpa.hibernate.demo.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
class CourseRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CourseRepository repository;

	@Test
	public void findById_basic() {
		Course course = repository.findById(10001L);
		assertEquals("JPA in 50 steps", course.getName());
	}

	/*
	 * @Test
	 * 
	 * @DirtiesContext // purpose : since we are deleting the person of id :10002,
	 * // once the testing is done, we want the deleted person to be avaialable
	 * again // if it's not available back, then because of that empty data it will
	 * cause problem to another services as well. // to resolve this , we use this
	 * annotation. public void deleteById_basic() { repository.deleteById(10002L);
	 * assertNull(repository.findById(10002L)) ; }
	 */

	@Test
	@DirtiesContext
	public void save_basic() {

		// get a course
		Course course = repository.findById(10001L);
		assertEquals("JPA in 50 steps", course.getName());

		// update details
		course.setName("JPA in 50 Steps - Updated");

		repository.save(course);

		// check the value
		Course course1 = repository.findById(10001L);
		assertEquals("JPA in 50 Steps - Updated", course1.getName());
	}

	// play with entity manager
	@Test
	@DirtiesContext
	public void playWithEntityManager() {
		repository.playWithEntityManager();
	}

}