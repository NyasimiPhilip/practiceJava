public class car {
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue ";
    double price = 50000.00;

    public String toString()
    {        
        return  make +"\n" + model +"\n" + year;
    }

    void drive()
    {
        System.out.println("You drive the car");
    }
    void brake()
    {
        System.out.println("You brake the car");
    }
    
}
