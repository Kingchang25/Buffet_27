/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int shordi = (int)(Math.random()*1000 + 1);
		System.out.print("Guess the number: ");
		int muff = sc.nextInt();
		if(shordi == muff) {
			System.out.println("You Guessed the number! ");
		} 
		else if(shordi < muff) {
			System.out.println("Your number was larger than the number. The number was " + shordi);
		}
		else if(shordi > muff) {
			System.out.println("Your number was smaller than the number. The number was " + shordi);
		}
	}
}
