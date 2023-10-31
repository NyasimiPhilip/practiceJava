import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame4 extends JFrame implements ActionListener{

 JComboBox comboBox;
 
 MyFrame4(){
  // Set the default close operation to exit the application when the window is closed.
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  // Set the layout manager for the frame as FlowLayout.
  this.setLayout(new FlowLayout());   
  // Create an array of animal names.
  String[] animals = {"dog","cat","bird"};
  
  // Create a JComboBox and populate it with the array of animals.
  comboBox = new JComboBox(animals);
  // Add an action listener to the JComboBox to detect user interactions.
  comboBox.addActionListener(this);
  
  // Uncomment the following lines one by one to see the effects.
  
  // Make the JComboBox editable so that the user can enter custom values.
  //comboBox.setEditable(true);
  
  // Get the count of items in the JComboBox.
  //System.out.println(comboBox.getItemCount());
  
  // Add an item ("horse") to the end of the JComboBox.
  //comboBox.addItem("horse");
  
  // Insert an item ("pig") at a specific index (0) in the JComboBox.
  //comboBox.insertItemAt("pig", 0);
  
  // Set the selected index of the JComboBox to a specific index (0).
  //comboBox.setSelectedIndex(0);
  
  // Remove an item ("cat") from the JComboBox.
  //comboBox.removeItem("cat");
  
  // Remove an item at a specific index (0) from the JComboBox.
  //comboBox.removeItemAt(0);
  
  // Remove all items from the JComboBox.
  //comboBox.removeAllItems();
  
  // Add the JComboBox to the frame.
  this.add(comboBox);
  // Pack the frame to fit its contents.
  this.pack();
  // Make the frame visible.
  this.setVisible(true);
 }
 
 @Override
 public void actionPerformed(ActionEvent e) {
  if(e.getSource()==comboBox) {
   // When an action (selection change) occurs in the JComboBox, print the selected item.
   System.out.println(comboBox.getSelectedItem());
   // Uncomment the following line to print the selected index.
   System.out.println(comboBox.getSelectedIndex());
  }
 }
}
