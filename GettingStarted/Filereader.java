import java.io.*;
public class Filereader {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\Users\\HP User\\Desktop\\java\\practicejava\\gettingstarted\\secretmessag.txt");
            int character;
            while ((character = reader.read()) != -1) {
                // Process the character here
                System.out.print((char) character);
            }
            reader.close(); // Close the FileReader when done
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("haiko");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}