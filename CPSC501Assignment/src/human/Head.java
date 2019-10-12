package human;
import java.util.Random;

public class Head extends BodyPart {
	int energy;
	int life;
	private Random ran;
	private String[] posIdea;
	
	
	public Head() {
		this.energy = 100;
		System.out.print(this.energy);
		this.life = 100;
		this.ran = new Random();
		this.posIdea = new String[] {"Life","Purpose","Food","Work","Pizza","Computers"};
	}
	
	
	public String think(){
		this.energy -= 10;
		String thought = chooseRandomWord();
		System.out.println("You thought about " + thought);
		return thought;
	}
	
	
	
	
	public String chooseRandomWord() {
		return posIdea[ran.nextInt(6)];
	}
	
	
	
	
	//public String something() {}
}
