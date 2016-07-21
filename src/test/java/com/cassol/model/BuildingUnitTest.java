package com.cassol.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cassol.CondoApplication;
import com.cassol.repository.UnitRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CondoApplication.class)
@WebAppConfiguration
public class BuildingUnitTest {

	@Autowired
	private UnitRepository repository;
	
	
	@Test
	public void test() {
		Unit saved = repository.save(new Unit("251"));
		Assert.assertNotNull(saved.getId());
	}

}
