package Task;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter a word, number, or other sequence of characters: ");
        String input = sc.nextLine();
        System.out.println();

        StringBuilder sb = new StringBuilder(input);
        sb.reverse();

        String reversed = sb.toString();

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("This input is a palindrome.");
        } else {
            System.out.println("This input is not a palindrome.");
        }

        sc.close();
        System.out.println();
    }
}
