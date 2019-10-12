package human;

public class Torso extends BodyPart {
	int energy;
	int life;
	
	
	public Torso() {
		energy = 100;
		life = 100;
	}
	
	
	public void stretch() {
		this.energy -= 20;
		this.life += 20;
		System.out.println("Stretch! You feel great!");
	}
	
}
