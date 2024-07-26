package Date06_07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Registerform implements ActionListener
{
	
	JFrame frame;
	JLabel label1,label2,label3;
	JTextField tf1,tf2,tf3;
	JRadioButton jrb1,jrb2;
	JButton submit;
	
	Registerform() {
		
		frame = new JFrame();
		
		label1 = new JLabel("First Name:");
		label1.setBounds(98, 54, 99, 14);
		
		label2 = new JLabel("Last name:");
		label2.setBounds(98, 94, 99, 14);
		
		label3 = new JLabel("Email:");
		label3.setBounds(98, 134, 99, 14);
		
		tf1 = new JTextField();
		tf1.setBounds(200, 54, 96, 20);
		
		tf2 = new JTextField();
		tf2.setBounds(200, 94, 96, 20);
		
		tf3 = new JTextField();
		tf3.setBounds(200, 134, 96, 20);
		
		jrb1 = new JRadioButton("Male");
		jrb1.setBounds(96, 170, 55, 23);
		
		jrb2 = new JRadioButton("Female");
		jrb2.setBounds(158, 170, 97, 23);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		
		submit = new JButton("Submit");
		submit.setBounds(158, 225, 97, 23);
		
		submit.addActionListener(this);
		
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(jrb1);
		frame.add(jrb2);
		frame.add(submit);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	
	public static void main(String[] args) throws IOException 
	{
		
		new Registerform();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == submit)
		{
			
			
			try {
				
				FileOutputStream fout = new FileOutputStream("D://tops.txt");
			
				String f = "\n Your Firstname is: ";
				
				fout.write(f.getBytes());
				fout.write(tf1.getText().getBytes());
				
				String l = "\n Your lastname is: ";
				
				fout.write(l.getBytes());
				fout.write(tf2.getText().getBytes());
				
				String mail = "\n Your Email is: ";
				
				fout.write(mail.getBytes());
				fout.write(tf3.getText().getBytes());
				
				String gender = "\n Your Gender is: ";
				
				fout.write(gender.getBytes());
				if(jrb1.isSelected())
				{
					fout.write(jrb1.getText().getBytes());
				}
				else if(jrb2.isSelected())
				{
					fout.write(jrb2.getText().getBytes());
				}
				
				fout.close();
				System.out.println("Executed");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
	
			
		}
		
	}

}
