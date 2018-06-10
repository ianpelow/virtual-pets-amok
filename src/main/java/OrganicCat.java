
public class OrganicCat extends Organic {

	public OrganicCat(String name, String description, int health, int happiness) {
		super(name, description, health, happiness);
	}
	
	public int getEmptyLitterBox() {
		return waste;
	}

	public void setEmptyLitterBox(int waste) {
		this.waste = waste;
	}
	
	public int emptyLitterBox() {
		health += amount / 2;
		waste -= amount;
		happiness += amount / 2;
		return waste;
	}
	
	public void wasteInLitterBoxTick() {
		waste -= amount / 5;
	}

}
