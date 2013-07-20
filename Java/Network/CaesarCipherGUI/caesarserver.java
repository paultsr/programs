/*
   EXP. NO : 5
PROGRAM : CEASAR CIPHER
FILENAME: ceasarserver.java
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

public class caesarserver extends JFrame implements ActionListener
{
	static String cs="abcdefghijklmnopqrstuvwxyz";
	static JLabel l1,l2,l3,l5,l6;
	JTextField t1;
	JButton close,b1;
	static String en;
	int num=0;
	JProgressBar progress;
	caesarserver()
	{
		super("SERVER");
		JPanel p=new JPanel(new GridLayout(10,1));
		l1=new JLabel("");
		l2=new JLabel("");
		l3=new JLabel("");
		l5=new JLabel("");
		l6=new JLabel("Enter the Key...");
		t1=new JTextField(30);
		progress = new JProgressBar(0, 20);
		progress.setValue(0);
		progress.setStringPainted(true);
		close=new JButton("Close");
		close.setMnemonic('C');
		close.setPreferredSize(new Dimension(300, 25));
		close.addActionListener(this);
		b1=new JButton("Decrypt");
		b1.setMnemonic('D');
		b1.addActionListener(this);
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(l6);
		p.add(t1);
		p.add(b1);
		p.add(progress);
		p.add(l5);
		p.add(close);
		add(p);
		setVisible(true);
		pack();
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==close)
			System.exit(0);
		else if(e.getSource()==b1)
		{
			int key=Integer.parseInt(t1.getText());
			String d="";
			int i=0,j,k;
			while(i<en.length())
			{
				j=cs.indexOf(en.charAt(i));
				k=(j+(26-key))%26;
				d=d+cs.charAt(k);
				i++;
			}
			while (num < 21) 
			{
				progress.setValue(num);
				try {
					Thread.sleep(100);
				} catch (InterruptedException ex) { }
				progress.setValue( num );
				Rectangle progressRect = progress.getBounds();
				progressRect.x=0;
				progressRect.y=0;
				progress.paintImmediately( progressRect );
				num++;
			}
			l5.setText("Decrypted text: "+d);
		}
	}

	public static void main(String args[])throws IOException
	{
		new caesarserver();
		String strm =new String();
		ServerSocket ss=new ServerSocket(4321);
		l1.setText("Secure data transfer Server Started....");
		Socket s=ss.accept();
		l2.setText("Client Connected !");
		while(true)
		{
			Scanner br1= new Scanner(s.getInputStream());
			en=br1.nextLine();
			l3.setText("Client: "+en);
		}
	}
}

/*
Compilation & Execution steps...
===========================================
javac caesarserver.java
java caesarserver
*/
