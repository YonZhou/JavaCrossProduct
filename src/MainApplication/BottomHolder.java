package MainApplication;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BottomHolder extends JPanel{
	
	private FieldGrid fg;
	private TopOutput tp;
	
	public BottomHolder(FieldGrid fg, TopOutput tp) {
		this.fg = fg;
		this.tp = tp;
		setLayout(new GridLayout(1, 2));
		setupButtons();
	}
	
	public void setupButtons() {
		JButton confirmButton = new JButton("Calculate");
		JButton resetButton = new JButton("Reset");
		confirmButton.setFont(new Font("Arial Black", Font.PLAIN, 24));
		resetButton.setFont(new Font("Arial Black", Font.PLAIN, 24));
		add(confirmButton);
		add(resetButton);
		
		confirmButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				tp.displayAnswer(fg.calculate());
			}
			
		});
		
		resetButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				fg.resetAll();
				tp.reset();
			}
			
		});
	}

}
