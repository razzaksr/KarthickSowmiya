package karthick.mca.sowmiya.KarthickMca.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Home extends JFrame implements ActionListener
{

	private JPanel contentPane;
	private JMenuItem m1, m2, m3, m4;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnSmallItems = new JMenu("Small Items");
		menuBar.add(mnSmallItems);
		
		m1 = new JMenuItem("Checkbox demo");
		mnSmallItems.add(m1);
		m1.addActionListener(this);
		
		m2 = new JMenuItem("RadioButton demo");
		mnSmallItems.add(m2);
		m2.addActionListener(this);
		
		m3 = new JMenuItem("ComboBox demo");
		mnSmallItems.add(m3);
		m3.addActionListener(this);
		
		m4 = new JMenuItem("Listbox demo");
		mnSmallItems.add(m4);
		m4.addActionListener(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblHomeFrame = new JLabel("Home Frame");
		lblHomeFrame.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblHomeFrame, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==m1)
		{
			JOptionPane.showMessageDialog(Home.this, "Checkbox will open soon");
			DemoCheckBox frame = new DemoCheckBox();
			frame.setVisible(true);
		}
		else if(e.getSource()==m2)
		{
			JOptionPane.showMessageDialog(Home.this, "Radiobutton will open soon");
			DemoRadioButton frame = new DemoRadioButton();
			frame.setVisible(true);
		}
		else if(e.getSource()==m3)
		{
			JOptionPane.showMessageDialog(Home.this, "ComboBox will open soon");
			DemoComboBox frame = new DemoComboBox();
			frame.setVisible(true);
		}
		else if(e.getSource()==m4)
		{
			JOptionPane.showMessageDialog(Home.this, "ListBox will open soon");
			DemoListBox frame = new DemoListBox();
			frame.setVisible(true);
		}
	}
}
