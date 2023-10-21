public class javainterface {
    public static void main(String[] args)
    {
        /*interface = a template that can be applied to a class
         * similar to inheritance, but specifies what a class has/must do 
         * classes can apply more than one interface, inheritance is limited to 1 super
         */
        rabbit rabbit = new rabbit();
        rabbit.flee();
        hawk hawk = new hawk();
        hawk.hunt();
        fish fish = new fish();
        fish.hunt();
        fish.flee();

    }
}
