import java.util.Scanner;
    Lecture note example - Input!!



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
        System.out.println("How many sashimi would you like to order?");
        int order2 = sc.nextInt();
        System.out.println("How many miso soups would you like to order?");
        int order3 = sc.nextInt();



        
	}
}
