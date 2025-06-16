package Challenge;

import java.util.Scanner;

public class StringBuilder10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a string (at least 10 characters): ");
        String input = sc.nextLine();
        System.out.println();

        if (input.length() < 10) {
            System.out.println("String is too short.");
            sc.close();
            return;
        }

        StringBuilder sb = new StringBuilder(input);

        System.out.println("Length: " + sb.length());

        System.out.println("First character: " + sb.charAt(0));

        System.out.println("Last character: " + sb.charAt(sb.length() - 1));

        System.out.println("Index of first 'a': " + sb.indexOf("a"));

        System.out.println("Substring (3-6): " + sb.substring(3, 6));

        sb.append("123");

        sb.insert(4, "xyz");

        sb.delete(2, 4);

        if ( sb.length() > 8 ) {
            sb.deleteCharAt(8);
        } else {
            System.out.println("Index 8 is invalid.");
        }

        sb.reverse();

        System.out.println("Final reversed string: " + sb.toString());

        sc.close();
        System.out.println();
    }
}

