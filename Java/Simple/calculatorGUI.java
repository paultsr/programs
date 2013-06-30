/*
REG NO:JYAKECS035
EXP NO:30
EXP NAME:CALCULATOR GUI
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculatorGUI extends JFrame implements ActionListener
{
	JButton add,sub,mul,div,close,reset;
	JTextField t1,t2,t3;
	JLabel l1,l2,l3;
	
	calculatorGUI()
	{
		super("Calculator GUI");
		l1=new JLabel("Enter first number");
		l2=new JLabel("Enter second number");
		l3=new JLabel("Result");
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		t3.setEditable(false);
		add=new JButton("+");
		add.addActionListener(this);
		sub=new JButton("-");
		sub.addActionListener(this);
		mul=new JButton("x");
		mul.addActionListener(this);
		div=new JButton("/");
		div.addActionListener(this);
		close=new JButton("Close");
		close.setMnemonic('C');
		close.addActionListener(this);
		reset=new JButton("Reset");
		reset.setMnemonic('R');
		reset.addActionListener(this);
		JPanel p=new JPanel(new GridLayout(6,2));
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(add);
		p.add(sub);
		p.add(mul);
		p.add(div);
		p.add(l3);
		p.add(t3);
		p.add(reset);
		p.add(close);
		add(p);
		setVisible(true);
		pack();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		try
		{
		if(e.getSource()==add)
		{
			String n1=t1.getText();
			int m1=Integer.parseInt(n1);
			String n2=t2.getText();
			int m2=Integer.parseInt(n2);
			long m=m1+m2;
			t3.setText(Long.toString(m));
		}
		else if(e.getSource()==sub)
		{
			String n1=t1.getText();
			int m1=Integer.parseInt(n1);
			String n2=t2.getText();
			int m2=Integer.parseInt(n2);
			long m=m1-m2;
			t3.setText(Long.toString(m));
		}
		else if(e.getSource()==mul)
		{
			String n1=t1.getText();
			int m1=Integer.parseInt(n1);
			String n2=t2.getText();
			int m2=Integer.parseInt(n2);
			long m=m1*m2;
			t3.setText(Long.toString(m));
		}
		else if(e.getSource()==div)
		{
			String n1=t1.getText();
			int m1=Integer.parseInt(n1);
			String n2=t2.getText();
			int m2=Integer.parseInt(n2);
			long m=m1/m2;
			t3.setText(Long.toString(m));
		}
		else if(e.getSource()==close)
		{
			System.exit(0);
		}
		else if(e.getSource()==reset)
		{
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
			t1.requestFocus();	

		}
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "Please enter valid Input");
		}
	}
	
	public static void main(String args[])
	{
		new calculatorGUI();
	}
}
