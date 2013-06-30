/*
   EXP. NO : 3
PROGRAM : Date Sever Implementation using TCP
FILENAME : dateClientGUI77.java
BATCH NO : 1
ROLL NO : 77
AUTHOR : Paul S
DATE : 30-06-2013
 */
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class dateClientGUI77 extends JFrame implements ActionListener
{
	static JLabel l1,l2,l3,l4;
	JTextField t1;
	JButton find,close;	
	dateClientGUI77()
	{
		super("Date Client GUI");
		l1=new JLabel("Wlecome to Date Server !");
		l2=new JLabel("Server IP");
		t1=new JTextField(15);
		find=new JButton("Find");
		find.setMnemonic('F');
		find.addActionListener(this);
		l3=new JLabel("");
		l4=new JLabel("");
		close=new JButton("Close");
		close.setMnemonic('C');
		close.addActionListener(this);
		JPanel p=new JPanel(new GridLayout(7,1));
		p.add(l1);
		p.add(l2);
		p.add(t1);
		p.add(find);
		p.add(l3);
		p.add(l4);
		p.add(close);
		add(p);
		setVisible(true);
		pack();
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			if(e.getSource()==find)
			{
				String serverAddress =t1.getText();
				Socket s = new Socket(serverAddress, 9090);
				BufferedReader input =
					new BufferedReader(new InputStreamReader(s.getInputStream()));
				String answer = input.readLine();
				l3.setText(answer);
				l4.setText("Date Received");
			}
			else if(e.getSource()==close)
			{
				System.exit(0);
			}
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "Please enter valid Input");
		}
	}
	public static void main(String[] args) throws IOException 
	{
		new dateClientGUI77();
	}
}
/*
   Compilation Step
   ----------------
   javac dateClientGUI77.java

   Execution Step
   --------------
   java dateClientGUI77

   Output
   ------
*/
![Pic 1](http://paultsr.in/images/dateServerGUI77/dateClientGUI77.png)
