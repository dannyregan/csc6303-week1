/*
 * References:
 * For getting user inputs:
 *  https://www.w3schools.com/java/java_user_input.asp
 * Iterate over characters of a string:
 *  https://www.geeksforgeeks.org/iterate-over-the-characters-of-a-string-in-java/
 * Covert String to int:
 *  https://www.geeksforgeeks.org/how-to-convert-string-to-int-in-java/
 */

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        menu(sc);
    }

    public static void menu(Scanner sc) {
        System.out.print("Enter a positive number (0 or negative to exit): ");
        try {
            double input = sc.nextDouble();
            System.out.println(input);
        } catch(Exception e) {
            System.exit(0);
        }

    }

    public static void menu() {
        System.out.print("Enter a positive number (0 or negative to exit): ");
    }
}