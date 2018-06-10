public class VirtualPet {

	protected String petName;
	protected String description;
	private int HEALTH_LEVEL = 100;
	protected int health = HEALTH_LEVEL;
	protected int happiness;
	private int amount = 10;

	public VirtualPet(String name, String description, int health, int happiness) {
		super();
		this.petName = name;
		this.description = description;
		this.health = health;
		this.happiness = happiness;
	}

	public String getPetName() {
		return petName;
	}

	public String setPetName(String petName) {
		return petName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getHappiness() {
		return happiness;
	}
	
	public void setHappiness(int happiness) {
		this.happiness = happiness;	
	}


	public int playWithPet() {
		happiness += amount;
		return happiness;
	}

	

	public void singleTick() {
		happiness -= 2;
		health -= 2;
	}

	public void getStatus() {
		return;
	}

	public int getHunger() {
		return getHunger();
	}
	
	public int getThirst() {
		return getThirst();
	}

	public void feedPet() {
	}

	public void waterPet() {	
	}
	
	public void oilAllRobots() {
	}


}


		

