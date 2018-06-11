
public class OrganicDog extends Organic {

	private int cageCleanliness;
	private int amount = 10;

	public OrganicDog(String petName, String description, int hunger, int thirst, int happiness, int health,
			int cageCleanliness) {
		super(petName, description, health, happiness, health, cageCleanliness);
		this.cageCleanliness = cageCleanliness;
	}

	public int getCageCleanliness() {
		return cageCleanliness;
	}

	public void setCageCleanliness(int cageCleanliness) {
		this.cageCleanliness = cageCleanliness;
	}

	public int cageCleanliness() {
		cageCleanliness += amount;
		return cageCleanliness;
	}

	public void walkDogs() {
		happiness += amount / 2;
		waste += amount / 2;
		thirst -= amount / 2;
	}

	@Override
	public int cleanDogCage() {
		waste += amount;
		cageCleanliness += amount;
		happiness += amount / 2;
		return waste;
	}

	public void singleTick() {
		cageCleanliness -= amount / 5;
	}

	@Override
	public void getStatus() {
		System.out.println(getPetName() + " - " + getDescription() + " / Hunger: " + hunger + " / Thirst " + thirst
				+ " / Happiness: " + getHappiness() + " / Health Level " + getHealth() + "/ Cage cleanliness: "
				+ cageCleanliness);
	}

}
