import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MovingImageApp {

    public static void main(String[] args) {
        // Schedule the creation of the application's GUI on the event dispatch thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create a new instance of the MovingImageFrame
                new MovingImageFrame();
            }
        });
    }
}

class MovingImageFrame extends JFrame {

    MovingImagePanel panel;

    MovingImageFrame() {
        // Create a MovingImagePanel
        panel = new MovingImagePanel();

        // Set the default close operation for the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the MovingImagePanel to the frame
        this.add(panel);

        // Adjust the frame size to fit the panel
        this.pack();

        // Center the frame on the screen
        this.setLocationRelativeTo(null);

        // Make the frame visible
        this.setVisible(true);
    }
}

class MovingImagePanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Timer timer;
    int xVelocity;
    int yVelocity;
    int x = 0;
    int y = 0;

    MovingImagePanel() {
        // Set the preferred size of the panel
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));

        // Set the background color of the panel
        this.setBackground(Color.black);

        // Load the image
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\HP User\\Desktop\\java\\practicejava\\gettingstarted\\Logo.png");
        Image originalImage = originalIcon.getImage();

        // Scale the image down to a smaller size
        int scaledWidth = originalIcon.getIconWidth() / 2;  // Adjust the scale factor as needed
        int scaledHeight = originalIcon.getIconHeight() / 2; // Adjust the scale factor as needed

        enemy = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);

        // Randomize initial velocities for more erratic movement
        xVelocity = (int) (Math.random() * 5) + 1;
        yVelocity = (int) (Math.random() * 5) + 1;

        // Decrease timer interval for faster and more erratic movement
        timer = new Timer(5, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Paint the background

        Graphics2D g2D = (Graphics2D) g;

        // Draw the enemy image at its current position
        g2D.drawImage(enemy, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Check for collisions with the panel boundaries and change direction if necessary
        if (x >= PANEL_WIDTH - enemy.getWidth(null) || x < 0) {
            xVelocity = -xVelocity + (int) (Math.random() * 3) - 1; // Randomly change direction and velocity
        }
        x = x + xVelocity;

        if (y >= PANEL_HEIGHT - enemy.getHeight(null) || y < 0) {
            yVelocity = -yVelocity + (int) (Math.random() * 3) - 1; // Randomly change direction and velocity
        }
        y = y + yVelocity;

        // Request a repaint to update the image's position
        repaint();
    }
}
