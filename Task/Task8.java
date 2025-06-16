package Task;

import java.util.Scanner;

public class Task8 {

    static int sumNumbers(int... numbers) {
        int total = 0;

        for (int number : numbers) {
            int cumulative = 0;

            for (int i = 1; i <= number; i++) {
                cumulative += i;
            }

            System.out.println("Cumulative sum up to " + number + " = " + cumulative);
            total += number;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n" + "Enter number of parameters: ");
        int n = sc.nextInt();
        System.out.println();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": " );
            arr[i] = sc.nextInt();
        }

        int sum = sumNumbers(arr);
        System.out.println("\n" + "Total sum of all parameters = " + sum  + "\n");

        sc.close();
    }
}

