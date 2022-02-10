package errorDialog;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ErrorDial extends Frame {
	public ErrorDial(String ErrorString) {
		Label error = new Label(ErrorString);
		error.setBounds(5, 15, 300, 40);
		add(error);

		Button okbtn = new Button("OK");
		okbtn.setBounds(240, 70, 80, 30);
		add(okbtn);

		setTitle("An error has occurred");
		setSize(320, 100);
		setResizable(false);
		setLayout(null);
		setVisible(true);

		okbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
}
