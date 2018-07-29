package MainApplication;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopOutput extends JPanel{
	private TopOutputLabel output;
	
	public TopOutput() {
		output = new TopOutputLabel();
		drawPanel();
		setVisible(true);
	}
	
	public void drawPanel() {
		add(output);
	}
	
	public void writeToLabel(String args) {
		output.setText(args);
	}
	
	public void displayAnswer(ArrayList f) {
		String out = String.join(", ", f);
		output.setText(out);
	}
	
	public void reset() {
		output.setText(Integer.toString(0));
	}

}
