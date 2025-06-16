package Challenge;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println();
        System.out.print("Enter a word: ");
        String input = sc.nextLine();
        System.out.println();

        System.out.println("Length of the string: " + input.length());

        System.out.println("Uppercase: " + input.toUpperCase());

        System.out.println("Lowercase: " + input.toLowerCase());

        System.out.println("First character: " + input.charAt(0));

        System.out.println("Last character: " + input.charAt(input.length() - 1));

        if (input.length() >= 5) {
            System.out.println("Substring (second to fifth): " + input.substring(1, 5)); 
        } else {
            System.out.println("String is too short to extract this substring.");
        }

        sc.close();
        System.out.println();
    }
}
