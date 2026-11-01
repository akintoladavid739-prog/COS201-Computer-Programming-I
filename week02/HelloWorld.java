/**
 * HelloWorld.java
 * Course: COS 201 — Computer Programming I
 * Week 2 Practical Exercise
 * 
 * Description:
 * An introductory Java program that demonstrates class structure, the main method,
 * and console output using System.out.println(). It displays course metadata,
 * academic details, and the practical learning goal.
 */
public class HelloWorld {

    public static void main(String[] args) {
        // EDITABLE PLACEHOLDER: Replace with your actual programme of study
        String programme = "[Your Programme: CSC / CYB / INS / SEN / ICH]";

        // Display course information and practical learning objective
        System.out.println("==================================================");
        System.out.println("COURSE       : COS 201");
        System.out.println("COURSE TITLE : Computer Programming I");
        System.out.println("PROGRAMME    : " + programme);
        System.out.println("WEEK         : 2");
        System.out.println("TOPIC        : Development Environment and Java");
        System.out.println("GOAL         : To learn how to write, compile, and run Java programs.");
        System.out.println("==================================================");
    }
}
