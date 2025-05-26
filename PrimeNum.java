import java.util.Scanner;

public class PrimeNum {
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
