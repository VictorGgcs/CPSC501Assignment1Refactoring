package human;
import java.util.Random;

public class Head extends BodyPart {
	int energy;
	int life;
	
	
	public Head() {
		this.energy = 100;
		System.out.print(this.energy);
		this.life = 100;
	}
	
	
	public String think(){
		this.energy -= 10;
		String[] posIdea = {("Life"),("Purpose"),("Food"),("Work"),("Pizza"),("Computers")};
		Random ran = new Random();
		String thought = posIdea[ran.nextInt(6)];
		System.out.println("You thought about " + thought);
		return thought;
	}
	
	
	
	
	//public String something() {}
}
