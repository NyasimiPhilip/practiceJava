public class encapsulation {
    public static void main(String[] args)
    {
        /*Encapsulation- attributes of a class will be hidden or private and can be accessed only 
         * through methods (getters and setters)
         */
        ndai nganya = new ndai("Chevy","Camaro",2020);
        System.out.println(nganya.getMake());
        System.out.println(nganya.getModel());
        System.out.println(nganya.getYear());  
    }
}
