import javax.swing.JOptionPane; // Import the JOptionPane class

public class MyJOptionPaneExample {
    public static void main(String[] args){
        /*
        JOptionPane.showMessageDialog(null, "Information message", "Title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "plainmessage", "Title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "question", "Title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "warning", "Title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "error message", "Title", JOptionPane.ERROR_MESSAGE);
        */
        //System.out.println(JOptionPane.showConfirmDialog(null, "bro, do you even code?", "this is my title", JOptionPane.YES_NO_CANCEL_OPTION)); 
        String name = JOptionPane.showInputDialog("What is your name?");
        
        // Display a dialog box with the entered name
        JOptionPane.showMessageDialog(null, "Hello, " + name, "Welcome", JOptionPane.INFORMATION_MESSAGE);
    }    
}