import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonDemo extends JFrame implements ActionListener {

    JButton button;

    ButtonDemo() {
        button = new JButton("Click Me"); // Remove the "JButton" type declaration to use the class-level variable
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(this);
        button.setFocusable(false);
        button.setFont(new Font("Comic Sans", Font.BOLD, 15));
        button.setIconTextGap(-15);
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLUE);
        button.setBorder(BorderFactory.createEtchedBorder());


        this.add(button);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Wacha ujinga");
        }
    }
}
