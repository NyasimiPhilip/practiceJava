// linked to key listener
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

// Create a class named MyFrame10 that extends JFrame and implements the KeyListener interface
public class MyFrame10 extends JFrame implements KeyListener {

    // Declare instance variables for a JLabel and ImageIcon
    JLabel label;
    ImageIcon icon;
    int xSpeed = 0;
    int ySpeed = 0;

    // Constructor for the MyFrame10 class
    MyFrame10() {
        // Set the default close operation for the JFrame to exit when closed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the dimensions of the JFrame to 500x500 pixels
        this.setSize(500, 500);
        // Set the layout manager for the JFrame to null (no layout manager)
        this.setLayout(null);
        // Add the KeyListener (this instance of MyFrame10) to the JFrame
        this.addKeyListener(this);

        // Create an ImageIcon object using an image file located at the specified path
        icon = new ImageIcon("C:\\Users\\HP User\\Desktop\\java\\practicejava\\gettingstarted\\Logo.png");

        // Create a JLabel
        label = new JLabel();
        // Set the position and size of the label within the JFrame
        label.setBounds(0, 0, 200, 200);
        // Set the icon for the label to the previously created ImageIcon
        label.setIcon(icon);
        // Set the background color of the content pane of the JFrame to black
        this.getContentPane().setBackground(Color.black);
        // Add the label to the JFrame
        this.add(label);
        // Make the JFrame visible
        this.setVisible(true);
        // Start a timer for continuous movement
        startMovementTimer();
    }

    private void startMovementTimer() {
        Timer timer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Update the label's position based on the xSpeed and ySpeed
                label.setLocation(label.getX() + xSpeed, label.getY() + ySpeed);
            }
        });
        timer.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // This method is invoked when a key is typed and uses the KeyChar (character output)
        // You can add specific actions here if needed.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // This method is invoked when a physical key is pressed down and uses KeyCode (integer output)
        // Set xSpeed and ySpeed based on the key pressed
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                xSpeed = -5; // Move left
                break;
            case KeyEvent.VK_UP:
                ySpeed = -5; // Move up
                break;
            case KeyEvent.VK_RIGHT:
                xSpeed = 5; // Move right
                break;
            case KeyEvent.VK_DOWN:
                ySpeed = 5; // Move down
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // This method is called whenever a button is released
        // Reset the xSpeed and ySpeed when keys are released
        xSpeed = 0;
        ySpeed = 0;
    }


}
