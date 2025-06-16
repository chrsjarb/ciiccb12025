package Challenge;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println();
        System.out.print("Enter an integer (0 to get the sum): ");
        number = sc.nextInt();

        while (number != 0) {
            sum += number;
            System.out.print("Enter another integer (0 to get the sum): ");
            number = sc.nextInt();
        }

        System.out.println("The sum of all inputs is: " + sum);
        sc.close();
        System.out.println();
    }
}

