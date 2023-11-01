// Import necessary libraries
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

// Define a class named MyFrame9 that extends JFrame and implements the ActionListener interface
public class MyFrame9 extends JFrame implements ActionListener {

    // Declare instance variables
    JButton button;
    JLabel label;
    
    // Constructor for the MyFrame9 class
    MyFrame9() {        
        // Set the default close operation for the JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the layout manager for the JFrame to FlowLayout
        this.setLayout(new FlowLayout());

        // Create a JButton with the text "Pick a color" and add an ActionListener
        button = new JButton("Pick a color");
        button.addActionListener(this);
        
        // Create a JLabel
        label = new JLabel();
        // Set the background color of the label to white
        label.setBackground(Color.white);
        // Set the text of the label
        label.setText("This is some text :D");
        // Set the font for the label
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));
        // Make the label opaque to show the background color
        label.setOpaque(true);
        
        // Add the button and label to the JFrame
        this.add(button);
        this.add(label);
        // Pack the components within the JFrame
        this.pack();
        // Make the JFrame visible
        this.setVisible(true);
    }
    
    // Override the actionPerformed method from the ActionListener interface
    @Override
    public void actionPerformed(ActionEvent e) {

        // Check if the source of the action event is the button
        if (e.getSource() == button) {
            // Create a JColorChooser for selecting a color
            JColorChooser colorChooser = new JColorChooser();
            
            // Show the color selection dialog and get the selected color
            Color color = JColorChooser.showDialog(null, "Pick a color...I guess", Color.black);
            
            // Set the text color of the label to the selected color
            label.setForeground(color);
            // Set the background color of the label to the selected color (commented out)
        }
    }
}
