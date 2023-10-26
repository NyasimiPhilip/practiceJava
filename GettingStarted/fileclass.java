import java.io.File;

public class fileclass {
    public static void main(String[] args)
    { 
        //file = an abstract representation of file and directory pathnames
        File file = new File("C:\\Users\\HP User\\Desktop\\java\\practicejava\\gettingstarted\\secretmessag.txt");
        if(file.exists())
        {
            System.out.println("That file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            
        }
        else
        {
            System.out.println("That file doesn't exists");
            System.out.println(System.getProperty("user.dir"));
        }
    }
}
