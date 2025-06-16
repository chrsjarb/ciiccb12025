package Challenge;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();
        System.out.println();

        if (sentence.isEmpty()) {
            System.out.println("Word count: 0");

        } else {
            String[] words = sentence.split("\\s+");

            System.out.println("Word count: " + words.length);
        }

        sc.close();
        System.out.println();
    }
}
