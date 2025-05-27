/*
 * __author__: Danny Regan
 
 * References:
 * For getting user inputs:
 *  https://www.w3schools.com/java/java_user_input.asp
 */

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter a positive number (0 or negative to exit): ");
            try {
                double input = sc.nextDouble();
                int inputI = (int) Math.floor(input);

                if (inputI <= 0) {
                    sc.close();
                    break;
                }
                
                if (inputI / input == 1) {
                    boolean res = isPrime(input);
                    showRes(res, inputI);

                } else {
                    boolean res = isPrime(input);
                    showRes(res, inputI);
                    menu();
                    sc.close();
                    break;

                }

            } catch(Exception e) {
                sc.close();
                System.exit(0);
            }
        } while (true);
    }

    public static void menu() {
        System.out.print("Enter a positive number (0 or negative to exit): ");
    }

    public static boolean isPrime(double n) {
        if (n <= 1)                     return false;
        if (n <= 3)                     return true;
        if (n % 2 == 0 || n % 3 ==0)    return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void showRes(boolean res, int n) {
        if (res) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}