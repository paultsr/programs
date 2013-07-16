/*
 * EXP NO:4
 * PROGRAM:Online Dictionary
 * FILE NAME:DictClient35.java
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
public class DictClient35 extends JFrame
{
	static JLabel l1,l2,l3,l4;
	JButton b1,b2;
	JTextField t1;
	DictClient35(final Socket s)
	{
		super("Online Dictionary Client 35");
		JPanel p=new JPanel(new GridLayout(3,1));
		JPanel p1=new JPanel(new FlowLayout());
		JPanel p2=new JPanel(new FlowLayout());
		t1=new JTextField(10);
		b1=new JButton("Find");
		b1.setPreferredSize(new Dimension(100,25));
		b2=new JButton("Close");
		b2.setPreferredSize(new Dimension(100,25));
		b1.setMnemonic('F');
		b2.setMnemonic('C');
		l1=new JLabel("Welcome to Online Dictionary...");
		l1.setForeground(Color.red);
		l1.setFont(new Font("Arial Black",Font.ITALIC,14));
		l2=new JLabel("WORD:");
		l3=new JLabel("");
		l3.setForeground(Color.blue);
		l3.setFont(new Font("Arial Black",Font.ITALIC,16));
		l4=new JLabel("MEANING:");
		p.add(l1);
		p.add(l2);
		p.add(t1);
		p1.add(b1);
		p1.add(b2);
		p2.add(l4);
		p2.add(l3);
		setLayout(new BorderLayout());
		add(p,BorderLayout.NORTH);
		add(p1,BorderLayout.WEST);
		add(p2,BorderLayout.SOUTH);
		setSize(300,180);
		setVisible(true);
		b1.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent e)
				{
				try{
				String strw=t1.getText();
				PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
				pw.println(strw);
				Scanner br1=new Scanner(s.getInputStream());
				String strm=br1.nextLine();
				l3.setText(strm);
				}catch(Exception ex){}
				}
				});
		b2.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent e)
				{
				System.exit(0);
				}
				});
	}

	public static void main(String args[])throws IOException
	{
		final Socket s=new Socket(InetAddress.getLocalHost(),4321);
		new DictClient35(s);
	}
}

/*
 * Compilation Step:
 * =================================
 * javac DictClient35.java
 *
 * Execution Step:
 * =================================
 * java DictClient35
 *
*/

