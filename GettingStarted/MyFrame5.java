import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyFrame5 implements ChangeListener{

 JFrame frame;
 JPanel panel;
 JLabel label;
 JSlider slider;
 
 MyFrame5(){
  // Create a new JFrame with the title "Slider Demo."
  frame = new JFrame("Slider Demo");
  // Create a JPanel to hold components.
  panel = new JPanel();
  // Create a JLabel to display the current slider value.
  label = new JLabel();
  // Create a JSlider with a range from 0 to 100 and an initial value of 50.
  slider = new JSlider(0, 100, 50);
  
  // Set the preferred size of the slider to 400 pixels wide and 200 pixels tall.
  slider.setPreferredSize(new Dimension(400, 200));
  
  // Enable tick marks for the slider.
  slider.setPaintTicks(true);
  // Set the spacing for minor tick marks to 10 units.
  slider.setMinorTickSpacing(10);
  
  // Enable the slider track to be displayed.
  slider.setPaintTrack(true);
  // Set the spacing for major tick marks to 25 units.
  slider.setMajorTickSpacing(25);
  
  // Enable labels to be displayed on the slider.
  slider.setPaintLabels(true);
  // Set the font for the slider labels.
  slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
  // Set the font for the label that displays the current value.
  label.setFont(new Font("MV Boli", Font.PLAIN, 25));
  
  // Set the orientation of the slider to be vertical.
  slider.setOrientation(SwingConstants.VERTICAL);
  
  // Set the initial text of the label.
  label.setText("°C = " + slider.getValue());
  
  // Add a ChangeListener to the slider to handle value change events.
  slider.addChangeListener(this);
  
  // Add the slider and label to the panel.
  panel.add(slider);
  panel.add(label);
  // Add the panel to the frame.
  frame.add(panel);
  // Set the size of the frame to 420 pixels wide and 420 pixels tall.
  frame.setSize(200, 420);
  // Make the frame visible.
  frame.setVisible(true);
 }
 
 @Override
 public void stateChanged(ChangeEvent e) {
  // Update the label's text to display the current slider value.
  label.setText("°C = " + slider.getValue());
 }
}
