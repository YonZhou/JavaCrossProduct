package MainApplication;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ApplicationMain{
	private JFrame frame;
	
	public ApplicationMain() {
		initiateFrame();
	}
	
	public void initiateFrame() {
		frame = new JFrame();
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.setPreferredSize(new Dimension(1000, 1000));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Cross-Product Calculator");
		
		createComponents();
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public void createComponents() {
		FieldGrid fGrid = new FieldGrid();
		TopOutput output = new TopOutput();
		BottomHolder bHolder = new BottomHolder(fGrid, output);
		
		fGrid.setSize(600, 600);
	
		frame.add(output);
		frame.add(fGrid);
		frame.add(bHolder);
	}
	
	public static void main(String[] args) {
		ApplicationMain app = new ApplicationMain();
	}

}


