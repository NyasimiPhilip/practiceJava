package package2;
import package1.*;

public class Asub extends classA{
    public static void main(String[] args)
    {
        classC myObj = new classC();
        System.out.println(myObj.defaultMessage);
         System.out.println(myObj.publicMessage);
    }     
}
