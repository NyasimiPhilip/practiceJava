public class copyobject {
    public static void main(String[] args) {
        ndai car1 = new ndai("Chevrolet", "Camaro", 2020);
        //ndai car2 = new ndai("Ford", "Mustang", 2022);

        //car1.copy(car2);
        ndai car2 = new ndai(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}
