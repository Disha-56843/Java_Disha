import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistrationForm {
	
	JFrame frame;
	JLabel labelm, label1, label2, label3, label4, label5, label6, label7;
	JTextField tf1, tf2, tf3, tf4, tf5;
	JPasswordField pass1,pass2;
	JButton sub;
	
	public RegistrationForm() {
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		labelm = new JLabel("Registration Form");
		labelm.setBounds(179, 21, 119, 20);
		
		
//		----------------label------------------
		label1 = new JLabel("Name:");
		label1.setBounds(84, 56, 49, 20);
		
		label2 = new JLabel("Email-ID:");
		label2.setBounds(84, 86, 129, 20);
		
		label3 = new JLabel("Create Password:");
		label3.setBounds(84, 116, 129, 20);
		
		label4 = new JLabel("Confirm Password:");
		label4.setBounds(84, 146, 129, 20);
		
		label5 = new JLabel("Country:");
		label5.setBounds(84, 176, 129, 20);
		
		label6 = new JLabel("State:");
		label6.setBounds(84, 206, 129, 20);
		
		label7 = new JLabel("Phone No:");
		label7.setBounds(84, 236, 129, 20);
		
//		-----------Textfield and passwordfield--------------
		
		tf1 = new JTextField();
		tf1.setBounds(271, 56, 126, 20);
		
		tf2 = new JTextField();
		tf2.setBounds(271, 86, 126, 20);
		
		pass1 = new JPasswordField();
		pass1.setBounds(271, 116, 126, 20);
		
		pass2 = new JPasswordField();
		pass2.setBounds(271, 146, 126, 20);
		
		tf3 = new JTextField();
		tf3.setBounds(271, 176, 126, 20);
		
		tf4 = new JTextField();
		tf4.setBounds(271, 206, 126, 20);
		
		tf5 = new JTextField();
		tf5.setBounds(271, 236, 126, 20);
		
//		-----------------Button-------------------
		
		sub = new JButton("Submit");
		sub.setBounds(173, 295, 89, 23);
		
		frame.add(labelm);
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		frame.add(label6);
		frame.add(label7);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(pass1);
		frame.add(pass2);
		frame.add(tf3);
		frame.add(tf4);
		frame.add(tf5);
		frame.add(sub);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		
		new RegistrationForm();
		
	}

}
