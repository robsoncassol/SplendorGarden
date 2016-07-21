package com.cassol.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cassol.CondoApplication;
import com.cassol.repository.CondoRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CondoApplication.class)
@WebAppConfiguration
public class CondoTest {
	
	@Autowired
	private CondoRepository repository;

	@Test
	public void testSimpleSave() {
		Condo saved = repository.save(new Condo("Splendor Garden"));
		Assert.assertNotNull(saved.getId());
	}

	@Test
	public void testSaveCascadeCondoAndBuildings() {
		Condo entity = new Condo("Splendor Garden");
		Building buildingA = new Building("Torre A");
		entity.addBuilding(buildingA);
		entity.addBuilding(new Building("Torre B"));
		entity.addBuilding(new Building("Torre C"));
		repository.save(entity);
		
		Assert.assertNotNull(buildingA.getId());
	}

	@Test
	public void testSaveCascadeCondoAndBuildingsAndUnits() {
		Condo entity = new Condo("Splendor Garden");
		Building buildingA = new Building("Torre A");
		Unit unit = new Unit("251");
		buildingA.addUnit(unit);
		entity.addBuilding(buildingA);
		entity.addBuilding(new Building("Torre B"));
		entity.addBuilding(new Building("Torre C"));
		repository.save(entity);
		
		Assert.assertNotNull(buildingA.getId());
		Assert.assertNotNull(unit.getId());
	}

}
