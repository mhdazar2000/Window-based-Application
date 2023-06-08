package swings;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tfr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("CALCULATOR");
		heading.setBackground(Color.WHITE);
		heading.setBounds(120, 0, 164, 29);
		heading.setFont(new Font("Arial Black", Font.BOLD, 20));
		contentPane.add(heading);
		
		JLabel lable1 = new JLabel("A");
		lable1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lable1.setBounds(102, 47, 12, 20);
		contentPane.add(lable1);
		
		JLabel lable2 = new JLabel("B");
		lable2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lable2.setBounds(102, 80, 12, 20);
		contentPane.add(lable2);
		
		tf1 = new JTextField();
		tf1.setBounds(155, 49, 86, 20);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(155, 80, 86, 20);
		contentPane.add(tf2);
		
		JButton ADD = new JButton("ADD");
		ADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic for ADD
				int var1 = Integer.valueOf(tf1.getText());
				int var2 = Integer.valueOf(tf2.getText());
				String result = String.valueOf(var1+var2);
				tfr.setText(result);
			}
		});
		ADD.setFont(new Font("Calibri", Font.BOLD, 15));
		ADD.setBounds(10, 178, 59, 27);
		contentPane.add(ADD);
		
		JButton SUB = new JButton("SUB");
		SUB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic for Sub
				int var1 = Integer.valueOf(tf1.getText());
				int var2 = Integer.valueOf(tf2.getText());
				String result = String.valueOf(var1-var2);
				tfr.setText(result);
			}
		});
		SUB.setFont(new Font("Calibri", Font.BOLD, 15));
		SUB.setBounds(100, 178, 59, 27);
		contentPane.add(SUB);
		
		JButton MUL = new JButton("MUL");
		MUL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic for mul
				int var1 = Integer.valueOf(tf1.getText());
				int var2 = Integer.valueOf(tf2.getText());
				String result = String.valueOf(var1*var2);
				tfr.setText(result);
			}
		});
		MUL.setFont(new Font("Calibri", Font.BOLD, 15));
		MUL.setBounds(183, 178, 61, 27);
		contentPane.add(MUL);
		
		JButton DIV = new JButton("DIV");
		DIV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// logic for div
				float var1 = Float.valueOf(tf1.getText());
				float var2 = Float.valueOf(tf2.getText());
				String result = String.valueOf(var1/var2);
				tfr.setText(result);
			}
		});
		DIV.setFont(new Font("Calibri", Font.BOLD, 15));
		DIV.setBounds(274, 178, 59, 27);
		contentPane.add(DIV);
		
		JButton MOD = new JButton("MOD");
		MOD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic for MOD
				int var1 = Integer.valueOf(tf1.getText());
				int var2 = Integer.valueOf(tf2.getText());
				String result = String.valueOf(var1%var2);
				tfr.setText(result);
			}
		});
		MOD.setFont(new Font("Calibri", Font.BOLD, 15));
		MOD.setBounds(359, 178, 65, 27);
		contentPane.add(MOD);
		
		JLabel lable3 = new JLabel("Result");
		lable3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lable3.setBounds(84, 121, 48, 19);
		contentPane.add(lable3);
		
		tfr = new JTextField();
		tfr.setColumns(10);
		tfr.setBounds(155, 122, 86, 20);
		contentPane.add(tfr);
	}
}
