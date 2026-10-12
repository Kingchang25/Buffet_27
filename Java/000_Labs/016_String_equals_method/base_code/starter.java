/*
 *	Author:  Luke Castillote Chang
 *  Date: 10/06/2026
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or a Rouge?");
		String choice = input.nextLine();
		if (choice.equals("Wizard")) {
			System.out.println("You've chose the Wizard! Excelsior!3");
		}
		else if (choice.equals("Warrior")) {
			System.out.println("You've chosen the Warrior! For Honor!");
		}
		else if (choice.equals("Rouge")) {
			System.out.println("You've chosen the Rouge! How cunning!");
		}
		else 
			System.out.println("You've decided not to chose a role. Rerun Program");
		}
	}
}
