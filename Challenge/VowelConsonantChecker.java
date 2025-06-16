package Challenge;

import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter a letter: ");
        char ch = sc.next().charAt(0);
        System.out.println();

        // Check if the character is a letter
        if (Character.isLetter(ch)) {
            if (ch == 'a' || ch == 'e' ||
                ch == 'i' || ch == 'o' ||
                ch == 'u' ||
                ch == 'A' || ch == 'E' ||
                ch == 'I' || ch == 'O' ||
                ch == 'U') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println(ch + " is not a letter.");
        }

        sc.close();
        System.out.println();
    }
}

