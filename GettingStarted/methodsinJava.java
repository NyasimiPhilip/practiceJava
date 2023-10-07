public class methodsinJava {
    public static void main(String[] args)
    {
        String name = "Bro";
        int age = 21;
        hello(name, age);

        System.out.println(add(3 , 4));

    }

    static void hello(String anything, int anynumber)
    {
        System.out.println("Hello" + anything);
        System.out.println("You are " + anynumber +" years old");
    }

    static int add(int x, int y)
    {
        return x + y;       
    }
}
