package Challenge;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println();

        if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            if (number > 0) {
                System.out.println("The number is positive.");
            } else {
                System.out.println("The number is negative.");
            }

            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        }

        sc.close();
        System.out.println();
    }
}

