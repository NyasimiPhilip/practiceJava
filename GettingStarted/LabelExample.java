import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;

public class LabelExample {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("C:\\Users\\HP User\\Desktop\\java\\practicejava\\gettingstarted\\Logo.png");
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.green, 3);
        
        
        label.setIcon(image);
        label.setText("Bro, do you even code?");
        label.setHorizontalTextPosition(JLabel.CENTER); // Set the text position
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.RED);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(100);
        label.setOpaque(true);
        label.setBackground(Color.DARK_GRAY);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
        

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label);
        frame.getContentPane().setBackground(new Color(123,50,250));
    }
}
