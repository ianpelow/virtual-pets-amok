import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> pets = new HashMap<>();

	public int getPetCount() {
		return pets.size();
	}

	public void addPet(String pet) {
		pets.put(pet, null);

	}

	public void remove(String pet) {
		pets.remove(pet);
		
	}
	
	public void allPetTick(VirtualPet pet) {
		pets.putAll(pets);

	}
	
	public void feedPet(VirtualPet pet) {
		pets.put(null, pet);
	}

	public void waterPet(VirtualPet pet) {
		pets.put(null, pet);
	}

	public void playWithPet(String petName) {
		pets.get(null);
		
	}



}
