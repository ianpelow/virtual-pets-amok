
public class OrganicDog extends Organic {

	public OrganicDog(String name, String description, int health, int happiness) {
		super(name, description, health, happiness);
	}

	public int getCleanAllCages() {
		return waste;
	}

	public void setCleanAllCages(int waste) {
		this.waste = waste;
	}
	
	public int getWalkDogs() {
		return happiness;
	}

	public void setWalkDogs(int happiness) {
		this.happiness = happiness;
	}
	
	public int cleanAllCages() {
		health += amount / 2;
		waste += amount;
		happiness += amount / 2;
		return waste;
	}
	
	public void walkDogs() {
		happiness += amount;
		health += amount / 2;
		thirst -= amount /2;
		waste += amount / 2;
	}
	
	public void wasteInDogCageTick() {
		waste -= amount / 5;
	}

}
