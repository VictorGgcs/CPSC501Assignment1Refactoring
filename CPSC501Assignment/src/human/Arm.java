package human;

public class Arm extends BodyPart{
	
	
	public void punch() {
		this.energy -= 10;
		this.life += 10;
		System.out.println("Punch! You feel weaker");
	}
}
