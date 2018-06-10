
public class OrganicDog extends Organic {

	public OrganicDog(String name, String description, int hunger, int thirst, int happiness, int health) {
		super(name, description, hunger, thirst, happiness, health);
	}

	public void walkDogs() {
		happiness += amount / 2;
		waste += amount /2;
	}
	

}
