package com.cassol.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.cassol.repository.CondoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
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
