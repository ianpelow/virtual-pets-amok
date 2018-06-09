
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetShelterTest {

	VirtualPet newpet = new VirtualPet("name", "description", 10, 10);
	VirtualPetShelter testShelter = new VirtualPetShelter();

	
	
	@Test
	public void shouldAddPetToShelter() {
		int numberOfPetsBeforeAdd = testShelter.getPetCount();
		testShelter.addPet(newpet);
		int numberOfPetsAfterAdd = testShelter.getPetCount();
		assertThat(numberOfPetsAfterAdd, is(equalTo(numberOfPetsBeforeAdd + 1)));
	}
	
	@Test
	public void shouldRemovePetFromShelter() {
		int numberOfPetsBeforeRemove = testShelter.getPetCount();
		testShelter.remove(newpet);
		int numberOfPetsAfterRemove = testShelter.getPetCount();
		assertThat(numberOfPetsAfterRemove, is(equalTo(numberOfPetsBeforeRemove + 1)));
	}
	
}

//@Test
//public void shouldUpdateAllPetsWithTick() {
//	String name = null;
//	String description = null;
//	int hunger = 1;
//	int boredom = 2;
//	int thirst = 3;
//	VirtualPet testAllPetsWithTick = new VirtualPet(name, description, hunger, boredom, thirst);
//	testAllPetsWithTick.singleTick();
//	Assert.assertEquals(-1, testAllPetsWithTick.getHunger());
//	Assert.assertEquals(1, testAllPetsWithTick.getBoredom());
//	Assert.assertEquals(0, testAllPetsWithTick.getThirst());
//}
//
//@Test
//public void shouldDisplayStatusOfAllPets() {
//	VirtualPet petStatusDisplay = new VirtualPet(null, null, 0, 0, 0);
//	testAnimalShelter.displayStatus();
//	// assertThat(petStatusDisplay.getStatus());
//	// Cannot figure out how to test the display of pet status

	
