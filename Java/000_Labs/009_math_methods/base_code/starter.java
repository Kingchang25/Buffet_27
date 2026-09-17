/*
 *	Author:  Luke Castillote Chang
 *  Date: 9/16/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int maxValue = Math.max(-8, -4);
        double sqrtValue = Math.sqrt(3*8+31%7);
        double powerValue = Math.pow((37/3), (35%21) );
        double maxDouble = Math.max(Math.pow(2,14%3), Math.sqrt(2*6));

        System.out.println("Maximum = " + maxValue);
        System.out.println("Square root = " + sqrtValue);
        System.out.println("Power = " + powerValue);
        System.out.println("Max double = " + maxDouble);
	}
}
