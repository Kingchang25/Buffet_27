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
			for(int i = 0; i < width; i++) {
				System.out.print("*");
			}
			System.out.println();
			height--;
		}
	}
}
