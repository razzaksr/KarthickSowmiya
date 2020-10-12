package karthick.mca.sowmiya.KarthickMca.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DemoRadioButton extends JFrame implements ItemListener
{

	private JPanel contentPane;
	private JRadioButton rb1, rb2, rb3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoRadioButton frame = new DemoRadioButton();
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
	public DemoRadioButton() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(124, 152, 89, 23);
		contentPane.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(289, 152, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(62, 95, 30, 22);
		contentPane.add(comboBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(104, 118, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_2.setBounds(219, 126, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		ButtonGroup bg=new ButtonGroup();
		
		rb1 = new JRadioButton("Motif(OLD)");
		rb1.setBounds(29, 37, 109, 23);
		contentPane.add(rb1);rb1.addItemListener(this);
		bg.add(rb1);
		
		rb2 = new JRadioButton("Metal(Swing)");
		rb2.setBounds(170, 37, 109, 23);
		contentPane.add(rb2);rb2.addItemListener(this);
		bg.add(rb2);
		
		rb3 = new JRadioButton("Windows(OS based)");
		rb3.setBounds(302, 37, 109, 23);
		contentPane.add(rb3);rb3.addItemListener(this);
		bg.add(rb3);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		try {
			if(e.getSource()==rb1)
			{
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			} 
			else if(e.getSource()==rb2)
			{
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			}
			else if(e.getSource()==rb3)
			{
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			}
			SwingUtilities.updateComponentTreeUI(contentPane);
		}
		catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		}
	}
}
