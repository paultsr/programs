/*
 * EXP NO:4
 * PROGRAM:Online Dictionary
 * FILE NAME:DictServer35.java
 * BATCH NO:2
 * ROLL NO:35
 * PROGRAMMER:Nidhish P
 * DATE:15-07-2013
*/
import java.io.*;
import java.util.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DictServer35 extends JFrame implements ActionListener
{
	static JLabel l1,l2,l3,l4,l5;
	JButton b1;
	static int flag=0;
	DictServer35()
	{
		super("Online Dictionary 35");
		JPanel p=new JPanel(new GridLayout(7,1));
		JPanel p1=new JPanel(new FlowLayout());
		l1=new JLabel("");
		l2=new JLabel("");
		l3=new JLabel("");
		l4=new JLabel("");
		l5=new JLabel("");
		b1=new JButton("Close");
		b1.setMnemonic('C');
		b1.setPreferredSize(new Dimension(100,25));
		b1.addActionListener(this);
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(l4);
		p.add(l5);
		p1.add(b1);
		setLayout(new BorderLayout());
		add(p,BorderLayout.CENTER);
		add(p1,BorderLayout.SOUTH);
		setSize(300,220);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
			System.exit(0);
	}
	public static void main(String args[])throws IOException
	{
		new DictServer35();
		String strm=new String();
		String temp1=new String();
		ServerSocket ss=new ServerSocket(4321);
		l1.setText("Online Dictionary Server Started...");
		l1.setForeground(Color.red);
		l1.setFont(new Font("Arial Black",Font.ITALIC,14));
		Socket s=ss.accept();
		l2.setText("Client connected...");
		while(true)
		{
			Scanner br1=new Scanner(s.getInputStream());
			String strw=br1.nextLine();
			l3.setText("Client:"+strw);
			File f=new File("jecdict");
			if(f.isFile())
			{
				Scanner br=new Scanner(new FileReader("jecdict"));
				do
				{
					String tem=br.nextLine();
					if(tem.equals(""))
					{
						strm="NOT_FOUND";
						flag=1;
						break;
					}
					strw=strw.trim();
					int t=tem.indexOf(':');
					temp1=tem.substring(0,t);
					strm=tem.substring(t+1,tem.length());
				}
				while(!(strw.equals(temp1)));
			}
			if(flag==0)
			{
				l4.setText(strw+"="+strm);
				l5.setText("Meaning sent...");
			}
			else
			{
				l4.setText(strm);
			}
			PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
			pw.println(strm);
		}
	}
}

/*
 * Compilation Step:
 * =================================
 * javac DictServer35.java
 *
 * Execution Step:
 * =================================
 * java DictServer35
 *
 */

