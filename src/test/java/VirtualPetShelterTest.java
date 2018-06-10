import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetShelterTest {

	VirtualPetShelter testAnimalShelter = new VirtualPetShelter();

	@Test
	public void shouldFeedAllOrganicPets() {
		VirtualPet petTestFeedAll = new Organic(null, null, 0, 0, 0, 0);
		testAnimalShelter.addPet(petTestFeedAll);
		int preTest = petTestFeedAll.getHunger();
		testAnimalShelter.feedPets();
		int underTest = petTestFeedAll.getHunger();
		assertTrue(preTest < underTest);
	}

	@Test
	public void shouldGiveAllOrganicPetsWater() {
		VirtualPet petTestGiveAllWater = new Organic(null, null, 0, 0, 0, 0);
		testAnimalShelter.addPet(petTestGiveAllWater);
		int preTest = petTestGiveAllWater.getThirst();
		testAnimalShelter.waterAllPets();
		int underTest = petTestGiveAllWater.getThirst();
		assertTrue(preTest < underTest);
	}

	@Test
	public void shouldPlayWithPet() {
		VirtualPet petTestPlayWithPet = new VirtualPet(null, null, 0, 0, 0, 0);
		testAnimalShelter.addPet(petTestPlayWithPet);
		int preTest = petTestPlayWithPet.getHappiness();
		testAnimalShelter.playWithAPet(null);
		int underTest = petTestPlayWithPet.getHappiness();
		assertTrue(preTest < underTest);
	}

	@Test
	public void shouldAllowPetAdoption() {
		VirtualPetShelter petTestAdoptPet = new VirtualPetShelter();
//		testAnimalShelter.adoptPet(new VirtualPet(null, null, 0, 0, 0, 0));
		Assert.assertEquals(0, testAnimalShelter.getPets().size());
	}

	@Test
	public void shouldAllowPetToBeSurrendered() {
		VirtualPetShelter petTestAddNewPet = new VirtualPetShelter();
		testAnimalShelter.addPet(new VirtualPet(null, null, 0, 0, 0, 0));
		Assert.assertEquals(1, testAnimalShelter.getPets().size());
	}

	@Test
	public void shouldUpdateAllPetsWithTick() {
		String name = null;
		String description = null;
		int hunger = 1;
		int happiness = 2;
		int thirst = 3;
		int health = 4;
		VirtualPet testAllPetsWithTick = new VirtualPet(name, description, hunger, thirst, happiness, health );
		testAllPetsWithTick.singleTick();
		Assert.assertEquals(0, testAllPetsWithTick.getHunger());
		Assert.assertEquals(0, testAllPetsWithTick.getHappiness());
		Assert.assertEquals(0, testAllPetsWithTick.getThirst());
		Assert.assertEquals(4, testAllPetsWithTick.getHealth());
	}

	@Test
	public void shouldDisplayStatusOfAllPets() {
		VirtualPet petStatusDisplay = new VirtualPet(null, null, 0, 0, 0, 0);
		testAnimalShelter.displayStatus();
//		Assert.asserteEquals(petStatusDisplay.getStatus());
	}
	
	@Test
	public void shouldWalkAllDogs() {
		VirtualPet petTestWalkAllDogs = new Organic(null, null, 0, 0, 0, 0);
		testAnimalShelter.addPet(petTestWalkAllDogs);
		int preTest = petTestWalkAllDogs.getThirst();
		testAnimalShelter.waterAllPets();
		int underTest = petTestWalkAllDogs.getThirst();
		assertTrue(preTest < underTest);
	}

}


	
