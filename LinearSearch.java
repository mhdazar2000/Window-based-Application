package swings;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LinearSearch extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LinearSearch frame = new LinearSearch();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame
	 */
	String key;
	String result="";
	public LinearSearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("LINEAR SEARCH");
		heading.setFont(new Font("Arial Black", Font.BOLD, 20));
		heading.setBounds(107, 11, 197, 29);
		contentPane.add(heading);
		
		JLabel lable1 = new JLabel("Enter 5 Numbers");
		lable1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lable1.setBounds(22, 64, 102, 15);
		contentPane.add(lable1);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(202, 64, -40, 22);
		contentPane.add(ta1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(182, 60, 177, 29);
		contentPane.add(textArea);
		
		JLabel lable2 = new JLabel("Enter KEY to Search");
		lable2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lable2.setBounds(22, 100, 140, 29);
		contentPane.add(lable2);
		
		JTextArea ta2 = new JTextArea();
		ta2.setBounds(182, 100, 177, 29);
		contentPane.add(ta2);
		
		JLabel lable3 = new JLabel("RESULT");
		lable3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lable3.setBounds(98, 156, 64, 20);
		contentPane.add(lable3);
		
		JTextArea ta3 = new JTextArea();
		ta3.setBounds(182, 156, 177, 29);
		contentPane.add(ta3);
		
		JButton LS = new JButton("LINEAR SEARCH");
		LS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic for linear search
				String sentence = ta1.getText();
				String arr[]= sentence.split(" ");
				
				
				for(int i=0;i<=arr.length-1;i++)
				{
					if(key==arr[i])
					{
						System.out.println("key found @"+i);
						System.exit(0);
					}
				}
				System.out.println("key not found");
				
				for(int i=0;i<=arr.length-1;i++)
				{
					result=result+arr[i]+" ";
					{
						ta2.setText(result);
					}
				}
			}
		});
		LS.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		LS.setBounds(250, 209, 153, 27);
		contentPane.add(LS);
	}
}
