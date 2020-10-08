package karthick.mca.sowmiya.KarthickMca.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Simple extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Simple frame = new Simple();
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
	public Simple() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 635, 420);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBackground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblContentCouldBe = new JLabel("Content could be visible here: ");
		lblContentCouldBe.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		lblContentCouldBe.setBounds(188, 54, 279, 44);
		contentPane.add(lblContentCouldBe);
		
		JButton btnHai = new JButton("Hai");
		btnHai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblContentCouldBe.setText("Button clicked by Karthick");
			}
		});
		
		btnHai.setForeground(Color.MAGENTA);
		btnHai.setBackground(Color.BLUE);
		btnHai.setBounds(129, 258, 89, 23);
		contentPane.add(btnHai);
	}
}
