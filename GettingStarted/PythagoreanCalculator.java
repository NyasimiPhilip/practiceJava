import java.util.Scanner;

public class PythagoreanCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pythagorean Theorem Calculator");
        System.out.print("Enter the length of side 'a': ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side 'b': ");
        double b = scanner.nextDouble();

        // Calculate the length of the hypotenuse 'c' using the Pythagorean theorem
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The length of the hypotenuse 'c' is: " + c);

        scanner.close();
    }
}
