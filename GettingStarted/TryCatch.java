import java.util.*;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number to divide(dividend)");
        int x = scanner.nextInt();

        System.out.println("Enter the divisor");
        int y = scanner.nextInt();

        try {
            int result = divideNumbers(x, y);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            scanner.close(); // Close the Scanner
        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return dividend / divisor;
    }
}
