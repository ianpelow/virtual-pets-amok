
public class Robotic extends VirtualPet {

	private int OIL_LEVEL = 100;
	protected int oil = OIL_LEVEL;
	private int amount = 10;

	public Robotic(String name, String description, int health, int happiness) {
		super(name, description, health, happiness);
	}
	
	public int getOil()  {
		return oil;
	}
	
	public void setOil(int oil) {
		this.oil = oil;
	}

	public void singleTick() {
		oil -= amount / 5;
	}

	public void getStatus () {
	System.out.println(petName + " - " + description + " / Happiness: " + happiness + "Oil Level: " + oil + " / Health Level: " + health);
	}

}
