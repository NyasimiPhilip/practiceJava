public class polymorphism {
    public static void main(String[] args) {
        Building building1 = new House();
        Building building2 = new OfficeBuilding();

        building1.build();
        building2.build();

        // The following lines will result in compilation errors since
        // the reference type is Building, and the methods addRoof() and addCubicles() are not visible.
        // building1.addRoof();
        // building2.addCubicles();
    }
}
