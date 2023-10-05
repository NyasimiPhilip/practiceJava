public class multidimensionalarrays {
    public static void main(String[] args) {
        String[][] cars = new String[3][3];

        // Initialize and populate the 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cars[i][j] = "Car" + i + j; // You can replace this with actual car names
            }
        }

        // Print the elements of the 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
