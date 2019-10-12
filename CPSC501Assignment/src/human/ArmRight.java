package human;

public class ArmRight extends BodyPart  {

	int energy;
	int life;
	
	
	public ArmRight() {
		energy = 100;
		life = 100;
	}
	
	
	public void punch() {
		this.energy -= 10;
		this.life += 10;
		System.out.println("Punch! You feel weaker");
	}
	
	
	
	public void grab() {
		//reduce energy
	}
}
