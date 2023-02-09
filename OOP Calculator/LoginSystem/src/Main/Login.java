package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
//import javax.swing.border.TitledBorder;
//import javax.swing.border.EtchedBorder;
//import javax.swing.border.MatteBorder;

public class Login {

	private JFrame frame;
	private JTextField txtUserName;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame("Login");
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(0, 158, 255));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\THIRD\\OOP Calculator\\IMG\\3706.png_300.png"));
		frame.setBounds(100, 100, 379, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 158, 255));
		panel.setBounds(27, 185, 309, 150);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(new Color(0, 0, 0));
		lblUsername.setBounds(10, 30, 83, 14);
		panel.add(lblUsername);
		lblUsername.setBackground(new Color(32, 38, 46));
		lblUsername.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
		txtUserName = new JTextField();
		txtUserName.setBounds(113, 22, 187, 30);
		panel.add(txtUserName);
		txtUserName.setFont(new Font("SansSerif", Font.PLAIN, 14));
		txtUserName.setForeground(new Color(32, 38, 46));
		txtUserName.setColumns(10);
		txtPassword = new JPasswordField();
		txtPassword.setEchoChar('*');
		txtPassword.setBounds(115, 72, 185, 30);
		panel.add(txtPassword);
		txtPassword.setForeground(new Color(0, 0, 0));
		txtPassword.setFont(new Font("SansSerif", Font.BOLD, 14));
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setBounds(10, 80, 83, 14);
		panel.add(lblPassword);
		lblPassword.setBackground(new Color(32, 38, 46));
		lblPassword.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
//Login Button
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(217, 113, 83, 30);
		panel.add(btnLogin);
		btnLogin.setFont(new Font("SansSerif", Font.PLAIN, 14));
		btnLogin.setForeground(new Color(32, 38, 46));
		btnLogin.setBackground(new Color(255, 255, 255));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("D:\\THIRD\\OOP Calculator\\IMG\\user (1).png"));
		lblNewLabel.setBounds(89, 22, 187, 30);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\THIRD\\OOP Calculator\\IMG\\password (4).png"));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(89, 72, 187, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("D:\\THIRD\\OOP Calculator\\IMG\\new.png"));
		lblNewLabel_2.setBounds(73, 11, 216, 171);
		frame.getContentPane().add(lblNewLabel_2);
		
		
//*Dito start ng btn		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = txtUserName.getText();
				String password = txtPassword.getText();
				if (userName == null || userName.isEmpty() || password == null || password.isEmpty()) {
					JOptionPane.showMessageDialog(frame, "Please enter username and password", "Warning", JOptionPane.WARNING_MESSAGE);
					
				}else if (userName.contains("admin") && password.contains("admin123")) {
					txtUserName.setText(null);
					txtPassword.setText(null);
					
					frame.dispose();	
					calc calculator = new calc();	
					calculator.setVisible(true);
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
				}	
			}	
		});
//*dito end				
	}
}
