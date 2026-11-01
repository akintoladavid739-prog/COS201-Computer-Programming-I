import java.util.Scanner;

/**
 * AverageCalculator.java
 * Course: COS 201 — Computer Programming I
 * Week 3 Practical Exercise 2
 * 
 * Description:
 * Interactive program that collects a student's name and three course scores,
 * validates that each score lies in the standard academic range (0 to 100),
 * computes the sum and arithmetic average using floating-point arithmetic,
 * and formats the output cleanly.
 * 
 * Validation:
 * Implements input validation loops for each course score. Any value below 0
 * or above 100 is rejected with a descriptive prompt until a valid score is supplied.
 */
public class AverageCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== COS 201 STUDENT AVERAGE CALCULATOR ===");

        // Request student name
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        // Prompt and validate Course Score 1
        System.out.print("Enter score for Course 1 (0 - 100): ");
        double score1 = input.nextDouble();
        while (score1 < 0.0 || score1 > 100.0) {
            System.out.print("Invalid score! Must be between 0 and 100. Re-enter Course 1 score: ");
            score1 = input.nextDouble();
        }

        // Prompt and validate Course Score 2
        System.out.print("Enter score for Course 2 (0 - 100): ");
        double score2 = input.nextDouble();
        while (score2 < 0.0 || score2 > 100.0) {
            System.out.print("Invalid score! Must be between 0 and 100. Re-enter Course 2 score: ");
            score2 = input.nextDouble();
        }

        // Prompt and validate Course Score 3
        System.out.print("Enter score for Course 3 (0 - 100): ");
        double score3 = input.nextDouble();
        while (score3 < 0.0 || score3 > 100.0) {
            System.out.print("Invalid score! Must be between 0 and 100. Re-enter Course 3 score: ");
            score3 = input.nextDouble();
        }

        // Compute total and floating-point average (divided by 3.0 to prevent integer truncation)
        double total = score1 + score2 + score3;
        double average = total / 3.0;

        // Display formatted student result card
        System.out.println("\n----------------------------------------");
        System.out.println("             STUDENT RESULT             ");
        System.out.println("----------------------------------------");
        System.out.println("Student Name : " + name);
        System.out.printf("Score 1      : %.2f%n", score1);
        System.out.printf("Score 2      : %.2f%n", score2);
        System.out.printf("Score 3      : %.2f%n", score3);
        System.out.printf("Total Score  : %.2f%n", total);
        System.out.printf("Average Score: %.2f%n", average);
        System.out.println("----------------------------------------");

        // Close scanner
        input.close();
    }
}
