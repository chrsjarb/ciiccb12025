package Task;

import java.util.Scanner;

public class ScoreToGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Enter the student's score: ");
            int score = scan.nextInt();

            char grade;
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Grade: " + grade);

            System.out.println("Do you want to enter another score? (yes/no): ");
            scan.nextLine(); 
            choice = scan.nextLine().trim().toLowerCase();

        } while (choice.equals("yes"));

        System.out.println("Job well done!");
        scan.close();
    }
}
