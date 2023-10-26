import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int dividend = readInteger(scanner, "Enter dividend: ");
            int divisor = readInteger(scanner, "Enter divisor: ");

            int result = divideNumbers(dividend, divisor);
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.err.println("Input mismatch. Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner to release resources
        }
    }

    public static int readInteger(Scanner scanner, String prompt) {
        System.out.print(prompt);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Input mismatch. Please enter a valid integer.");
        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return dividend / divisor;
    }
}