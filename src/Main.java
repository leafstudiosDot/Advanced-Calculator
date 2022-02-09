import java.awt.Button;
import java.awt.Frame;

public class Main extends Frame {

	Main() {
		Button addButton = new Button("Add");
		addButton.setBounds(0, 330, 80, 30);
		add(addButton);

		setTitle("Advanced Calculator");
		setSize(480, 360);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		Main f = new Main();
	}
}
