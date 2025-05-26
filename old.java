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

public class old {
    public static void main(String[] args) {
        boolean res;
        do {
            res = old.menu();
        } while (res);
    }

    public static boolean menu() {
        String sNum = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number (0 or negative to exit): ");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '.' && i == 0) {
                break;
            }
            if (input.charAt(i) == '.') {
                int n = Integer.parseInt(sNum);
                wasFloat(n);
                return false;
            } else {
                sNum += input.charAt(i);
            }
            int n = Integer.parseInt(sNum);
            wasNotFloat(n);
        }
        sc.close();
        return true;
    }

    public static void menu(boolean f) {
        System.out.print("Enter a positive number (0 or negative to exit): ");
    }

    public static boolean isPrime(int n) {
        if (n <= 1)                     return false;
        if (n <= 3)                     return true;
        if (n % 2 == 0 || n % 3 ==0)    return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void wasFloat(int n) {
        boolean res = isPrime(n);
        showRes(res, n);
        menu(false);
    }

    public static void wasNotFloat(int n) {
        boolean res = isPrime(n);
        showRes(res, n);
        menu();
    }

    public static void showRes(boolean res, int n) {
        if (res) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}



/*
 * present menu
 * intake number
 * check if there's a period or not.
 *      convert to int
 *      check if its prime
 *      display output
 *      present menu
 *      intake %
 *      quit
 * convert it to int
 * check if its prime
 * restart
 * 
 * 
 * main calls menu
 * menu can take a param or not
 * checks if theres a period or not
 * if there is, it goes to one func which checks prime then calls menu with %, otherwise a diff one that just checks prime then calls menu alone
 * 
 */