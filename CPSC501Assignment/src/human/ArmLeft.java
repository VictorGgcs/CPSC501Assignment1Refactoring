package human;

public class ArmLeft extends BodyPart {
	
	int energy;
	int life;
	
	
	public ArmLeft() {
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
