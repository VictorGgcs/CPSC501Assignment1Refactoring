package human;
import java.util.*;
import java.util.concurrent.TimeUnit;


/*
 * Program simulates giving commands to the human body
 * 		doing a action results in a trade off, changing values within that body part
 *
 */



public class MainInteraction {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 					//Takes input from user

		//Beginning of IO
		System.out.println("Welcome to the human simulation");		//Instantiate Human, interract with human
		System.out.println("...");
		waitSec(3);
		System.out.println("...");
		waitSec(1);
		
		
		CreateHuman human = new CreateHuman();
		System.out.println("Human created");
		
		
		dispOptions();
		while (human.head.energy > 0) {
			//Cycle through possible options until human dies or quits
			System.out.println("What would you like to do?");
			
			
			String action = input.nextLine();
			action = action.toLowerCase();
			String[] actionM = action.split(" ");
			//Modify string to array or just string\
			
			
			if (actionM.length == 2){
				//Specify options
				if (actionM[0].equals("head")) {
					if (actionM[1].equals("think")) {
						human.head.think();
					}
				}
				
				else if (actionM[0].equals("armleft")) {
					if (actionM[1].equals("punch")) {
						human.armLeft.punch();
					}
				}
				
				else if (actionM[0].equals("armright")) {
					if (actionM[1].equals("punch")) {
						human.armRight.punch();
					}
				}
				
				else if (actionM[0].equals("leftleg")) {
					if (actionM[1].equals("kick")) {
						human.legLeft.kick();
					}
				}
				
				else if (actionM[0].equals("rghtleg")) {
					if (actionM[1].equals("kick")) {
						human.legRight.kick();
					}
				}
				
				
				
			} else if (actionM.length == 1) {
				if (actionM[0].equals("think")) {
					human.head.think();
				}
				
				else if (actionM[0].equals("stretch")){
					human.torso.stretch();
				}
			}
				
				
			
			waitSec(2);
			dispOptions();
			
		}//leaves when head runs out of energy
		System.out.println("The human is dead. (END)");

	}
	
	
	
	
	public static void dispOptions() {
		System.out.println("Theese are your options:"
				+ "\n	think"
				+ "\n	stretch"
				+ "\n	head think"
				+ "\n	torso stretch"
				+ "\n	armleft punch"
				+ "\n	armright punch"
				+ "\n	legleft kick"
				+ "\n	legright kick"
		);
	}

	
	public static void waitSec(int x) {
		try {
			TimeUnit.SECONDS.sleep(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}

