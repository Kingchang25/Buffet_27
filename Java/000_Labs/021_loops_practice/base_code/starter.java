/*
 *	Author:  Luke Castillote Chang
 *  Date: 10/15/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int randomnum = (int)(Math.random()*1000);
		String guess = sc.nextLine();
		while (guess != randomnum){
			System.out.println("try again");
			guess = sc.nextLine();
			if (guess == randomnum){
				System.out.println("You guessed the number!");
				break;
			}
		}
		System.out.println("You guessed the number!");
		



		
	}
}
