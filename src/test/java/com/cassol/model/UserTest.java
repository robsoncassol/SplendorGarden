package com.cassol.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.cassol.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class UserTest {
	
	@Autowired
	private UserRepository repository;

	@Test
	public void testUserProfilesSave() {
		User saved = repository.save(new User("Robson", User.Profile.DWELLER));
		
		User loaded = repository.findOne(saved.getId());
		
		Assert.assertNotNull(loaded.getId());
		Assert.assertNotNull(loaded.getProfiles());
		
		
	}
	

}
