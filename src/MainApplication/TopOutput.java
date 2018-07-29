package MainApplication;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopOutput extends JPanel{
	private JLabel output;
	
	public TopOutput() {
		output = new JLabel();
		output.setText("Nothing entered yet");
		output.setFont(new Font("Arial Black", Font.PLAIN, 24));
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
