/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double money = 100;
        String game = "";

        while (money > 0) {
            System.out.println("You have $" + money);
            System.out.println("What game do you want to play?");
            System.out.println("1. Slot Machine");
            System.out.println("2. Blackjack");
            System.out.println("3. Quit");
            System.out.print("Choose a game: ");
            game = input.nextLine();

            if (game.equals("1") ||
                game.equalsIgnoreCase("slots") ||
                game.equalsIgnoreCase("slot") ||
                game.equalsIgnoreCase("slot machine")) {

                money = slots(input, money);

            } else if (game.equals("2") ||
                       game.equalsIgnoreCase("blackjack")) {

                money = blackjack(input, money);

            } else if (game.equals("3") ||
                       game.equalsIgnoreCase("quit") ||
                       game.equalsIgnoreCase("exit")) {
                break;

            } else {
                System.out.println("Invalid choice!");
                continue;
            }

            System.out.println("You now have $" + money);

            if (money > 0) {
                System.out.print("Would you like to play another game? (Yes/No): ");
                game = input.nextLine();

                if (game.equalsIgnoreCase("no") ||
                    game.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }

        System.out.println("Game over! You leave with $" + money);
        
    }

    public static double slots(Scanner input, double money) {
        System.out.println("Welcome to the Slot Machine!");

        System.out.print("Enter your wager: $");
        double wager = input.nextDouble();
        input.nextLine();

        if (wager <= 0 || wager > money) {
            System.out.println("Invalid wager!");
            return money;
        }

        int a = (int)(Math.random() * 10) + 1;
        int b = (int)(Math.random() * 10) + 1;
        int c = (int)(Math.random() * 10) + 1;

        System.out.println("[" + a + "] [" + b + "] [" + c + "]");

        if (a == b && b == c) {
            System.out.println("JACKPOT! You win triple your wager!");
            money += wager * 2;
        } else if (a == b || a == c || b == c) {
            System.out.println("Two numbers match! You win double your wager!");
            money += wager;
        } else {
            System.out.println("No matches! You lose your wager.");
            money -= wager;
        }

        return money;
    }

    public static double blackjack(Scanner input, double money) {
        System.out.println("Welcome to Blackjack!");

        System.out.print("Enter your wager: $");
        double wager = input.nextDouble();
        input.nextLine();

        if (wager <= 0 || wager > money) {
            System.out.println("Invalid wager!");
            return money;
        }

        int player = (int)(Math.random() * 10) + 2;
        int dealer = (int)(Math.random() * 10) + 2;

        System.out.println("Your card total: " + player);
        System.out.println("Dealer's card: " + dealer);

        String answer = "hit";

        while (player < 21 && answer.equalsIgnoreCase("hit")) {
            System.out.print("Hit or stand? ");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("hit")) {
                int card = (int)(Math.random() * 10) + 2;
                player += card;

                System.out.println("You got " + card);
                System.out.println("Your total: " + player);
            }
        }

        if (player > 21) {
            System.out.println("Bust! You lose.");
            money -= wager;

        } else if (dealer > 21 || player > dealer) {
            System.out.println("You win!");
            money += wager;

        } else if (player == dealer) {
            System.out.println("It's a tie!");

        } else {
            System.out.println("Dealer wins!");
            money -= wager;
        }

        return money;
    }
}