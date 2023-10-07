
public class objectorientedprogramming {
    public static void main(String[] args) {
        // Now you can create an instance of the car class and use its methods and properties
        car myCar = new car();
        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);

        // Call the methods
        myCar.drive();
        myCar.brake();
    }
}
