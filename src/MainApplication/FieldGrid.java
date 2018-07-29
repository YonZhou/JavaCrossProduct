package MainApplication;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FieldGrid extends JPanel{
	private final int gridW = 3;
	private final int gridH = 2;
	private JTextField[][] fieldHolder;
	private ArrayList outputAnswer;
	
	public FieldGrid() {
		setLayout(new GridLayout(gridW, gridH));
		generateFields();
		setVisible(true);
	}
	
	public void generateFields() {
		fieldHolder = new JTextField[gridW][gridH];
		for(int i=0; i< gridW; i++) {
			for(int j=0; j< gridH; j++) {
				JTextField newField = new JTextField(10);
				newField.setFont(new Font("Arial Black", Font.PLAIN, 24));
				fieldHolder[i][j] = newField;
				add(newField);
			}
		}
		
	}
	
	public ArrayList calculate() {
		outputAnswer = new ArrayList<String>();
		float firstSum = getNum(1,0)*getNum(2,1) - getNum(2,0)*getNum(1,1);
		float secondSum = getNum(2,0)*getNum(0,1) - getNum(0,0)*getNum(2,1);
		float thirdSum = getNum(0,0)*getNum(1,1) - getNum(1,1)*getNum(0,1);
		outputAnswer.add(Float.toString(firstSum));
		outputAnswer.add(Float.toString(secondSum));
		outputAnswer.add(Float.toString(thirdSum));
		return outputAnswer;
	}
	
	public float getNum(int i, int j) {
		return Float.valueOf(fieldHolder[i][j].getText());
	}
	
	public void resetAll() {
	
		for(int i=0; i< gridW; i++) {
			for(int j=0; j< gridH; j++) {
				fieldHolder[i][j].setText("");
			}
		}
	}

}
