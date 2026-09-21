/*
 *	Author:Luke Castillote Chang
 *  Date:9/18/26
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter a integer:");
		int integer1 = sc.nextInt();
		System.out.print("Please enter another integer:");
		int integer2 = sc.nextInt();
		System.out.println("Your range is "+ integer1 + " to " + integer2);
		System.out.println("Here is 5 numbers generated in that range");
		System.out.print((int)(Math.random() * (integer2 - integer1) + integer1));
		System.out.print(", ");
		System.out.print((int)(Math.random() * (integer2 - integer1) + integer1));
		System.out.print(", ");
		System.out.print((int)(Math.random() * (integer2 - integer1) + integer1));
		System.out.print(", ");
		System.out.print((int)(Math.random() * (integer2 - integer1) + integer1));
		System.out.print(", ");
		System.out.print((int)(Math.random() * (integer2 - integer1) + integer1));


	}
}
