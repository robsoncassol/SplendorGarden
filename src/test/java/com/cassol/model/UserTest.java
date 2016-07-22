package com.cassol.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cassol.CondoApplication;
import com.cassol.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CondoApplication.class)
@WebAppConfiguration
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
