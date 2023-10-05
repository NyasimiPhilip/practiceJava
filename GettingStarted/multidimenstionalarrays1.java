public class multidimenstionalarrays1 {
    
    public static void main(String[] args)
        {
        String[][] cars = 
        {
            {"Camaro", "Corvette", "Silverado"},
            {"Mustang", "Ranger", "F-150"},
            {"Ferrari", "Lambo", "Tesla"},
        };    
    for(int i= 0; i<cars.length; i++)
    {  
        for(int j= 0; j< cars[i].length; j++)
        {
            System.out.print(cars[i][j]+ " ");
        }
        System.out.println();
    }
        }
}