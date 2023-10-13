public class objectparsing {
    public static void main(String[] args)
    {
        garage garage = new garage();
        vehicle vehicule1  = new vehicle("Bmw");
        vehicle vehicule2  = new vehicle("Porsche");
        garage.park(vehicule1);
        garage.park(vehicule2);

    }
}
