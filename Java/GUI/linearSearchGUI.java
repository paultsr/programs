/*
REG NO:JYAKECS035
EXP NO:29
EXP NAME:SEARCH GUI
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class linearSearchGUI extends JFrame implements ActionListener
{
	JButton s,r,c;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JLabel l1,l2,l3;
	
	linearSearchGUI()
	{
		super("SEARCH GUI");
		l1=new JLabel("Enter elements");
		l3=new JLabel("Enter element to be searched");
		l2=new JLabel("Result:");
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		t4=new JTextField(10);
		t5=new JTextField(10);
		t6=new JTextField(10);
		t7=new JTextField(10);
		s=new JButton("Search");
		s.setMnemonic('S');
		s.addActionListener(this);
		r=new JButton("Reset");
		r.setMnemonic('R');
		r.addActionListener(this);
		c=new JButton("Close");
		c.setMnemonic('C');
		c.addActionListener(this);
		JPanel p=new JPanel(new FlowLayout());
		p.add(l1);
		p.add(t1);
		p.add(t2);
		p.add(t3);
		p.add(t4);
		p.add(t5);
		p.add(l3);
		p.add(t7);
		p.add(s);
		p.add(l2);
		p.add(t6);
		p.add(r);
		p.add(c);
		add(p);
		setVisible(true);
		pack();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==s)
		{
		String num=t7.getText();
		int n=Integer.parseInt(num);
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		int n3=Integer.parseInt(t3.getText());
		int n4=Integer.parseInt(t4.getText());
		int n5=Integer.parseInt(t5.getText());
		if(n1==n||n2==n||n3==n||n4==n||n5==n)
		{
			t6.setText("found");
		}
		else
		{
			t6.setText("Not found");
		}
		}
		else if(e.getSource()==c)
		{
			System.exit(0);
		}
		else if(e.getSource()==r)
		{
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
			t4.setText(null);
			t5.setText(null);
			t6.setText(null);
			t7.setText(null);
			t1.requestFocus();	
		}
	}
	
	public static void main(String args[])
	{
		new linearSearchGUI();
	}
}
