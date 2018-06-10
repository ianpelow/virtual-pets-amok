
public class Robotic extends VirtualPet {

	private int OIL_LEVEL = 100;
	private int oil = OIL_LEVEL;
	protected int amount = 10;

	public Robotic(String name, String description, int happiness, int health, int oil) {
		super(name, description, health, happiness, health, oil);
		this.oil = oil;
	}
	
	@Override
	public int oilPet() {
		oil += amount;
		return oil;
	}
	
	@Override
	public void getStatus () {
	System.out.println(getPetName() + " - " + getDescription() + " / Happiness: " + getHappiness() + " / Oil Level: " + oil + " / Health Level: " + getHealth());
	}

}
