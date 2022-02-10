package menubar;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AboutWindow extends Frame {
	AboutWindow() {
		Label copyright = new Label("Advanced Calculator © 2022 leafstudiosDot");
		copyright.setBounds(5, 40, 300, 100);
		add(copyright);

		setTitle("About Advanced Calculator");
		setSize(320, 100);
		setResizable(false);
		setLayout(null);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
}
