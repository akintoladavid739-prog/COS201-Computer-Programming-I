import java.util.Scanner;

/**
 * StudentProfile.java
 * Course: COS 201 — Computer Programming I
 * Week 2 Practical Exercise
 * 
 * Description:
 * An interactive console application that accepts student academic details
 * (name, programme of study, and course code) via keyboard input and formats
 * them into a clean student profile card.
 * 
 * Security & Best Practice Note:
 * This program does not hard-code private personal credentials. All information
 * is dynamically supplied by the student at runtime.
 */
public class StudentProfile {

    public static void main(String[] args) {
        // Create a Scanner object to capture keyboard input
        Scanner input = new Scanner(System.in);

        System.out.println("=== STUDENT PROFILE INPUT ===");

        // Prompt and read student's full name
        System.out.print("Enter your full name: ");
        String studentName = input.nextLine();

        // Prompt and read programme of study
        System.out.print("Enter your programme of study: ");
        String programme = input.nextLine();

        // Prompt and read course code
        System.out.print("Enter course code (e.g., COS 201): ");
        String courseCode = input.nextLine();

        // Display the collected information in a structured profile card
        System.out.println();
        System.out.println("========================================");
        System.out.println("            STUDENT PROFILE             ");
        System.out.println("========================================");
        System.out.println("Full Name   : " + studentName);
        System.out.println("Programme   : " + programme);
        System.out.println("Course Code : " + courseCode);
        System.out.println("Status      : Active Coursework Participant");
        System.out.println("========================================");

        // Close the scanner resource to prevent memory leaks
        input.close();
    }
}
