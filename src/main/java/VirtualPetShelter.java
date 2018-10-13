import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public Collection<VirtualPet> getPets() {
		return pets.values();
	}

	private int litterBoxLevel = 50;

	public int getLitterBoxLevel() {
		return litterBoxLevel;
	}

	public void setLitterBoxLevel(int litterBoxLevel) {
		this.litterBoxLevel = litterBoxLevel;
	}

	public VirtualPet getAPet(String petName) {
		return pets.get(petName);
	}

	public void addPet(VirtualPet pet) {
		pets.put(pet.getPetName(), pet);
	}

	public void addNewPet(String newPetName) {
		addNewPet(newPetName);
	}

	public void adoptPet(String petName) {
		pets.remove(petName);
	}

	public void feedPets() {
		for (VirtualPet pet : pets.values()) {
			pet.feedPet();
		}
	}

	public void waterAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.waterPet();
		}
	}

	public void oilAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.oilPet();
		}
	}

	public void cleanAllDogCages() {
		for (VirtualPet pet : pets.values()) {
			pet.cleanAllCages();
		}
	}

	public void playWithAPet(String petName) {
		getAPet(petName).playWithPet();
	}

	public void cleanADogCage(String petName) {
		getAPet(petName).cleanDogCage();
	}

	public void walkDogs() {
		for (VirtualPet pet : pets.values()) {
			pet.walkDog();
		}
	}

	public void allPetTick() {
		for (VirtualPet pet : pets.values()) {
			pet.singleTick();
		}
		litterBoxLevel += 10;
	}

	public void displayStatus() {
		for (VirtualPet pet : pets.values()) {
			pet.getStatus();
		}
		litterBoxLevel += 10;

	}

	public void getStatus() {
		System.out.println("Current litterbox level: " + litterBoxLevel);
	}

	public void cleanLitterBox() {

	}

}
