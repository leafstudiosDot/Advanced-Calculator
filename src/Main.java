import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Frame {
	static int inpCount = 1;

	Main() {
		Button addButton = new Button("Add Container");
		addButton.setBounds(0, 330, 120, 30);
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Added Input Panel");
				inpCount = inpCount + 1;
				System.out.println(inpCount);
				add(InputPanel.GetInputPanel(30 * inpCount));
				if (inpCount == 10) {
					addButton.enable(false);
				}
				validate();
				repaint();
			}
		});
		add(addButton);

		add(InputPanel.GetInputPanel(30));

		setTitle("Advanced Calculator");
		setSize(480, 360);
		setResizable(false);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		Main f = new Main();
	}
}
