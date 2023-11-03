public class javamethodchaining {
    public static void main(String[] args) {
        // Method chaining = a common syntax for invoking multiple method calls in OOP to condense code into fewer lines
        String name = "Bro";
        name = name.concat("philip   ").toUpperCase();
        System.out.println(name);
        name = name.trim(); // Assign the trimmed string back to 'name'
       
        boolean hasWhiteSpace = containsWhiteSpace(name);

        if (hasWhiteSpace) {
            System.out.println("The text contains white space.");
        } else {
            System.out.println("The text does not contain white space.");
        }
    }

    public static boolean containsWhiteSpace(String text) {
        if (text == null) {
            return false; // Handle null strings
        }
        return text.contains(" "); // Check if the string contains a space character
    }
}
