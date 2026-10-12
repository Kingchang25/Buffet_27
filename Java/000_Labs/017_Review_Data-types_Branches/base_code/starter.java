/*
 *	Author:  Luke Castillote Chang
 *  Date: 10/06/2026
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = input.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or a Rogue?");
		String choice = input.nextLine();
		if (choice.equals("wizard") || choice.equals("Wizard")) {
			System.out.println("You've chose the Wizard! Excelsior!");
			System.out.println("You have 20 skill points to spend on the following: Strength, Dexterity, Intelligence, and Charisma");
			System.out.println("Strength (1-10)");
		int doodoo = 20;
			int strength = input.nextInt();
			if(strength<=10){
			System.out.println("You have " + (doodoo-strength)+" left to spend");
			}
			else if(strength>10){
				System.out.print("Please input a smaller value. Strength (1-10):");
				strength = input.nextInt();
				System.out.println("");
				System.out.println("You have " + (doodoo-strength) + " left to spend");
			}
		System.out.println("Dexterity (1-10)");
		int dexterity = input.nextInt();
		if(dexterity<=10){
			System.out.println("You have " + (doodoo-dexterity)+ "left to spend");
			}
			else if(dexterity>10){
				System.out.print("Please input a smaller value. Strength (1-10):");
				dexterity = input.nextInt();
				System.out.println("");
				System.out.println("You have " + (doodoo-dexterity) + " left to spend");
			}
			doodoo = doodoo-dexterity;
		System.out.println("Intelligence (1-10)");
		int intelligence = input.nextInt();
		if(intelligence<=10){
			System.out.println("You have " + (doodoo-intelligence)+ "left to spend");
			}
			else if(intelligence>10){
				System.out.print("Please input a smaller value. Strength (1-10):");
				dexterity = input.nextInt();
				System.out.println("");
				System.out.println("You have " + (doodoo-intelligence) + " left to spend");
			}
		doodoo = doodoo-intelligence;
		System.out.println("Charisma (1-10)");
		int charisma = input.nextInt();
		if(charisma<=10){
			System.out.println("You have " + (doodoo-charisma)+ "left to spend");
			}
			else if(charisma>10){
				System.out.print("Please input a smaller value. Strength (1-10):");
				charisma = input.nextInt();
				System.out.println("");
				System.out.println("You have " + (doodoo-charisma) + " left to spend");
			}
			doodoo = doodoo-charisma;
		System.out.println("You are " + name + ", " + title + " of CVHS");
		System.out.println("You're a " + choice + " with the following stats");
		System.out.println("Strength  " + strength);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Charisma - " + charisma);
		System.out.println("Good luck on your quest " + name + "!");
		}


		else if (choice.equals("warrior") || choice.equals("Warrior")) {
			System.out.println("You've chosen the Warrior! For Honor!");
				System.out.println("You have 20 skill points to spend on the following: Strength, Dexterity, Intelligence, and Charisma");
			System.out.println("Strength (1-10)");
		int doodoo = 20;
			int strength = input.nextInt();
			if(strength<=10){
			System.out.println("You have " + (doodoo-strength)+" left to spend");
			}
			else if(strength>10){
				System.out.print("Please input a smaller value. Strength (1-10):");
				strength = input.nextInt();
				System.out.println("");
				System.out.println("You have " + (doodoo-strength) + " left to spend");
			}
			doodoo = doodoo-strength;
		System.out.println("Dexterity (1-10)");
		int dexterity = input.nextInt();
		if(dexterity<=10){
			System.out.println("You have " + (doodoo-dexterity)+ "left to spend");
			}
			else if(dexterity>10){
				System.out.print("Please input a smaller value. Strength (1-10):");
				dexterity = input.nextInt();
				System.out.println("");
				System.out.println("You have " + (doodoo-dexterity) + " left to spend");
			}
			doodoo = doodoo-dexterity;
		System.out.println("Intelligence (1-10)");
		int intelligence = input.nextInt();
		if(intelligence<=10){
			System.out.println("You have " + (doodoo-intelligence)+ "left to spend");
			}
			else if(intelligence>10){
				System.out.print("Please input a smaller value. Strength (1-10):");
				dexterity = input.nextInt();
				System.out.println("");
				System.out.println("You have " + (doodoo-intelligence) + " left to spend");
			}
		doodoo = doodoo-intelligence;
		System.out.println("Charisma (1-10)");
		int charisma = input.nextInt();
		if(charisma<=10){
			System.out.println("You have " + (doodoo-charisma)+ "left to spend");
			}
			else if(charisma>10){
				System.out.print("Please input a smaller value. Strength (1-10):");
				charisma = input.nextInt();
				System.out.println("");
				System.out.println("You have " + (doodoo-charisma) + " left to spend");
			}
			doodoo = doodoo-charisma;
		System.out.println("You are " + name + ", " + title + " of CVHS");
		System.out.println("You're a " + choice + " with the following stats");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Charisma - " + charisma);
		System.out.println("Good luck on your quest " + name + "!");
		}
		else if (choice.equals("rogue") || choice.equals("Rogue")) {
			System.out.println("You've chosen the Rogue! Cheeky Boy!");
				System.out.println("You have 20 skill points to spend on the following: Strength, Dexterity, Intelligence, and Charisma");
			System.out.println("Strength (1-10)");
		int doodoo = 20;
			int strength = input.nextInt();
			if(strength<=10){
			System.out.println("You have " + (doodoo-strength)+" left to spend");
			}
			else if(strength>10){
				System.out.print("Please input a smaller value. Strength (1-10):");
				strength = input.nextInt();
				System.out.println("");
				System.out.println("You have " + (doodoo-strength) + " left to spend");
			}
		System.out.println("Dexterity (1-10)");
		int dexterity = input.nextInt();
		doodoo = doodoo-strength;
		if(dexterity<=10){
			System.out.println("You have " + (doodoo-dexterity)+ "left to spend");
			}
			else if(dexterity>10){
				System.out.print("Please input a smaller value. Strength (1-10):");
				dexterity = input.nextInt();
				System.out.println("");
				System.out.println("You have " + (doodoo-dexterity) + " left to spend");
			}
			doodoo = doodoo-dexterity;
		System.out.println("Intelligence (1-10)");
		int intelligence = input.nextInt();
		if(intelligence<=10){
			System.out.println("You have " + (doodoo-intelligence)+ "left to spend");
			}
			else if(intelligence>10){
				System.out.print("Please input a smaller value. Strength (1-10):");
				dexterity = input.nextInt();
				System.out.println("");
				System.out.println("You have " + (doodoo-intelligence) + " left to spend");
			}
		doodoo = doodoo-intelligence;
		System.out.println("Charisma (1-10)");
		int charisma = input.nextInt();
		if(charisma<=10){
			System.out.println("You have " + (doodoo-charisma)+ "left to spend");
			}
			else if(charisma>10){
				System.out.print("Please input a smaller value. Strength (1-10):");
				charisma = input.nextInt();
				System.out.println("");
				System.out.println("You have " + (doodoo-charisma) + " left to spend");
			}
			doodoo = doodoo-charisma;
		System.out.println("You are " + name + ", " + title + " of CVHS");
		System.out.println("You're a " + choice + " with the following stats");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Charisma - " + charisma);
		System.out.println("Good luck on your quest " + name + "!");
		}

		else 
			System.out.println("You've decided not to chose a role. Rerun Program");
		}
		

	}