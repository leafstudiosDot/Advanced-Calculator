import java.awt.Choice;
import java.awt.Component;
import java.awt.Panel;
import java.awt.TextField;

public class InputPanel {
	public static Component GetInputPanel() {
		Panel p = new Panel();

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

		p.setBounds(0, 30, 480, 30);
		return p;
	}
}
