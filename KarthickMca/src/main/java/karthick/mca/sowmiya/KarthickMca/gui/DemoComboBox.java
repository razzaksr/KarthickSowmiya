package karthick.mca.sowmiya.KarthickMca.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DemoComboBox extends JFrame implements ItemListener
{
	private JComboBox comboBox;
	private JLabel lblImges;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoComboBox frame = new DemoComboBox();
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
	public DemoComboBox() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 709, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select any phrase", "internship", "workshop", "skillset", "demo"}));
		contentPane.add(comboBox, BorderLayout.NORTH);
		comboBox.addItemListener(this);
		lblImges = new JLabel("imges");
		//lblImges.setIcon(new ImageIcon(DemoComboBox.class.getResource("/karthick/mca/sowmiya/KarthickMca/gui/three.png")));
		contentPane.add(lblImges, BorderLayout.CENTER);
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		if(comboBox.getSelectedIndex()==0)
		{
			lblImges.setIcon(null);
		}
		else if(comboBox.getSelectedItem().equals("internship"))
		{
			lblImges.setIcon(new ImageIcon(DemoComboBox.class.getResource("/karthick/mca/sowmiya/KarthickMca/gui/four.png")));
		}
		else if(comboBox.getSelectedIndex()==2)
		{
			lblImges.setIcon(new ImageIcon(DemoComboBox.class.getResource("/karthick/mca/sowmiya/KarthickMca/gui/three.png")));
		}
		else if(comboBox.getSelectedIndex()==3)
		{
			lblImges.setIcon(new ImageIcon(DemoComboBox.class.getResource("/karthick/mca/sowmiya/KarthickMca/gui/one.png")));
		}
		else if(comboBox.getSelectedIndex()==4)
		{
			lblImges.setIcon(new ImageIcon(DemoComboBox.class.getResource("/karthick/mca/sowmiya/KarthickMca/gui/two.png")));
		}
	}

}
