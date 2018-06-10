
public class Organic extends VirtualPet {

	protected int hunger;
	protected int thirst;
	protected int waste;
	protected int amount = 10;

	public Organic(String name, String description, int health, int happiness) {
		super(name, description, health, happiness);
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

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

	public void feedPet() {
		hunger += amount;
		health += amount / 2;
		waste -= amount / 2;
		happiness += amount / 2;
		thirst -= amount / 5;
		return;
	}

	public void waterPet() {
		hunger -= amount / 5;
		thirst += amount;
		health += amount / 2;
		waste -= amount / 2;
		happiness += amount / 5;
		return;
	}

	public void singleTick() {
		hunger -= amount / 5;
		thirst -= amount / 5;
	}
	
	public void getStatus() {
		System.out.println(petName + " - " + description + " / Hunger: " + hunger + " / Thirst " + thirst
				+ " / Happiness: " + happiness + " / Health level: " + health);
	}

}
