public class VirtualPet {

	private String petName;
	private String description;
	protected int happiness;
	private int HEALTH_LEVEL = 100;
	protected int health = HEALTH_LEVEL;
	private int amount = 10;

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

	public int getHappiness() {
		return happiness;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth() {
		this.health = health;
	}

	public int playWithPet() {
		happiness += amount;
		return happiness;
	}

	public VirtualPet(String petName, String description, int hunger, int thirst, int happiness, int health) {
				super();
				this.petName = petName;
				this.description = description;
				this.happiness = happiness;	
				this.health = health;
			}

	public void singleTick() {
		happiness -= 2;
	}

	public int feedPet() {
		return 0;
	}
	
	public int waterPet() {
		return 0;
	}

	public int oilPet() {
		return 0;
	}

	public void getStatus() {	
	}

	public int getHunger() {
		return 0;
	}

	public int getThirst() {
		return 0;
	}

	public int cleanDogCage() {
		return 0;
	}

	public int walkDog() {
		return 0;
	}
	
	public int cleanLitterBox() {
		return 0;
	}
	

	
			
}