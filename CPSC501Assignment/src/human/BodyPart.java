package human;

public class BodyPart {
	private int life;
	private int energy;
	//Other attributes
	
	
	public int getLife(){
		return this.life;
	}
	public int getEnergy() {
		return this.energy;
	}
	
	
	public void changeLife(int x) {
		this.life = x;
	}
	
	public void changeEnergy(int x) {
		this.energy = x;
	}

}
