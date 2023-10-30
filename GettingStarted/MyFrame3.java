import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame3 extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;

    MyFrame3() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("Pizza");
        hamburgerButton = new JRadioButton("Hamburger");
        hotdogButton = new JRadioButton("Hotdog");

        // Create a button group to ensure only one option can be selected at a time
        ButtonGroup foodGroup = new ButtonGroup();
        foodGroup.add(pizzaButton);
        foodGroup.add(hamburgerButton);
        foodGroup.add(hotdogButton);

        // Add action listeners to each radio button
        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) {
            System.out.println("Pizza selected");
        } else if (e.getSource() == hamburgerButton) {
            System.out.println("Hamburger selected");
        } else if (e.getSource() == hotdogButton) {
            System.out.println("Hotdog selected");
        }
    }

    /*public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MyFrame3();
        });
    }*/
}
