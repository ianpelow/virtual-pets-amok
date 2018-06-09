
public class VirtualPet {
	
	private String name;
	private String description;
	private int HEALTH_LEVEL = 100;
	protected int health = HEALTH_LEVEL;
	protected int happiness;

	public VirtualPet(String name, String description, int health, int happiness) {
		super();
		this.name = name;
		this.description = description;
		this.health = health;
		this.happiness = happiness;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHealth() {
		return health;
	}

	public int getHappiness() {
		return happiness;
	}
	
	public void singleTick() {
		happiness -= 2;
		health -= 2;
		
	}

	public int getHunger() {
		return 0;
	}

	public int getThirst() {
		return 0;
	}
	
////	public void getStatus () {
////		System.out.println(petName + " - " + description + " / Hunger: " +  hunger + " / Thirst " + thirst + " / Boredom: " + boredom);
//
//}


		
	}
