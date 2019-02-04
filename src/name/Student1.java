package name;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;

public class Student1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblEnglish;
	private JTextField textField_5;
	private JLabel lblHindi;
	private JTextField textField_6;
	private JLabel lblMath;
	private JTextField textField_7;
	private JLabel lblPhysics;
	private JTextField textField_8;
	private JLabel lblChemistry;
	private JTextField textField_9;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField grade_1;
	private JTextField total_1;
	private JTextField per_1;
	private JLabel lblNewLabel_8;
     
	
	String grade;
	double percentage;
	int  total;
	private JButton btnper;
	private JButton btnNewButton_4;
	private JTextArea textArea;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student1 window = new Student1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Student1() {
		initialize();
	}

	
	private void initialize() {
		//conn=JdbcDemo.dbConnector();	
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(144, 238, 144));
		frame.setBounds(100, 100, 1021, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(41, 44, 94, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FATHER NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(41, 84, 129, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BRANCH");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(41, 125, 98, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH CODE");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(41, 166, 138, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("SEMESTER");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(41, 203, 105, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.BOLD, 18));
		textField.setBounds(202, 44, 138, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.BOLD, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(202, 83, 138, 22);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.BOLD, 18));
		textField_2.setBounds(205, 124, 135, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Dialog", Font.BOLD, 18));
		textField_3.setBounds(202, 165, 138, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Dialog", Font.BOLD, 18));
		textField_4.setBounds(205, 202, 135, 22);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		lblEnglish = new JLabel("ENGLISH");
		lblEnglish.setFont(new Font("Dialog", Font.BOLD, 20));
		lblEnglish.setBounds(485, 42, 116, 16);
		frame.getContentPane().add(lblEnglish);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Dialog", Font.BOLD, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(657, 39, 149, 22);
		frame.getContentPane().add(textField_5);
		
		lblHindi = new JLabel("HINDI");
		lblHindi.setFont(new Font("Dialog", Font.BOLD, 20));
		lblHindi.setBounds(485, 83, 96, 16);
		frame.getContentPane().add(lblHindi);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Dialog", Font.BOLD, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(657, 78, 149, 22);
		frame.getContentPane().add(textField_6);
		
		lblMath = new JLabel("MATH");
		lblMath.setFont(new Font("Dialog", Font.BOLD, 20));
		lblMath.setBounds(485, 124, 96, 16);
		frame.getContentPane().add(lblMath);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Dialog", Font.BOLD, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(660, 121, 146, 22);
		frame.getContentPane().add(textField_7);
		
		lblPhysics = new JLabel("PHYSICS");
		lblPhysics.setFont(new Font("Dialog", Font.BOLD, 20));
		lblPhysics.setBounds(485, 165, 116, 16);
		frame.getContentPane().add(lblPhysics);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Dialog", Font.BOLD, 18));
		textField_8.setColumns(10);
		textField_8.setBounds(657, 162, 149, 22);
		frame.getContentPane().add(textField_8);
		
		lblChemistry = new JLabel("CHEMISTRY");
		lblChemistry.setFont(new Font("Dialog", Font.BOLD, 20));
		lblChemistry.setBounds(485, 214, 138, 16);
		frame.getContentPane().add(lblChemistry);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Dialog", Font.BOLD, 18));
		textField_9.setColumns(10);
		textField_9.setBounds(657, 211, 146, 22);
		frame.getContentPane().add(textField_9);
		
		lblNewLabel_5 = new JLabel("GRADE");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_5.setBounds(67, 372, 110, 23);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("TOTAL ");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_6.setBounds(67, 262, 110, 23);
		frame.getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("PERCENTAGE");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_7.setBounds(66, 314, 149, 23);
		frame.getContentPane().add(lblNewLabel_7);
		
		grade_1 = new JTextField();
		grade_1.setFont(new Font("Dialog", Font.BOLD, 18));
		grade_1.setBounds(270, 374, 116, 22);
		frame.getContentPane().add(grade_1);
		grade_1.setColumns(10);
		
		total_1 = new JTextField();
		total_1.setFont(new Font("Dialog", Font.BOLD, 18));
		total_1.setBounds(270, 264, 116, 22);
		frame.getContentPane().add(total_1);
		total_1.setColumns(10);
		
		per_1 = new JTextField();
		per_1.setFont(new Font("Dialog", Font.BOLD, 18));
		per_1.setBounds(270, 316, 116, 22);
		frame.getContentPane().add(per_1);
		per_1.setColumns(10);
		
		lblNewLabel_8 = new JLabel("RESULT");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_8.setBounds(375, 13, 110, 31);
		frame.getContentPane().add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("TOTAL");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1 = Integer.parseInt(textField_5.getText());
				int num2 = Integer.parseInt(textField_6.getText());
				int num3 = Integer.parseInt(textField_7.getText());
				int num4 = Integer.parseInt(textField_8.getText());
				int num5 = Integer.parseInt(textField_9.getText());
				
				 total = (num1+num2+num3+num4+num5);
				 String out =  String.valueOf(total);
				total_1.setText(out);		
			}
		});
		btnNewButton.setBounds(12, 435, 149, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textArea.setText("");
				textField.setText("");
				grade_1.setText("");
				per_1.setText("");
				total_1.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(12, 613, 156, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("GRADE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(percentage>90)
				{
					grade_1.setText("A");
					
				}
				else{
					if(percentage>70){
						grade_1.setText("B");
					}
					else
					{
						if(percentage>55){
							grade_1.setText("C");
							
						}
						else
						{
							if(percentage>40)
							{
								grade_1.setText("D");
							}
							else
								grade_1.setText("FAIL");
						}
							
					}
				}
			}
			
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setBounds(12, 535, 149, 35);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("EXIT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);	
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_3.setBackground(Color.RED);
		btnNewButton_3.setBounds(225, 614, 184, 35);
		frame.getContentPane().add(btnNewButton_3);
		
		btnper = new JButton("PERCENTAGE");
		btnper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textField_5.getText());
				int num2 = Integer.parseInt(textField_6.getText());
				int num3 = Integer.parseInt(textField_7.getText());
				int num4 = Integer.parseInt(textField_8.getText());
				int num5 = Integer.parseInt(textField_9.getText());
				
				 percentage = (num1+num2+num3+num4+num5)/5;
				 String out =  String.valueOf(percentage);
				per_1.setText(out);
			}
		});
		btnper.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnper.setBackground(Color.RED);
		btnper.setBounds(186, 436, 223, 35);
		frame.getContentPane().add(btnper);
		
		btnNewButton_4 = new JButton("DISPLAY");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("NAME::"+textField.getText()+"\n"+"FATHER NAME::"+textField_1.getText()+"\n"+"BRANCH::"+textField_2.getText()+"\n"+"BRANCH CODE::"+textField_3.getText()+"\n"+"SEMESTER::"+textField_4.getText()+"\n"+"ENGLISH::"+textField_5.getText()+"\n"+"HINDI::"+textField_6.getText()+"\n"+"MATH::"+textField_7.getText()+"\n"+"PHYSICS::"+textField_8.getText()+"\n"+"CHEMISTRY::"+textField_9.getText()+"\n"+"\n"+"TOTAL::"+total_1.getText()+"\n"+"PERCENTAGE::"+per_1.getText()+"\n"+"GRADE::"+grade_1.getText()+"\n");
			
				
							}
		});
		btnNewButton_4.setBackground(new Color(255, 0, 0));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton_4.setBounds(186, 535, 223, 35);
		frame.getContentPane().add(btnNewButton_4);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 21));
		textArea.setBounds(457, 262, 425, 418);
		frame.getContentPane().add(textArea);
	}
}
