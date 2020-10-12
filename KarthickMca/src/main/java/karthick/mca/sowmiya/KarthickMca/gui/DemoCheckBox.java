package karthick.mca.sowmiya.KarthickMca.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class DemoCheckBox extends JFrame implements ItemListener
{

	private JPanel contentPane;
	private JCheckBox cb1,cb2,cb3,cb4,cb5;
	private JLabel lblTotalFineAmount;
	private static int total=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoCheckBox frame = new DemoCheckBox();
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
	public DemoCheckBox() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		cb1 = new JCheckBox("Helmet");
		cb1.setBounds(68, 32, 97, 23);
		contentPane.add(cb1);
		cb1.addItemListener(this);
		
		cb2 = new JCheckBox("License");
		cb2.setBounds(68, 72, 97, 23);
		contentPane.add(cb2);
		cb2.addItemListener(this);
		
		cb3 = new JCheckBox("Triples");
		cb3.setBounds(68, 112, 97, 23);
		contentPane.add(cb3);
		cb3.addItemListener(this);
		
		cb4 = new JCheckBox("Insurance");
		cb4.setBounds(68, 149, 97, 23);
		contentPane.add(cb4);
		cb4.addItemListener(this);
		
		cb5 = new JCheckBox("Violance of Signal");
		cb5.setBounds(68, 186, 149, 23);
		contentPane.add(cb5);
		cb5.addItemListener(this);
		
		lblTotalFineAmount = new JLabel("Total Fine amount: ");
		lblTotalFineAmount.setBounds(217, 116, 194, 19);
		contentPane.add(lblTotalFineAmount);
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		total=0;
		if(cb1.getModel().isSelected()){total+=100;}
		if(cb2.getModel().isSelected()){total+=500;}
		if(cb3.getModel().isSelected()){total+=500;}
		if(cb4.getModel().isSelected()){total+=1000;}
		if(cb5.getModel().isSelected()){total+=800;}
		lblTotalFineAmount.setText("Total Fine amount: "+total);
	}
}
