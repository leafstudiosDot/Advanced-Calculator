import java.awt.Choice;
import java.awt.Component;
import java.awt.Panel;

public class InputPanel {
	public static Component GetInputPanel() {
		Panel p = new Panel();

		Choice math = new Choice();
		math.add("+");
		math.add("-");
		math.add("x");
		math.add("÷");
		p.add(math);

		p.setBounds(0, 30, 480, 30);
		return p;
	}
}
