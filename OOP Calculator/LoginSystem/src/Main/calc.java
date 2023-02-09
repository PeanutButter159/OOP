	package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class calc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	
	double first, second, result;
	String operation, answer; 
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc frame = new calc();
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
	public calc() {
		setTitle("Calculator");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\THIRD\\OOP Calculator\\IMG\\3706.png_300.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 322, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(12, 11, 280, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});	
		btnAdd.setBounds(12, 58, 61, 36);
		contentPane.add(btnAdd);
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = textField.getText() + btn3.getText();
				textField.setText(num1);
			}
		});	
		btn3.setBounds(231, 58, 61, 36);
		contentPane.add(btn3);
		
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String num1 = textField.getText() + btn1.getText();
				textField.setText(num1);
			}
		});	
		btn1.setBounds(85, 58, 61, 36);
		contentPane.add(btn1);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = textField.getText() + btn2.getText();
				textField.setText(num1);
			}
		});	
		btn2.setBounds(158, 58, 61, 36);
		contentPane.add(btn2);
		
		JButton btnMin = new JButton("-");
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});	
		btnMin.setBounds(12, 108, 61, 36);
		contentPane.add(btnMin);
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = textField.getText() + btn4.getText();
				textField.setText(num1);
			}
			
		});	
		btn4.setBounds(85, 108, 61, 36);
		contentPane.add(btn4);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = textField.getText() + btn5.getText();
				textField.setText(num1);
			}
		});	
		btn5.setBounds(158, 108, 61, 36);
		contentPane.add(btn5);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = textField.getText() + btn6.getText();
				textField.setText(num1);
			}
		});
		btn6.setBounds(231, 108, 61, 36);
		contentPane.add(btn6);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});		
		btnMul.setBounds(12, 155, 61, 36);
		contentPane.add(btnMul);
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = textField.getText() + btn7.getText();
				textField.setText(num1);
			}
		});	
		btn7.setBounds(85, 155, 61, 36);
		contentPane.add(btn7);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = textField.getText() + btn8.getText();
				textField.setText(num1);
			}
		});
		
		btn8.setBounds(158, 155, 61, 36);
		contentPane.add(btn8);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = textField.getText() + btn9.getText();
				textField.setText(num1);
			}
		});		
		btn9.setBounds(231, 155, 61, 36);
		contentPane.add(btn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});	
		btnDiv.setBounds(12, 202, 61, 36);
		contentPane.add(btnDiv);
		
		final JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = textField.getText() + btnDot.getText();
				textField.setText(num1);
			}
		});	
		btnDot.setBounds(85, 202, 61, 36);
		contentPane.add(btnDot);
		
		final JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = textField.getText() + btn0.getText();
				textField.setText(num1);
			}
		});
		btn0.setBounds(158, 202, 61, 36);
		contentPane.add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setBounds(231, 202, 61, 36);
		contentPane.add(btnClear);
		
		JButton btnTotal = new JButton("=");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				
				if (operation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if (operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if (operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if (operation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnTotal.setBounds(86, 249, 134, 36);
		contentPane.add(btnTotal);
	}
}
