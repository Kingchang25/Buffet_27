/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int netanyahu = (int)(Math.random()*1000 + 1);
		System.out.print("Guess the number: ");
		int star = sc.nextInt();
		if(star == netanyahu) {
			System.out.print("You Guessed the number!");
		} else {
			System.out.print("Your number wasn't the random number. The number was " + netanyahu);
		}
	}
}
