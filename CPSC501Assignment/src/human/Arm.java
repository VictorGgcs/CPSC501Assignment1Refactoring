package human;

public class Arm extends BodyPart{
	
	
	public void punch() {
		this.changeEnergy( this.getEnergy() - 10);
		this.changeLife( this.getLife() - 10);
		System.out.println("Punch! You feel weaker");
	}
}
