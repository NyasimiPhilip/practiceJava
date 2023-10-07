public class WrapperClassExample {
    public static void main(String[] args) {
        // Primitive data types
        boolean primitiveBoolean = true;
        char primitiveChar = 'k';
        int primitiveInt = 123;
        double primitiveDouble = 3.14;

        // Wrapper classes
        Boolean wrapperBoolean = Boolean.valueOf(primitiveBoolean);
        Character wrapperChar = Character.valueOf(primitiveChar);
        Integer wrapperInt = Integer.valueOf(primitiveInt);
        Double wrapperDouble = Double.valueOf(primitiveDouble);

        // Autoboxing and unboxing
        // Autoboxing (converting primitive to wrapper)
        Boolean autoBoxedBoolean = primitiveBoolean;
        Integer autoBoxedInt = primitiveInt;

        // Unboxing (converting wrapper to primitive)
        boolean unboxedBoolean = wrapperBoolean;
        int unboxedInt = wrapperInt;

        // Displaying values
        System.out.println("Primitive Boolean: " + primitiveBoolean);
        System.out.println("Wrapper Boolean: " + wrapperBoolean);
        System.out.println("Autoboxed Boolean: " + autoBoxedBoolean);
        System.out.println("Unboxed Boolean: " + unboxedBoolean);

        System.out.println("Primitive Char: " + primitiveChar);
        System.out.println("Wrapper Char: " + wrapperChar);

        System.out.println("Primitive Integer: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("Autoboxed Integer: " + autoBoxedInt);
        System.out.println("Unboxed Integer: " + unboxedInt);

        System.out.println("Primitive Double: " + primitiveDouble);
        System.out.println("Wrapper Double: " + wrapperDouble);
    }
}
