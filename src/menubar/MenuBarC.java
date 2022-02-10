package menubar;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarC {
	public static MenuBar GetMenuBar() {
		MenuBar menubar = new MenuBar();

		Menu helpMB = new Menu("Help");

		MenuItem aboutMBI = new MenuItem("About");
		aboutMBI.setActionCommand("About Software");
		helpMB.add(aboutMBI);

		menubar.add(helpMB);

		MenuItemListener menuItemListener = new MenuItemListener();
		aboutMBI.addActionListener(menuItemListener);

		return menubar;
	}
}

class MenuItemListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Menu pressed: " + e.getActionCommand());
	}
}
