import java.util.ArrayList; // Import ArrayList class from java.util package

public class MyArrayListExample { // Rename your class to something unique
    
    public static void main(String[] args, ArrayList<String> arrayList)
    {
        // ArrayList = A resizable array.
        // Elements can be added and removed after compilation phase
        // Store reference data types
        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add( "hamburger");
        food.add("hotdog");

        food.set(0,"sushi");
        food.remove(2);
        //food.clear(); to clear an arraylist
    
        for(int i= 0; i<arrayList.size(); i++)
         {
        System.out.println(food.get(i));
        }   
    }
}
