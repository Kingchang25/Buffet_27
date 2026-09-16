import java.util.Scanner;



class LectureInput{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To Changs Sushi");
        System.out.println("Here's our menu: ");
        System.out.println("1. Sushi Roll - ");
        double item1Price = 5.99;
        System.out.println(item1Price);

        System.out.println("2. Sashimi - ");
        double item2Price = 11.99;
        System.out.println(item2Price);

        System.out.println("3. Miso Soup - ");
        double item3Price = 3.99;
        System.out.println(item3Price);

        System.out.println("How many sushi rolls would you like to order?");
        Scanner sc =new Scanner(System.in);
        int order1 = sc.nextInt();
        System.out.println("Item 1 total is: " + (order1 * item1Price));
        System.out.println("How many sashimi would you like to order?");
        int order2 = sc.nextInt();
        System.out.println("Item 2 total is: " + (order2 * item2Price));
        System.out.println("How many miso soups would you like to order?");
        int order3 = sc.nextInt();
        System.out.println("Item 3 total is: " + (order3 * item3Price));

Double grandTotal = (order1 * item1Price) + (order2 * item2Price) + (order3 * item3Price);
        System.out.println("How much would you like to tip?");
        double tip = sc.nextDouble();
        tip = tip / 100 * grandTotal;
        System.out.println("Your total is: " + (grandTotal + tip));
	}
}
