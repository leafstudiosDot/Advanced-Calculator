package menubar;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuBarC {
	public static MenuBar GetMenuBar() {
		MenuBar menubar = new MenuBar();
		Menu helpMB = new Menu("Help");
		MenuItem aboutMBI = new MenuItem("About");
		helpMB.add(aboutMBI);
		menubar.add(helpMB);
		return menubar;
	}
}
