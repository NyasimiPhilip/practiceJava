import java.util.*;

public class TwoDimensionalArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        var bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        var produceList = new ArrayList<String>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        var drinksList = new ArrayList<String>();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        // Traverse the 2D ArrayList using two nested for loops
        for (int i = 0; i < groceryList.size(); i++) {
            ArrayList<String> innerList = groceryList.get(i);
            for (int j = 0; j < innerList.size(); j++) {
                String item = innerList.get(j);
                System.out.println("Row " + i + ", Column " + j + ": " + item);
            }
        }
    }
}
