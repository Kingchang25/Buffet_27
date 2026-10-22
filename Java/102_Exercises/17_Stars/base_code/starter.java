/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a width:");
		int width = sc.nextInt();
		System.out.print("Please enter a height:");
		int height = sc.nextInt();
		while(height > 0) {
			int i = 0;
			while(i < width) {
				System.out.print("*");
				i++;
			}
			System.out.println();
			height--;
		}
		System.out.println("------------------------------------------------------------");
		System.out.print("Please enter a integer:");
		int integer = sc.nextInt();
		int c1 =1;
		while(c1 <= integer) {
			int c2 = 1;
			while(c2 <= c1) {
				System.out.print("*");
				c2++;
			}
			System.out.println();
			c1++;
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("Reversed Star:");
		System.out.print("Please enter an intger: ");
		integer = sc.nextInt();

		while(c1 <= integer) {
			int c2 = 1;
			while(c2 <= c1) {
				System.out.print("*");
				c2++;
			}
			System.out.println();
			c1++;
		}
		while(c1 <= integer) {
			int c2 = 1;
			while(c2 <= integer - c1 + 1) {
				System.out.print("*");
				c2++;
			}
			System.out.println();
					c1++;
		}

	}
}