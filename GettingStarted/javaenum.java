public class javaenum {
    public static void main(String[] args) {
        // Main class containing the program's entry point
        // The program begins execution here when run

        // enum = enumerated (ordered listing of items in a collection)
        // grouping of constants that behave similarly to objects

        // Define a variable "myPlanet" of the "Planet" enum type and set it to "PLUTO"
        Planet myPlanet = Planet.PLUTO;

        // Call the "canILiveHere" method with "myPlanet" as an argument
        canILiveHere(myPlanet);
    }

    static void canILiveHere(Planet myPlanet) {
        // Define a method called "canILiveHere" which takes a "Planet" enum as a parameter

        switch (myPlanet) {
            // Start a switch statement based on the value of "myPlanet"

            case EARTH:
                // If "myPlanet" is equal to "EARTH"
                System.out.println("You can live here :)");
                // Print a message indicating that you can live on Earth
                System.out.println("This is planet #" + myPlanet.number);
                // Print the number associated with the planet
                break;
                // Exit the switch statement

            default:
                // If "myPlanet" doesn't match any of the cases
                System.out.println("You can't live here...yet");
                // Print a message indicating that you can't live on this planet
                System.out.println("This is planet #" + myPlanet.number);
                // Print the number associated with the planet
                break;
                // Exit the switch statement

            // End of the switch statement
        }
    }

    public enum Planet {
        // Define an enum called "Planet"
        MERCURY(1),
        VENUS(2),
        EARTH(3),
        MARS(4),
        JUPITER(5),
        SATURN(6),
        URANUS(7),
        NEPTUNE(8),
        PLUTO(9);
        // Enum values with associated numbers

        int number;
        // Declare an integer variable "number" for each enum value

        Planet(int number) {
            // Constructor for the "Planet" enum
            // Sets the "number" variable when each enum value is created
            this.number = number;
        }
    }
}
