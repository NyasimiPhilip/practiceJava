import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class javaaudio {
    static String response = "1";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("C:\\Users\\HP User\\Desktop\\java\\practicejava\\gettingstarted\\sound2.wav");

        try {
            // Attempt to open the audio file
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            while (!response.equals("Q")) {
                System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
                System.out.print("Enter your choice: ");
                response = scanner.next();
                response = response.toUpperCase();

                switch (response) {
                    case "P":
                        clip.start();
                        break;
                    case "S":
                        clip.stop();
                        break;
                    case "R":
                        clip.setMicrosecondPosition(0);
                        break;
                    case "Q":
                        clip.stop();
                        clip.close();
                        break;
                    default:
                        System.out.println("Not a valid response");
                }
            }

            // Close the scanner to release resources
            scanner.close();

            // If you reach this point, the file was successfully opened
            System.out.println("Audio file opened successfully.");

            // Now you can continue with audio processing or playback.
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
            System.err.println("Unsupported audio file format.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("I/O error while opening the audio file.");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("An error occurred while opening the audio file.");
        }
    }
}
