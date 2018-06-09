import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> pets = new HashMap<>();

	public int getPetCount() {
		return pets.size();
	}

	public void addPet(VirtualPet pet) {
		pets.put(pet.getName(), pet);

	}

	public void remove(VirtualPet pet) {
		pets.remove(pet.getName(), pet);
		
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
	}


}
