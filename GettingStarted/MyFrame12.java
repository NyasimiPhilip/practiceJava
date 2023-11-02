import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame12 {

    JFrame frame;
    JLabel label;

    MyFrame12() {

        // Create a JFrame (window) for the application
        frame = new JFrame("KeyBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the close operation
        frame.setSize(420, 420); // Set the window size
        frame.setLayout(null); // Use null layout for manual positioning

        label = new JLabel(); // Create a JLabel to display
        label.setBackground(Color.red);
        label.setBounds(100, 100, 100, 100); // Set the position and size of the label
        label.setOpaque(false); // Make the label opaque

        // Create key bindings
        InputMap inputMap = label.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = label.getActionMap();

        // Define key bindings for arrow keys
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_W, 0), "upAction");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_S, 0), "downAction");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_A, 0), "leftAction");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_D, 0), "rightAction");

        // Associate key bindings with corresponding actions
        actionMap.put("upAction", new UpAction());
        actionMap.put("downAction", new DownAction());
        actionMap.put("leftAction", new LeftAction());
        actionMap.put("rightAction", new RightAction());

        frame.add(label); // Add the label to the JFrame
        frame.setVisible(true); // Make the JFrame visible
    }

    public class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() - 10); // Move label up
        }
    }

    public class DownAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() + 10); // Move label down
        }
    }

    public class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10, label.getY()); // Move label to the left
        }
    }

    public class RightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10, label.getY()); // Move label to the right
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MyFrame12()); // Start the Swing application
    }
}
