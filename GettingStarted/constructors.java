public class constructors {
    public static void main(String[] args)
    {
        //constructor = special method that is called when an object is instatiated 
        human human1 = new human("Rick", 65, 70);
        human human2 = new human("Morty", 16, 50);
        
        System.out.println(human1.name);
        System.out.println(human2.name);

        human1.drink();
        human2.eat();              
    }
}
