public class polymorphism {
    public static void main(String[] args) {
        Building[] buildings = new Building[2]; // Create an array of Building

        Building building1 = new House();
        Building building2 = new OfficeBuilding();


        buildings[0] = building1; // Populate the array with building1
        buildings[1] = building2; // Populate the array with building2

        for (Building xyz : buildings) {
            xyz.build(); // Call the build() method for each building in the array
        }
    }
}
