
public class RoboticDog extends Robotic {

	public RoboticDog(String name, String description, int happiness, int health, int oil) {
		super(name, description, happiness, health, oil);
	}

	public void walkDogs() {
		happiness += amount / 2;
	}

}
