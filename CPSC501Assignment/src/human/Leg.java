package human;

public class Leg extends BodyPart {

	

	
	public void kick() {
		this.changeEnergy( this.getEnergy() - 10);
		this.changeLife( this.getLife() - 10);
		System.out.println("Kick! You feel weaker");
	}
	
}
