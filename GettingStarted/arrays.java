public class arrays {

    public static void main(String[] args)
{
    String[] veggies = new String[3];

    for (int i = 0; i < veggies.length; i++) {
        // Assign values to the array elements
        if (i == 0) {
            veggies[i] = "Carrot";
        } else if (i == 1) {
            veggies[i] = "Broccoli";
        } else if (i == 2) {
            veggies[i] = "Spinach";
        }
    }

    // Print the elements of the array
    for (int i = 0; i < veggies.length; i++) {
        System.out.println("veggies[" + i + "] = " + veggies[i]);
    }
}

    
}
