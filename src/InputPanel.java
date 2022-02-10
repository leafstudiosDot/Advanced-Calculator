import java.awt.Button;
import java.awt.Choice;
import java.awt.Component;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputPanel {
	public static Component GetInputPanel(int y) {
		Panel p = new Panel();

		Button DeleteRowBtn = new Button("X");
		DeleteRowBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.inpCount = Main.inpCount - 1;
				Main.addButton.enable();
				p.setVisible(false);
			}
		});
		p.add(DeleteRowBtn);

		TextField num1 = new TextField(5);
		p.add(num1);

		Choice math = new Choice();
		math.add("+");
		math.add("-");
		math.add("x");
		math.add("÷");
		p.add(math);

		TextField num2 = new TextField(5);
		p.add(num2);

		Label equals = new Label("=");
		p.add(equals);

		TextField num3 = new TextField(5);
		num3.setEditable(false);
		p.add(num3);

		p.setBounds(0, y, 480, 30);
		return p;
	}
}
