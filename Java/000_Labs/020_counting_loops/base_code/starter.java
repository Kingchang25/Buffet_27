/*
 *	Author:  Luke Castillote Chang
 *  Date: 10/14/26
*/
import java.util.*;

public class starter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("How many times should we print your name? ");
        int times = sc.nextInt();

        int count = 0;

        while (true) {
            System.out.println(name);
            count++;

            if (count == times) {
                break;
            }
        }
    }
}