import java.awt.*;
import javax.swing.*;

public class MyFrame6 {

	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0, 100);
	
	MyFrame6(){
		// Create a new JFrame.
		frame = new JFrame();
		// Create a JProgressBar with a range from 0 to 100.
		bar = new JProgressBar(0, 100);
		
		// Set the initial value of the progress bar to 0.
		bar.setValue(0);
		// Set the position and dimensions of the progress bar.
		bar.setBounds(0, 0, 420, 50);
		// Enable the progress bar to display the progress as a string.
		bar.setStringPainted(true);
		// Set the font for the progress bar text.
		bar.setFont(new Font("MV Boli", Font.BOLD, 25));
		// Set the foreground color of the progress bar (fill color) to red.
		bar.setForeground(Color.green);
		// Set the background color of the progress bar to black.
		bar.setBackground(Color.black);
		
		// Add the progress bar to the frame.
		frame.add(bar);
		// Set the default close operation for the frame.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the size of the frame to 420 pixels wide and 420 pixels tall.
		frame.setSize(420, 100);
		// Use a null layout for the frame.
		frame.setLayout(null);
		// Make the frame visible.
		frame.setVisible(true);
		
		// Call the 'fill' method to update the progress bar.
		fill();
	}
	
	public void fill() {
		int counter = 0;
		
		while (counter <= 100) {
			// Set the value of the progress bar to 'counter.'
			bar.setValue(counter);
			try {
				// Pause the thread for 50 milliseconds (simulate progress).
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// Handle any potential exceptions during thread sleep.
				e.printStackTrace();
			}
			// Increment the counter by 1.
			counter += 1;
		}
		// Set the final string message when the progress is complete.
		bar.setString("Done! :)");
	}
}
