import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Button");

    LaunchPage() {
        myButton.setBounds(100, 160, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this); // Set the ActionListener to 'this'

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.add(myButton); // Add the button to the frame
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton) {
            // Handle the button click here
            frame.dispose();
            Newwindow myWindow = new Newwindow();
            System.out.println("Button clicked!");
        }
    }
}
