import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class enrollment extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup rightbutton = new ButtonGroup();
	private final ButtonGroup leftbutton = new ButtonGroup();
	private final ButtonGroup compute = new ButtonGroup();
	private final ButtonGroup btnGroup1 = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					enrollment frame = new enrollment();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	DefaultListModel jlistOneModel,jlistTwoModel;
	String str[]= {"MAT211E", "ENG211", "CPE211", "CPE211LAB", "GE105", "GE106", "DR211", "DR211LAB", "EE211", "EE211LAB", "PE113"};
	Double courseprice;
	Double coursetotal;
	Double discount5;
	Double discount10;
	Double discount15;
	Double totaldiscount;
	Integer coursecount;
	
	
	
	    public enrollment() {
	    
	    jlistOneModel = new DefaultListModel();
	    jlistTwoModel = new DefaultListModel();
		setTitle("ENROLLMENT FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 759);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(158, 72, 112));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(46, 37, 50));
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 929, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENROLLMENT FORM");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(3, 5, 420, 45);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(251, 251, 251));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
		
		JLabel lblStudentInfo = new JLabel("STUDENT INFO");
		lblStudentInfo.setBackground(new Color(251, 251, 251));
		lblStudentInfo.setForeground(Color.WHITE);
		lblStudentInfo.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
		lblStudentInfo.setBounds(26, 62, 140, 28);
		contentPane.add(lblStudentInfo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBackground(new Color(46, 37, 50));
		panel_1.setBounds(0, 62, 214, 28);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Student Number: ");
		lblNewLabel_1.setForeground(new Color(251, 251, 251));
		lblNewLabel_1.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
		lblNewLabel_1.setBackground(new Color(251, 251, 251));
		lblNewLabel_1.setBounds(10, 100, 191, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Student Name:");
		lblNewLabel_1_1.setForeground(new Color(251, 251, 251));
		lblNewLabel_1_1.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
		lblNewLabel_1_1.setBackground(new Color(251, 251, 251));
		lblNewLabel_1_1.setBounds(10, 139, 191, 28);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(171, 146, 236, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(171, 107, 236, 20);
		contentPane.add(textField_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setForeground(Color.WHITE);
		panel_1_1.setBackground(new Color(46, 37, 50));
		panel_1_1.setBounds(0, 192, 214, 28);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblStudentCourse = new JLabel("STUDENT COURSE");
		lblStudentCourse.setBounds(13, 2, 178, 24);
		panel_1_1.add(lblStudentCourse);
		lblStudentCourse.setForeground(Color.WHITE);
		lblStudentCourse.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
		lblStudentCourse.setBackground(new Color(251, 251, 251));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BSCE", "BSIT", "BSCpE"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(175, 235, 232, 22);
		contentPane.add(comboBox);
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Student Degree:");
		lblNewLabel_1_1_1.setForeground(new Color(251, 251, 251));
		lblNewLabel_1_1_1.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBackground(new Color(251, 251, 251));
		lblNewLabel_1_1_1.setBounds(10, 229, 191, 28);
		contentPane.add(lblNewLabel_1_1_1);
		
		JList listbox2 = new JList();
		listbox2.setBounds(257, 280, 127, 177);
		contentPane.add(listbox2);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setForeground(Color.WHITE);
		panel_1_1_1.setBackground(new Color(46, 37, 50));
		panel_1_1_1.setBounds(0, 506, 214, 28);
		contentPane.add(panel_1_1_1);
		
		JLabel lblStudent = new JLabel("STUDENT DISCOUNT");
		lblStudent.setForeground(Color.WHITE);
		lblStudent.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
		lblStudent.setBackground(new Color(251, 251, 251));
		lblStudent.setBounds(8, 2, 244, 24);
		panel_1_1_1.add(lblStudent);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("5% DISCOUNT");
		btnGroup1.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Gill Sans MT", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBackground(new Color(158, 72, 112));
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBounds(13, 547, 118, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnDiscount = new JRadioButton("10% DISCOUNT");
		btnGroup1.add(rdbtnDiscount);
		rdbtnDiscount.setForeground(new Color(255, 255, 255));
		rdbtnDiscount.setFont(new Font("Gill Sans MT", Font.PLAIN, 13));
		rdbtnDiscount.setBackground(new Color(158, 72, 112));
		rdbtnDiscount.setBounds(144, 547, 127, 23);
		contentPane.add(rdbtnDiscount);
		
		JRadioButton rdbtnDiscount_1 = new JRadioButton("15% DISCOUNT");
		btnGroup1.add(rdbtnDiscount_1);
		rdbtnDiscount_1.setForeground(new Color(255, 255, 255));
		rdbtnDiscount_1.setFont(new Font("Gill Sans MT", Font.PLAIN, 13));
		rdbtnDiscount_1.setBackground(new Color(158, 72, 112));
		rdbtnDiscount_1.setBounds(273, 547, 118, 23);
		contentPane.add(rdbtnDiscount_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setForeground(Color.WHITE);
		panel_1_1_1_1.setBackground(new Color(46, 37, 50));
		panel_1_1_1_1.setBounds(0, 591, 214, 28);
		contentPane.add(panel_1_1_1_1);
		
		JLabel lblTotalPayment = new JLabel("TOTAL PAYMENT");
		lblTotalPayment.setForeground(Color.WHITE);
		lblTotalPayment.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
		lblTotalPayment.setBackground(new Color(251, 251, 251));
		lblTotalPayment.setBounds(17, 2, 244, 24);
		panel_1_1_1_1.add(lblTotalPayment);
		
		JList listbox1 = new JList();
		listbox1.setBounds(39, 280, 127, 177);
		contentPane.add(listbox1);
		
		JLabel lblTotal = new JLabel("TOTAL: ");
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
		lblTotal.setBackground(new Color(251, 251, 251));
		lblTotal.setBounds(10, 630, 244, 24);
		contentPane.add(lblTotal);
		
		//populate list
		for (int i=0; i<str.length;i++) {
	    	jlistOneModel.addElement(str[i]);
	    	}
		listbox1.setModel(jlistOneModel);
		
		
		
	   JButton rightbutton = new JButton(">");
		rightbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String str2= listbox1.getSelectedValue().toString();
					
					if(listbox1.getSelectedIndex()==-1) {
						JOptionPane.showMessageDialog(rootPane, "No Data Selected.","Try Again", 1);
					}else {
					//add value
					Integer value =listbox1.getSelectedIndex();
					jlistTwoModel.addElement(str2);
					listbox2.setModel(jlistTwoModel);
					
					//remove
					if (jlistOneModel.getSize()!=0) {
						jlistOneModel.removeElementAt(value);
					}
					listbox1.setModel(jlistOneModel);
					}
					
						}
		});
		rightbutton.setForeground(new Color(46, 37, 50));
		rightbutton.setBackground(new Color(239, 188, 213));
		rightbutton.setOpaque(true);
		rightbutton.setBorderPainted(false);
		rightbutton.setFont(new Font("Roboto", Font.BOLD, 18));
		rightbutton.setBounds(177, 341, 70, 20);
		contentPane.add(rightbutton);
		
		JButton leftbutton = new JButton("<");
		leftbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str2= listbox2.getSelectedValue().toString();
				
				if(listbox2.getSelectedIndex()==-1) {
					JOptionPane.showMessageDialog(rootPane, "No Data Selected.","Try Again", 1);
				}else {
				//add value
				Integer value =listbox2.getSelectedIndex();
				jlistOneModel.addElement(str2);
				listbox1.setModel(jlistOneModel);
				
				//remove
				if (jlistTwoModel.getSize()!=0) {
					jlistTwoModel.removeElementAt(value);
				}
				listbox2.setModel(jlistTwoModel);
				}
				
			
			}
		});
		
		JLabel lblPayment = new JLabel("");
		lblPayment.setForeground(Color.WHITE);
		lblPayment.setFont(new Font("Gill Sans MT", Font.PLAIN, 20));
		lblPayment.setBackground(new Color(251, 251, 251));
		lblPayment.setBounds(87, 630, 244, 24);
		contentPane.add(lblPayment);
		
		leftbutton.setForeground(new Color(46, 37, 50));
		leftbutton.setBackground(new Color(239, 188, 213));
		leftbutton.setOpaque(true);
		leftbutton.setBorderPainted(false);
		leftbutton.setFont(new Font("Roboto", Font.BOLD, 18));
		leftbutton.setBounds(177, 372, 70, 20);
		contentPane.add(leftbutton);
		
		JButton computebutton = new JButton("COMPUTE");
		computebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//set variable
				coursetotal = (double)0;
				coursecount = (Integer)0;
				discount5 = (double)0.05;
				discount10 = (double)0.10;
				discount15 = (double)0.15;
				totaldiscount = (double)0.0;
				coursecount = jlistTwoModel.getSize();
				//5%discount
				if(rdbtnNewRadioButton.isSelected()) {
					
					coursetotal = coursecount * 1000.00;
					
					//500php
					if(jlistTwoModel.contains("CPE211LAB")) {
						coursetotal = coursetotal + 500 - 1000;					 
					}
					if(jlistTwoModel.contains("EE211LAB")) {
						coursetotal = coursetotal + 500 - 1000;	
					}
					if(jlistTwoModel.contains("DR211LAB")) {
						coursetotal = coursetotal + 500 - 1000;	
					}
					totaldiscount = coursetotal * discount5;
					coursetotal = coursetotal-totaldiscount;
					lblPayment.setText(coursetotal.toString());
					
				}
				//10%discount
				if(rdbtnDiscount.isSelected()) {
					
					coursetotal = coursecount * 1000.00;
					
					//500php
					if(jlistTwoModel.contains("CPE211LAB")) {
						coursetotal = coursetotal + 500 - 1000;					 
					}
					if(jlistTwoModel.contains("EE211LAB")) {
						coursetotal = coursetotal + 500 - 1000;	
					}
					if(jlistTwoModel.contains("DR211LAB")) {
						coursetotal = coursetotal + 500 - 1000;	
					}
					totaldiscount = coursetotal * discount10;
					coursetotal = coursetotal-totaldiscount;
					lblPayment.setText(coursetotal.toString());
					
				}
				//15%discount
				if(rdbtnDiscount_1.isSelected()) {
					
					coursetotal = coursecount * 1000.00;
					
					//500php
					if(jlistTwoModel.contains("CPE211LAB")) {
						coursetotal = coursetotal + 500 - 1000;					 
					}
					if(jlistTwoModel.contains("EE211LAB")) {
						coursetotal = coursetotal + 500 - 1000;	
					}
					if(jlistTwoModel.contains("DR211LAB")) {
						coursetotal = coursetotal + 500 - 1000;	
					}
					totaldiscount = coursetotal * discount15;
					coursetotal = coursetotal-totaldiscount;
					lblPayment.setText(coursetotal.toString());
					
				}
				
			}
		});
		computebutton.setOpaque(true);
		computebutton.setBorderPainted(false);
		computebutton.setForeground(new Color(46, 37, 50));
		computebutton.setBackground(new Color(239, 188, 213));
		computebutton.setFont(new Font("Roboto", Font.BOLD, 18));
		computebutton.setBounds(0, 663, 127, 41);
		contentPane.add(computebutton);
		
	}
}
