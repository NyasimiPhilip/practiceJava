import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel {
    MyPanel() {
        this.setPreferredSize(new Dimension(500, 500)); // Set a preferred size for the panel
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Call the superclass's paintComponent method
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke(20)); // Set the stroke before drawing
        g2D.setPaint(Color.ORANGE); // Set the drawing color
        //g2D.drawLine(0, 0, 500, 500);
        g2D.drawRect(0, 0, 400, 400);
        //g2D.fillRect(0, 0, 400, 200);
        g2D.setPaint(Color.BLUE);
        //g2D.drawOval(0, 0, 400, 400);
        g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
        g2D.drawString("U r a winner :D", 50, 75);
        


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("2D Graphics Example");
        MyPanel panel = new MyPanel();
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
