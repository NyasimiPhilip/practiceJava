import java.util.Scanner;

/**
 * This program asks the user for their name and age, then greets them.
 */
public class file1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        scanner.close();
    }
}