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
}/*
public void actionPerformed(ActionEvent e) {: This is an implementation of the actionPerformed method, which is required when a class implements the ActionListener interface. It specifies what should happen when an action event occurs.

if (e.getSource() == button) {: This line checks if the source of the action event (e) is the same as the button component. In this context, it means that the action event is triggered by the button with the label "Pick a color." If this condition is true, the code within the block is executed.

JColorChooser colorChooser = new JColorChooser();: This line creates an instance of the JColorChooser class, which is a GUI component that allows users to select a color from a color palette.

Color color = JColorChooser.showDialog(null, "Pick a color...I guess", Color.black);: This line opens the color selection dialog by calling the showDialog method of the JColorChooser class. It displays a color picker dialog to the user, and the user can choose a color. The selected color is then stored in the color variable. The showDialog method takes the following arguments:

null: The first argument is the parent component. In this case, it's set to null because the color picker dialog is not associated with any specific parent window.
"Pick a color...I guess": This is the title of the color picker dialog.
Color.black: This is the default color displayed in the color picker dialog. If the user cancels the color selection, this default color is used.
label.setForeground(color);: This line sets the text color (foreground color) of the label component to the color selected by the user in the color picker dialog. This means that the text displayed by the label will be rendered in the selected color. */
