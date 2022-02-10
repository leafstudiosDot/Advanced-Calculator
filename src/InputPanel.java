import java.awt.Button;
import java.awt.Choice;
import java.awt.Component;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import errorDialog.ErrorDial;

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

		Button equals = new Button("=");
		p.add(equals);

		TextField num3 = new TextField(5);
		num3.setEditable(false);
		p.add(num3);

		equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Double no1 = Double.parseDouble(num1.getText());
					Double no2 = Double.parseDouble(num2.getText());
					switch (math.getItem(math.getSelectedIndex())) {
					case "+":
						num3.setText(Double.toString(no1 + no2));
						break;
					case "-":
						num3.setText(Double.toString(no1 - no2));
						break;
					case "x":
						num3.setText(Double.toString(no1 * no2));
						break;
					case "÷":
						num3.setText(Double.toString(no1 / no2));
						break;
					default:
						ErrorDial errdial = new ErrorDial("Unknown Operation");
					}
					// System.out.println(math.getItem(math.getSelectedIndex()));
				} catch (Exception e1) {
					ErrorDial errdial = new ErrorDial("An error has occurred returning result");
					System.out.println(e1);
				}
			}
		});

		p.setBounds(0, y, 480, 30);
		return p;
	}
}
