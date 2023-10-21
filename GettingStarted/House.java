public class House extends Building {
    @Override
    public void build() {
        System.out.println("Building a house");
    }

    public void addRoof() {
        System.out.println("Adding a roof to the house");
    }
}
