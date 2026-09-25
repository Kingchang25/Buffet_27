/*
 *	Author: Luke Castillote Chang
 *  Date: 9/22/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int numero1 =5;
		int numero2 =10;
		boolean different = numero1 != numero2;
		boolean same = numero1 == numero2;
		if(different) {	
			System.out.println("the first variable is: " + numero1);
			System.out.println("the second variable is: " + numero2);
			System.out.println("The variables are different");
		}
		if(same) {
			System.out.println("the first variable is: " + numero1);
			System.out.println("the second variable is:" + numero2);
			System.out.println("The variables are the same");
		}

	}
}
