package Task;

import java.util.Scanner;

public class Task7 {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double division(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n" + "Input two numbers" + "\n");

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("\n" + "Addition: " + add(num1, num2)); 
        System.out.println("Subtraction: " + subtract(num1, num2)); 
        System.out.println("Multiplication: " + multiply(num1, num2)); 
        System.out.println("Division: " + division(num1, num2) + "\n");

        sc.close();

    }
}
