package human;

public class Leg extends BodyPart {

	

	
	public void kick() {
		this.energy -= 10;
		this.life += 10;
		System.out.println("Kick! You feel weaker");
	}
	
}
