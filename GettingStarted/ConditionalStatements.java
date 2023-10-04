import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initialize Scanner to read from the console
        System.out.println("Enter your age: "); // Prompt the user to enter their age
        int age = scanner.nextInt(); // Read the age from the user's input
        
        if (age >= 75) {
            System.out.println("Ok Boomer");
        } else if (age >= 18) {
            System.out.println("You're an Adult");
        } else if (age >= 13) {
            System.out.println("You're a teenager");
        } else {
            System.out.println("You're a kid");
        }
        
        scanner.close(); // Close the Scanner to release resources
    }
}
