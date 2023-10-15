public class methodoverriding {
   /*method overriding - declaring a method in a sub class which is already present 
   in the parent class so that a child class can gits own implementation 
    */ 
    public static void main(String [] args )
    {
        dog dog = new dog();
        dog.speak();
        animal animal = new animal();
        animal.speak();
     }
}
