
public class Organic extends VirtualPet {

	private int hunger;
	private int thirst;
	private int waste;
	private int amount = 10;

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

	public void singleTick() {
		hunger -= 2;
		thirst -= 2;
		waste -= 2;

	}

	public void feedPet() {
		hunger += amount;
		health += amount / 2;
		waste += amount / 5;
		happiness += amount / 2;
		thirst += amount / 2;

	}

	public void waterPet() {
		hunger += amount;
		health += amount / 2;
		waste += amount / 5;
		happiness += amount / 2;
		thirst = amount;
	}

	public void playWithPet() {
		happiness += amount;
		health += amount;
		thirst += amount / 5;
	}
	
}
