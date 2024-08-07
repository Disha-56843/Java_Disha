package Module3_Module_Java_RDBMS_Database;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.ResultSetMetaData;

public class Que_2 {

	JFrame frame;
	JLabel l1, l2, l3, l4, l5, l6;
	JTextField tf1, tf2, tf3, tf4;
	JRadioButton jrb1, jrb2;
	ButtonGroup bg;
	JButton btn1, btn2, btn3, btn4, btn5, btn6;
	JTable jt;
	DefaultTableModel model;
	JScrollPane scrollpane;

	public Que_2() {
		// TODO Auto-generated constructor stub

		frame = new JFrame("REGISTRATION FRAME");

		l1 = new JLabel("Registration Form");
		l1.setBounds(52, 16, 129, 14);

		l2 = new JLabel("Id");
		l2.setBounds(10, 56, 49, 14);

		l3 = new JLabel("Name");
		l3.setBounds(10, 96, 49, 14);

		l4 = new JLabel("Gender");
		l4.setBounds(10, 136, 49, 14);

		l5 = new JLabel("Address");
		l5.setBounds(10, 176, 49, 14);

		l6 = new JLabel("Contact");
		l6.setBounds(10, 216, 49, 14);

		tf1 = new JTextField();
		tf1.setBounds(93, 56, 96, 20);

		tf2 = new JTextField();
		tf2.setBounds(93, 96, 96, 20);

		tf3 = new JTextField();
		tf3.setBounds(93, 176, 96, 20);

		tf4 = new JTextField();
		tf4.setBounds(93, 216, 96, 20);

		jrb1 = new JRadioButton("Male");
		jrb1.setBounds(90, 136, 55, 23);

		jrb2 = new JRadioButton("Female");
		jrb2.setBounds(150, 136, 97, 23);

		bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);

		btn1 = new JButton("Exit");
		btn1.setBounds(10, 259, 89, 23);

		btn2 = new JButton("Register");
		btn2.setBounds(110, 259, 89, 23);

		btn3 = new JButton("Delete");
		btn3.setBounds(10, 299, 89, 23);

		btn4 = new JButton("Update");
		btn4.setBounds(110, 299, 89, 23);

		btn5 = new JButton("Reset");
		btn5.setBounds(60, 330, 89, 23);

		btn6 = new JButton("Refresh Table");
		btn6.setBounds(380, 329, 259, 23);

//		jt.getTableHeader().setReorderingAllowed(false);
		jt = new JTable(model);
		jt.setBounds(250, 16, 500, 300);

		scrollpane = new JScrollPane(jt, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollpane.setBounds(250, 16, 520, 310);

		frame.add(scrollpane);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(tf4);
		frame.add(jrb1);
		frame.add(jrb2);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		frame.setSize(800, 400);
		frame.setLayout(null);
		frame.setVisible(true);

		// Exit Frame
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				// Data Update
				if (e.getSource() == btn1) {
					frame.setVisible(false);
				}

			}
		});

		// Data Insert
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				// Data insert or register
				if (e.getSource() == btn2) {
					// data for connection
					String db = "registration";
					String host = "jdbc:mysql://localhost:3306/";
					String url = host + db;

					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection(url, "root", "");

						String id2 = tf1.getText().toString();
						int id = Integer.parseInt(id2);
						String name = tf2.getText().toString();
						String gender = null;
						String address = tf3.getText().toString();
						String contact = tf4.getText().toString();

						if (jrb1.isSelected()) {
							gender = jrb1.getText().toString();
						} else if (jrb2.isSelected()) {
							gender = jrb2.getText().toString();
						}

						String sql = "insert into registration (id,name,gender,address,contact) values ('" + id + "','"
								+ name + "','" + gender + "','" + address + "','" + contact + "')";

						// query run
						Statement stmt = con.createStatement();
						int data = stmt.executeUpdate(sql);

						if (data > 0) {
							System.out.println("Registration completed");

						} else {
							System.out.println("Error");
						}

					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

			}
		});

		// Data delete
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (e.getSource() == btn3) {
					String id = tf1.getText().toString();
					int id2 = Integer.parseInt(id);

					String db = "registration";
					String host = "jdbc:mysql://localhost:3306/";
					String url = host + db;

					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection(url, "root", "");

						String sql = "delete from registration where id='" + id2 + "'";
						Statement stmt = con.createStatement();

						int data = stmt.executeUpdate(sql);

						if (data > 0) {

							System.out.println("Data deleted successfully");

						} else {
							System.out.println("Error");
						}

					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

			}
		});

		// Data Update
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (e.getSource() == btn4) {

					String db = "registration";
					String host = "jdbc:mysql://localhost:3306/";
					String url = host + db;


							try {
								Class.forName("com.mysql.jdbc.Driver");
								Connection con1 = DriverManager.getConnection(url, "root", "");

								String id = tf1.getText().toString();
								int id1 = Integer.parseInt(id);
								String uname = tf2.getText().toString();
								String ugender = null;
								String uaddress = tf3.getText().toString();
								String ucontact = tf4.getText().toString();

								if (jrb1.isSelected()) {
									ugender = jrb1.getText().toString();
								} else if (jrb2.isSelected()) {
									ugender = jrb2.getText().toString();
								}

								String sql1 = "update registration set name='" + uname + "',gender='" + ugender
										+ "',address='" + uaddress + "',contact='" + ucontact + "' where id='" + id1
										+ "'";

								Statement stmt1 = con1.createStatement();
								int data = stmt1.executeUpdate(sql1);

								if (data > 0) {

									System.out.println("Data updated successfully");
								} else {
									System.out.println("Error");
								}
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}

						}

					

				}

			
		});

		// Data reset
		btn5.addActionListener(new ActionListener() {

	@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (e.getSource() == btn5) {

					// fields will be blank

					tf1.setText("");

					tf2.setText("");

					bg.clearSelection();

					tf3.setText("");

					tf4.setText("");

				}

			}
		});

		// show data in JTable
		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (e.getSource() == btn6) {

					model = new DefaultTableModel();

					String db = "registration";
					String host = "jdbc:mysql://localhost:3306/";
					String url = host + db;

					try {

						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection(url, "root", "");

						Statement stmt = con.createStatement();
						String sql = "select * from registration";

						ResultSet rs = stmt.executeQuery(sql);
						ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();

						model = (DefaultTableModel) jt.getModel();

						int cols = rsmd.getColumnCount();
						String[] colName = new String[cols];
						for (int i = 0; i < cols; i++)
							colName[i] = rsmd.getColumnName(i + 1);

						while (rs.next()) {
							String srno = String.valueOf(rs.getInt(1));
							String id = String.valueOf(rs.getInt(2));
							String name = rs.getString(3);
							String gender = rs.getString(4);
							String address = rs.getString(5);
							String contact = rs.getString(6);

							model.setColumnIdentifiers(colName);
							String data[] = { srno, id, name, gender, address, contact };
							model.addRow(data);

						}
						;

					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}

			}
		});

	}

	public static void main(String[] args) {

		new Que_2();

	}
}
