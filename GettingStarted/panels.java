import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import java.awt.Color;

public class panels {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setBorder(new LineBorder(Color.BLACK, 2)); // Add a black border with a thickness of 2

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setBorder(new LineBorder(Color.BLACK, 2));

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(new BorderLayout());
        greenPanel.setBorder(new LineBorder(Color.BLACK, 2));

        JLabel label = new JLabel();
        label.setText("Hi");

        greenPanel.add(label, BorderLayout.CENTER);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        frame.setVisible(true);
    }
}
