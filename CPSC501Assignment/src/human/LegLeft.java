package human;

public class LegLeft extends BodyPart {

	int energy;
	int life;
	
	
	public LegLeft() {
		energy = 100;
		life = 100;
	}
	
	
	public void kick() {
		this.energy -= 10;
		this.life += 10;
		System.out.println("Kick! You feel weaker");
	}
	
	

}
