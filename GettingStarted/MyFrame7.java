import java.awt.FlowLayout;                    // Import the FlowLayout class from the awt package.
import java.awt.event.*;                        // Import classes for handling events.
import javax.swing.*;                           // Import Swing components.

public class MyFrame7 extends JFrame implements ActionListener {

	JMenuBar menuBar;                           // Create a menu bar.
	JMenu fileMenu;                             // Create a "File" menu.
	JMenu editMenu;                             // Create an "Edit" menu.
	JMenu helpMenu;                             // Create a "Help" menu.
	JMenuItem loadItem;                         // Create a "Load" menu item.
	JMenuItem saveItem;                         // Create a "Save" menu item.
	JMenuItem exitItem;                         // Create an "Exit" menu item.
	//ImageIcon loadIcon;                        // (Optional) Create icons for menu items.
	//ImageIcon saveIcon;
	//ImageIcon exitIcon;

	MyFrame7() {
		// Set the default close operation for the frame.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the initial size of the frame.
		this.setSize(100, 100);
		// Set the layout manager for the frame to FlowLayout.
		this.setLayout(new FlowLayout());

		// Create menu bar and menu items.
		// Note: ImageIcon code is commented out (optional for icons).
		menuBar = new JMenuBar();                  // Create a menu bar.
		fileMenu = new JMenu("File");             // Create a "File" menu.
		editMenu = new JMenu("Edit");             // Create an "Edit" menu.
		helpMenu = new JMenu("Help");             // Create a "Help" menu.
		loadItem = new JMenuItem("Load");         // Create a "Load" menu item.
		saveItem = new JMenuItem("Save");         // Create a "Save" menu item.
		exitItem = new JMenuItem("Exit");         // Create an "Exit" menu item.

		// Add action listeners for menu items.
		loadItem.addActionListener(this);          // Set an action listener for "Load" menu item.
		saveItem.addActionListener(this);          // Set an action listener for "Save" menu item.
		exitItem.addActionListener(this);          // Set an action listener for "Exit" menu item.

		// Uncomment the following lines to set icons for menu items.
		//loadItem.setIcon(loadIcon);
		//saveItem.setIcon(saveIcon);
		//exitItem.setIcon(exitIcon);

		// Set mnemonic key shortcuts for menus and items.
		fileMenu.setMnemonic(KeyEvent.VK_F);       // Alt + F for "File" menu.
		editMenu.setMnemonic(KeyEvent.VK_E);       // Alt + E for "Edit" menu.
		helpMenu.setMnemonic(KeyEvent.VK_H);       // Alt + H for "Help" menu.
		loadItem.setMnemonic(KeyEvent.VK_L);       // Alt + L for "Load" menu item.
		saveItem.setMnemonic(KeyEvent.VK_S);       // Alt + S for "Save" menu item.
		exitItem.setMnemonic(KeyEvent.VK_E);       // Alt + E for "Exit" menu item.

		// Add menu items to the "File" menu.
		fileMenu.add(loadItem);                   // Add "Load" menu item to "File" menu.
		fileMenu.add(saveItem);                   // Add "Save" menu item to "File" menu.
		fileMenu.add(exitItem);                   // Add "Exit" menu item to "File" menu.

		// Add menus to the menu bar.
		menuBar.add(fileMenu);                    // Add "File" menu to the menu bar.
		menuBar.add(editMenu);                    // Add "Edit" menu to the menu bar.
		menuBar.add(helpMenu);                    // Add "Help" menu to the menu bar.

		// Set the menu bar for the frame.
		this.setJMenuBar(menuBar);

		// Make the frame visible.
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Handle action events for menu items.
		if(e.getSource() == loadItem) {
			System.out.println("*beep boop* you loaded a file");
		}
		if(e.getSource() == saveItem) {
			System.out.println("*beep boop* you saved a file");
		}
		if(e.getSource() == exitItem) {
			// Exit the application when the "Exit" menu item is selected.
			System.exit(0);
		}
	}
}
