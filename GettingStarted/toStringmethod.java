public class toStringmethod {
    //toString()= method that all object inherit,
    // that return a string that textually represents an object that can be used both implicitly and explicitly
    //overriding the toString method that return by default return the address of the nstatiated class
    
    public static void main(String[] args)
    {
        car car = new car();
        System.out.println(car.toString());
        System.out.println(car);
    }

} 
