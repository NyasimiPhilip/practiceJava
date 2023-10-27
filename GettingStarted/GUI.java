import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class GUI {
    public static void main(String[] args)
    {

        /*Jfram = a GUI window to add components to  */
        JFrame frame = new JFrame();
        frame.setTitle("Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("C:\\Users\\HP User\\Desktop\\java\\practicejava\\gettingstarted\\Logo.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(123,50,250));//change color to 
    }
}
