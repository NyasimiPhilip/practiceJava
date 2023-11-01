// Import necessary Java libraries
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

// Create a class named MyFrame10 that extends JFrame and implements the KeyListener interface
public class MyFrame10 extends JFrame implements KeyListener{

    // Declare instance variables for a JLabel and ImageIcon
    JLabel label;
    ImageIcon icon;

    // Constructor for the MyFrame10 class
    MyFrame10(){
        // Set the default close operation for the JFrame to exit when closed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the dimensions of the JFrame to 500x500 pixels
        this.setSize(500,500);
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
        // Set the background color of the label (commented out in the code)
        // Make the label opaque (commented out in the code)
        // Set the background color of the content pane of the JFrame to black
        this.getContentPane().setBackground(Color.black);
        // Add the label to the JFrame
        this.add(label);
        // Make the JFrame visible
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // This method is invoked when a key is typed and uses the KeyChar (character output)
        // Use a switch statement to handle different key characters
        switch(e.getKeyChar()) {
            case 'a': label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w': label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's': label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd': label.setLocation(label.getX() + 10, label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // This method is invoked when a physical key is pressed down and uses KeyCode (integer output)
        // Use a switch statement to handle different key codes
        switch(e.getKeyCode()) {
            case 37: label.setLocation(label.getX() - 10, label.getY());
                break;
            case 38: label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 39: label.setLocation(label.getX() + 10, label.getY());
                break;
            case 40: label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // This method is called whenever a button is released
        // Print the released key character and key code to the console
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
    }
}
