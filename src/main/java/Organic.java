
public class Organic extends VirtualPet {

	protected int hunger;
	protected int thirst;
	protected int waste;
	protected int amount = 10;
	
	public Organic(String petName, String description, int hunger, int thirst, int happiness, int health) {
		super(petName, description, hunger, thirst, happiness, health);
		this.hunger = hunger;
		this.thirst = thirst;
	}

	@Override
	public int waterPet() {
		thirst += amount;
		return thirst;
	}

	@Override
	public int feedPet() {
		hunger += amount;
		thirst -= amount /5;
		return hunger;
	}

	@Override
	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}
	
	@Override
	public int getThirst() {
		return thirst;
	}

	public void setThirst(int thirst) {
		this.thirst = thirst;
	}
	
	public int getWaste() {
		return waste;
	}
	
	public void setWaste(int waste) {
		this.waste = waste;
	}
	
	public void singleTick() {
		hunger -= 2;
		thirst -= 2;
	}
	
	@Override
	public int cleanDogCage() {
		waste += amount;
		happiness = amount;
		return waste;
	}
	
	@Override
	public void getStatus() {
		System.out.println(getPetName() + " - " + getDescription() + " / Hunger: " + hunger + " / Thirst " + thirst
				+ " / Happiness: " + getHappiness() + " / Health Level " + getHealth());
	}
}
