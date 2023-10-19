package package1;
import package2.classC;

public class classA
 {
    protected String protectedMessage = "This is a protected message";
    public static void main(String[] args)
    {
        classC myObj = new classC();
        System.out.println(myObj.publicMessage);
    }

 }