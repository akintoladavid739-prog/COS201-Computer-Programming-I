import java.util.Scanner;

/**
 * SimpleCalculator.java
 * Course: COS 201 — Computer Programming I
 * Week 3 Practical Exercise 1
 * 
 * Description:
 * An interactive console calculator that receives two floating-point numbers
 * from the user, calculates their sum, difference, product, and quotient,
 * and formats the output to two decimal places.
 * 
 * Boundary & Error Handling:
 * Demonstrates safe arithmetic by checking whether the divisor is zero before
 * attempting division, preventing invalid arithmetic states.
 */
public class SimpleCalculator {

    public static void main(String[] args) {
        // Create Scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        System.out.println("=== COS 201 SIMPLE CALCULATOR ===");

        // Receive two numeric operands from user
        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        // Perform arithmetic calculations
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;

        // Display results formatted to two decimal places
        System.out.println("\n--- CALCULATION RESULTS ---");
        System.out.printf("First Number  : %.2f%n", firstNumber);
        System.out.printf("Second Number : %.2f%n", secondNumber);
        System.out.printf("Sum           : %.2f%n", sum);
        System.out.printf("Difference    : %.2f%n", difference);
        System.out.printf("Product       : %.2f%n", product);

        // Division safety check: Prevent division by zero
        if (secondNumber != 0.0) {
            double quotient = firstNumber / secondNumber;
            System.out.printf("Quotient      : %.2f%n", quotient);
        } else {
            System.out.println("Quotient      : Division is undefined for a zero divisor.");
        }
        System.out.println("---------------------------");

        // Clean up Scanner resource
        input.close();
    }
}
