package Challenge;

import java.util.Scanner;

public class SumAndAverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        System.out.println();

        int[] arr = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / size;

        System.out.println();
        System.out.println("Sum of array elements = " + sum);
        System.out.println("Average of array elements = " + average);

        sc.close();
        System.out.println();
    }
}

