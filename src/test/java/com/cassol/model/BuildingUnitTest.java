package com.cassol.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.cassol.repository.UnitRepository;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class BuildingUnitTest {

	@Autowired
	private UnitRepository repository;
	
	
	@Test
	public void test() {
		Unit saved = repository.save(new Unit("251"));
		Assert.assertNotNull(saved.getId());
	}

}
