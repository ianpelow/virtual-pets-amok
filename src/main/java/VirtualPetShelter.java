import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> pets = new HashMap<>();

	public Collection<VirtualPet> getPets() {
		return pets.values();
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
	
	public void oilAllRobots() {
		for (VirtualPet pet : pets.values()) {
			pet.oilAllRobots();
		}
	}

	public void playWithAPet(String petName) {
		getAPet(petName).playWithPet();
	}

	public void singleTick() {
		for(VirtualPet pet: pets.values()) {
			pet.singleTick();
		}
	}
		public void displayStatus() {
		for(VirtualPet pet : pets.values()) {
			pet.getStatus();
		}
	}
		
		public void feedPet(String petName) {
		}

		public void waterPet(String petName) {	
		}

		public void remove(VirtualPet petName) {
		}


}
