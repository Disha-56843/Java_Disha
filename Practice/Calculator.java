package Dtae20_06;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator {
	
	JFrame frame;
	JLabel label;
	

	public Calculator() {
		
		frame = new JFrame();
		
		
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
	
		new Calculator();
	
	}
	
}
