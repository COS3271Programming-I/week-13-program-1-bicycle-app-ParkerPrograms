package Week13;
import java.util.Scanner;

public class Bicycle_App {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		String owner, type;
		int cadence, gear, speed;
		String answer = "0";
		
		//get initial information from the user
		System.out.print("Enter your name: ");
		owner = userinput.nextLine();
		System.out.print("Enter the type of bicycle you own: ");
		type = userinput.nextLine();
		//create an instance of the Bicycle class
		Bicycle bike1 = new Bicycle(0,0,5,type,owner);
		
		while (!answer.equals("4")) {
			//display options for user to select
			System.out.println("\n1 - Update cadence");
			System.out.println("2 - Update gear");
			System.out.println("3 - Update speed");
			System.out.println("4 - End bike ride");
			System.out.print("Enter the number of an action: ");
			answer = userinput.nextLine();
			//get new cadence
			if (answer.equals("1")) {
				System.out.print("Enter your current cadence: ");
				cadence = userinput.nextInt();
				userinput.nextLine();
				bike1.cadence = cadence;
			}
			//get new gear
			if (answer.equals("2")) {
				System.out.print("Enter your current gear: ");
				gear = userinput.nextInt();
				userinput.nextLine();
				bike1.gear = gear;
			}
			//get new speed
			if (answer.equals("3")) {
				System.out.print("Enter your current speed: ");
				speed = userinput.nextInt();
				userinput.nextLine();
				bike1.speed = speed;
			answer = "0";	
			}
			//display bike information
			System.out.println("\n" + bike1.getInfo());
		}
		System.out.println("Ending bike ride...");
	}
}
