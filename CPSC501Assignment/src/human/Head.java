package human;
import java.util.Random;

public class Head extends BodyPart {
	private Random ran;
	private String[] posIdea;
	
	
	public Head() {
		this.changeEnergy(100);
		this.changeLife(100);
		this.ran = new Random();
		this.posIdea = new String[] {"Life","Purpose","Food","Work","Pizza","Computers"};
	}
	
	
	public String think(){
		this.changeEnergy( this.getEnergy() - 10);
		
		String thought = chooseRandomWord();
		System.out.println("You thought about " + thought);
		return thought;
	}
	
	
	
	
	public String chooseRandomWord() {
		return posIdea[ran.nextInt(6)];
	}
	
	
	
	
	//public String something() {}
}
