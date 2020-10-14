package karthick.mca.sowmiya.KarthickMca.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;

public class DemoListBox extends JFrame implements ListSelectionListener 
{
	private JLabel label;

	private JPanel contentPane;
	private JList list;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoListBox frame = new DemoListBox();
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
	public DemoListBox() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		label= new JLabel("Months to complete selected courses: ");
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		label.setBounds(48,210,376,40);
		contentPane.add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(129, 26, 148, 79);
		contentPane.add(scrollPane);
		
		list = new JList();
		list.setVisibleRowCount(4);
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Select Course", "Full stack", "Java", "Python", "C++", "MS.Net", "C", "PHP"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.addListSelectionListener(this);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) 
	{
		int months=0;label.setText("");
		Object[] choosen=list.getSelectedValues();
		for(Object temp:choosen)
		{
			if(temp.equals("Full stack")) {months+=3;}
			else if(temp.equals("Java")) {months+=2;}
			else if(temp.equals("Python")) {months+=2;}
			else if(temp.equals("C++")) {months+=1;}
			else if(temp.equals("MS.Net")) {months+=4;}
			else if(temp.equals("C")) {months+=1;}
			else if(temp.equals("PHP")) {months+=2;}
		}
		label.setText("Months to complete selected courses: "+months);
	}
}
