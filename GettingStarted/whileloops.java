import java.util.Scanner;
public class whileloops {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank())
        {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+ name);
        scanner.close(); 
        
        vehicle vehicl = new vehicle("tinga");

        vehicl.go();
    }        
}
