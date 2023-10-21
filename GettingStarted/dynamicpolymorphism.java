public class dynamicpolymorphism {
    public static void main(String[] args) {
        // Create instances of different clothing items
        Clothes genericClothing = new Clothes();
        Clothes shirt = new Shirt();
        Clothes pants = new Pants();
        
        // Call the description method for each clothing item
        genericClothing.description(); // Calls Clothes' description method
        shirt.description();           // Calls Shirt's description method
        pants.description();           // Calls Pants' description method
        
        // To call style() and comfort(), we need to cast to the respective subclass
        ((Shirt) shirt).style();
        ((Pants) pants).comfort();
    }
    
}
