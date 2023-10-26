import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
    public static void main(String[] args){
    try{
        FileWriter writer = new FileWriter("poem.txt");
        writer.write("wachaujinga");
        writer.close();
    }
    catch(IOException e){
        e.printStackTrace();
    }
  }
}
