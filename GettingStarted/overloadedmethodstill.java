public class overloadedmethodstill {
    // Overloaded methods with different parameter types
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded methods with a different number of parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        overloadedmethodstill math = new overloadedmethodstill();
        
        System.out.println(math.add(2, 3));          // Calls the first add method
        System.out.println(math.add(2.5, 3.5));      // Calls the second add method
        System.out.println(math.add(1, 2, 3));       // Calls the third add method
    }
}
