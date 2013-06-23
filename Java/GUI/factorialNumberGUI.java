/*
REG NO:JYAKECS035
EXP NO:28
EXP NAME:FACTORIAL GUI
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class factorialNumberGUI extends JFrame implements ActionListener
{
	JButton b,r;
	JTextField t1,t2;
	JLabel l1,l2;
	
	factorialNumberGUI()
	{
		super("FACTORIAL GUI");
		l1=new JLabel("Enter The Number:");
		l2=new JLabel("Factorial:");
		t1=new JTextField(10);
		t2=new JTextField(10);
		t2.setEditable(false);
		JPanel p=new JPanel(new GridLayout(3,2));
		b=new JButton("Find");
		b.setMnemonic('F');
		b.addActionListener(this);
		r=new JButton("Reset");
		r.setMnemonic('R');
		r.addActionListener(this);
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(b);
		p.add(r);
		add(p);
		setVisible(true);
		pack();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		try
		{
		if(e.getSource()==b)
		{
			String num=t1.getText();
			int number=Integer.parseInt(num);
			long fac=number;
			for(int i=number;i>1;i--)
			{
				fac=fac*(i-1);
			}
			t2.setText(Long.toString(fac)); 
		}
		else if(e.getSource()==r)
		{
		t1.setText(null);
		t2.setText(null);
		t1.requestFocus();	
		}
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "Please enter valid Input");
		}
	}
	
	public static void main(String args[])
	{
		new factorialNumberGUI();
	}
}
