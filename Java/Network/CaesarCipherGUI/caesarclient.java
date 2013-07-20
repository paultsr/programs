/*
   EXP. NO : 5
PROGRAM : CEASAR CIPHER
FILENAME: ceasarclient.java
BATCH NO: 2
ROLL NO : 35
AUTHOR  : Nidhish P
DATE    : 19-07-2013
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.util.*;
public class caesarclient extends JFrame
{
	String cs="abcdefghijklmnopqrstuvwxyz";
	static JLabel l1,l2,l3,l4,l5;
	JButton b1,b2,b3;
	JTextField t1,t2;
	JProgressBar progress;
	int num=0;
	String en="";
	caesarclient(final Socket s)
	{
		super("CLIENT");
		JPanel p=new JPanel(new GridLayout(10,1));
		setSize(500,500);
		t1=new JTextField(30);
		b1=new JButton("Send");
		b1.setMnemonic('S');
		b2=new JButton("Close");
		b2.setMnemonic('C');
		l1=new JLabel("Welcome to Secure Data transfer!");
		l2=new JLabel("Enter the word here...");
		l3=new JLabel("");
		l4=new JLabel("Enter the Key:");
		b3=new JButton("Encrypt");
		b3.setMnemonic('E');
		t2=new JTextField(30);
		progress = new JProgressBar(0, 20);
		progress.setValue(0);
		progress.setStringPainted(true);
		p.add(l1);
		p.add(l2);
		p.add(t1);		
		p.add(l4);
		p.add(t2);
		p.add(b3);
		p.add(progress);
		p.add(b1);
		p.add(l3);
		p.add(b2);
		add(p);
		setVisible(true);
		b1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
				try{
				PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
				pw.println(en);
				}catch(Exception ex){};
				l3.setText("Encrypted Text Sent.");
				}
				});
		b3.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent e)
				{
				String strw=t1.getText();
				int key=Integer.parseInt(t2.getText());
				int i=0,j,k;
				while(i<strw.length())
				{
				j=cs.indexOf(strw.charAt(i));
				k=(j+key)%26;
				en=en+cs.charAt(k);
				i++;
				}
				while (num < 21)
				{
				progress.setValue(num);
				try {
				Thread.sleep(100);
				} catch (InterruptedException exe) { }
				progress.setValue( num );
				Rectangle progressRect = progress.getBounds();
				progressRect.x=0;
				progressRect.y=0;
				progress.paintImmediately( progressRect );
				num++;
				}
				}
				});
		b2.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent e)
				{
				System.exit(0);
				}
				});
		pack();
	}


	public static void main(String args[])throws IOException
	{
		final Socket s =new Socket(InetAddress.getLocalHost(),4321);
		new caesarclient(s);
	}
}

/*
Compilation & Execution steps...
===========================================
javac caesarclient.java
java caesarclient
*/

