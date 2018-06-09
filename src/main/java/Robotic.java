
public class Robotic extends VirtualPet {

	private int OIL_LEVEL = 100;
	protected int oil = OIL_LEVEL;
	private int amount = 10;

	public Robotic(String name, String description, int health, int happiness) {
		super(name, description, health, happiness);

	}

	public int getOilLevel() {
		return oil;
	}

	public void setOilLevel(int oil) {
		this.oil = oil;
	}

	public void oilPet() {
		health += amount / 2;
		happiness += amount / 3;
	}

	public void playWithRoboticPet() {
		happiness += amount;
		health += amount;
	}

}
