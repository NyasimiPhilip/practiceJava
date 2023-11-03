import java.util.Scanner; // Import the Scanner class to read user input

public class customexceptions {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); // Create a Scanner object to read input from the console
        System.out.print("Enter your age: "); // Display a message asking the user to enter their age
        int age = scan.nextInt(); // Read the user's input as an integer and store it in the 'age' variable

        try { // Start a try-catch block for handling exceptions
            checkAge(age); // Call the 'checkAge' method and pass the 'age' as an argument
        } catch (AgeException e) { // Catch any 'AgeException' that may be thrown
            System.out.println("A problem occurred: " + e.getMessage()); // Display an error message with the exception's message
        }
    }

    static void checkAge(int age) throws AgeException {
        if (age < 18) { // Check if the 'age' is less than 18
            throw new AgeException("\nYou must be 18+ to sign up"); // Throw an 'AgeException' with a custom error message
        } else {
            System.out.println("You are now signed up!"); // Display a message indicating successful sign-up
        }
    }

    public static class AgeException extends Exception {
        AgeException(String message) { // Constructor for the 'AgeException' class
            super(message); // Call the constructor of the 'Exception' class and provide a custom error message
        }
    }
}
