import java.util.ArrayList; // Import ArrayList class from java.util package

public class MyArrayListExample { // Rename your class to something unique

    public static void main(String[] args)
    {
        // ArrayList = A resizable array.
        // Elements can be added and removed after compilation phase
        // Store reference data types
        var food = new ArrayList<String>();

        food.add("pizza");
        food.add( "hamburger");
        food.add("hotdog");

        food.set(0,"sushi");
        //food.remove(2);//to remove at a particular index;
        //food.clear(); //to clear an arraylist
    
        for(int i= 0; i<food.size(); i++)
         {
        System.out.println(food.get(i));
        }   
    }
}
