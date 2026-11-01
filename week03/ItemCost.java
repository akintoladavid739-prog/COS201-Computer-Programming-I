import java.util.Scanner;

/**
 * ItemCost.java
 * Course: COS 201 — Computer Programming I
 * Week 3 Practical Exercise 3
 * 
 * Description:
 * Calculates total purchasing cost given an item name, integer quantity,
 * and floating-point unit price. Demonstrates data typing, arithmetic
 * multiplication, input validation, and formatted currency-like output.
 * 
 * Input Validation:
 * Enforces positive integer quantities (quantity > 0) and non-negative
 * unit prices (unitPrice >= 0.0).
 * 
 * Educational Scope & Financial Note:
 * This program serves as a beginner classroom demonstration using standard
 * double precision. In commercial, mission-critical financial applications,
 * specialized types (such as java.math.BigDecimal) are preferred to avoid
 * binary floating-point rounding inaccuracies.
 */
public class ItemCost {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== COS 201 ITEM COST CALCULATOR ===");

        // Request item name
        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        // Prompt and validate quantity (must be a positive integer)
        System.out.print("Enter quantity (integer > 0): ");
        int quantity = input.nextInt();
        while (quantity <= 0) {
            System.out.print("Invalid quantity! Must be at least 1. Re-enter quantity: ");
            quantity = input.nextInt();
        }

        // Prompt and validate unit price (must be non-negative)
        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();
        while (unitPrice < 0.0) {
            System.out.print("Invalid price! Unit price cannot be negative. Re-enter unit price: ");
            unitPrice = input.nextDouble();
        }

        // Calculate total cost
        double totalCost = quantity * unitPrice;

        // Display structured purchase summary
        System.out.println("\n----------------------------------------");
        System.out.println("            PURCHASE SUMMARY            ");
        System.out.println("----------------------------------------");
        System.out.println("Item Name   : " + itemName);
        System.out.println("Quantity    : " + quantity);
        System.out.printf("Unit Price  : %.2f%n", unitPrice);
        System.out.printf("Total Cost  : %.2f%n", totalCost);
        System.out.println("----------------------------------------");

        // Close scanner resource
        input.close();
    }
}
