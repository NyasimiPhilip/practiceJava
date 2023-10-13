public class arrayofobjects {
    public static void main(String [] args)
    {
        int [] numbers = new int[3];
        char [] characters = new char[4];
        String [] strings = new String[5];

        food[] refrigerator = new food [3];
        food Food1 = new food("Pizza");
        food Food2 = new food("Hamburger");
        food Food3 = new food("hotdog");

        food [] refrigerat = {Food1,Food2,Food3};
        refrigerator[0] = Food1;
        refrigerator[1] = Food2;
        refrigerator[2] = Food3;

        System.out.println(refrigerator[0].getName());
        System.out.println(refrigerat[2].getName());


    }
}
