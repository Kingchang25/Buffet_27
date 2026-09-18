/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int gamble1 = (int)(Math.random()* 9 );
		int gamble2 = (int)(Math.random()* 10 + 1 );
		double gamble3 = (Math.random()* 1.0 +2.5 );
		System.out.print("A number between 0 and 9 is: ");
		System.out.println(gamble1);
		System.out.print("A number between 1 and 10 is: ");
		System.out.println(gamble2);
		System.out.print("A number between 2.5 and 3.5 is : ");
		System.out.println(gamble3);
	}
}
