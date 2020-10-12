package karthick.mca.sowmiya.KarthickMca.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
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
	public SignIn() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 384);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblSampleSignin = new JLabel("Sample SignIn");
		lblSampleSignin.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
		lblSampleSignin.setBounds(165, 24, 150, 27);
		contentPane.add(lblSampleSignin);
		
		JLabel lblUserName = new JLabel("User name: ");
		lblUserName.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblUserName.setBounds(67, 95, 101, 27);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblPassword.setBounds(67, 174, 101, 27);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(269, 99, 150, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('$');
		passwordField.setBounds(269, 178, 150, 20);
		contentPane.add(passwordField);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("karthik")&&passwordField.getText().equals("salem"))
				{
					JOptionPane.showMessageDialog(SignIn.this, "You are authenticated");
					Home frame = new Home();
					frame.setVisible(true);
					SignIn.this.dispose();
				}
				else {JOptionPane.showMessageDialog(SignIn.this, "Invalid login");}
			}
		});
		btnLogIn.setBounds(165, 263, 89, 23);
		contentPane.add(btnLogIn);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
			}
		});
		btnClear.setBounds(269, 263, 89, 23);
		contentPane.add(btnClear);
	}
}
