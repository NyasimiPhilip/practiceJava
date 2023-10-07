public class overloadedmethods {
    public static void main(String[] args)
    {
        //overloaded methods = methods that share the same name but have different parameters
        //method name + parameters = method + signature

        int x = add(5,8);
        System.out.println(x);
        int y = add(5,8, 9);
        System.out.println(y);
    }
    static int add(int a, int b)
    {
        System.out.println("Overloaded method 1");
        return a+ b;
    }
    static int add(int a, int b, int c)
    {
        System.out.println("Overloaded method 2");
        return a + b+ c;
    }
}
