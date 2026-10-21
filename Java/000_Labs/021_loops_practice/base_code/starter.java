/*
 *	Author:  Luke Castillote Chang
 *  Date: 10/15/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int randomnum = (int)(Math.random()*1000)+1;
		System.out.print("Guess a number between 1 and 1000: ");
		int guess = sc.nextInt();
		while (guess != randomnum){
			if(guess > randomnum){
				System.out.println("too high, try again");
				guess = sc.nextInt();
			}
			if(guess < randomnum){
				System.out.println("too low, try again");
				guess = sc.nextInt();
			}
			if (guess == randomnum){
				break;
			}
			
		}
		System.out.println("You guessed the number! It was: " + randomnum);
		
	}
}
