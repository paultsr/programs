/*
   EXP. NO : 3
PROGRAM : Date Sever Implementation using TCP
FILENAME : dateServerGUI77.java
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
public class dateServerGUI77 extends JFrame implements ActionListener
{
	static JLabel l1,l2,l3,l4;
	JButton stop;	
	dateServerGUI77()
	{
		super("Date Server GUI");
		l1=new JLabel("Date Server Started..");
		l2=new JLabel("");
		l3=new JLabel("");
		l4=new JLabel("");	
		stop=new JButton("Stop");
		stop.setMnemonic('S');
		stop.addActionListener(this);
		JPanel p=new JPanel(new GridLayout(5,1,7,7));
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(l4);
		p.add(stop);
		add(p);
		setVisible(true);
		pack();
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			if(e.getSource()==stop)
			{
				System.exit(0);
			}
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "Press stop to exit");
		}
	}

	public static void main(String[] args) throws IOException 
	{

		new dateServerGUI77();
		ServerSocket listener = new ServerSocket(9090);
		while (true) 
		{
			Socket socket = listener.accept();
			l2.setText("Client Connected");
			Date  d=new Date();
			l3.setText(d.toString());
			PrintWriter out =
				new PrintWriter(socket.getOutputStream(), true);
			out.println(d.toString());
			l4.setText("Date Sent");


		}

	}
}
/*
   Compilation Step
   ----------------
   javac dateServerGUI77.java

   Execution Step
   --------------
   java dateServerGUI77

   Output
   ------
![Pic 1](http://paultsr.in/images/dateServerGUI77/dateServerGUI77.png)
*/

