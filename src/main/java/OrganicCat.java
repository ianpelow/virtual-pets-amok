
public class OrganicCat extends Organic {

	public OrganicCat(String name, String description, int hunger, int thirst, int happiness, int health) {
		super(name, description, hunger, thirst, happiness, health);
	}
	
	public void cleanLitterBoxes() {
		waste += amount;
		happiness += amount / 5;
		health += amount / 2;
	}

}
