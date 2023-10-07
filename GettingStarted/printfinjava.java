public class printfinjava {
    public static void main(String[] args) {
        // Declare and initialize variables
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // Print boolean value with %b format specifier
        System.out.printf("Boolean: %b%n", myBoolean);

        // Print character value with %c format specifier
        System.out.printf("Character: %c%n", myChar);

        // Print string value with %s format specifier
        System.out.printf("String: %s%n", myString);

        // Print integer value with %d format specifier
        System.out.printf("Integer: %d%n", myInt);

        // Print double value with %f format specifier
        System.out.printf("Double: %.2f%n", myDouble);
    }
}
