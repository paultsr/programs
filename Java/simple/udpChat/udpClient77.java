/*
   EXP. NO : 2
PROGRAM : Chat Implementation using UDP
FILENAME : udpClient77.java
BATCH NO : 1
ROLL NO : 77
AUTHOR : Paul S
DATE : 15-06-2013
 */
import java.net.*;
import java.io.*;
class udpClient77
{
	public static void main(String args[]) throws IOException
	{
		DatagramSocket ds=new DatagramSocket(1043);
		byte bf[]=new byte[1043];
		System.out.println("Welcome to UDP Chat !");
		while(true)
		{
			int i=0;
			int ps=0;
			System.out.println("");
			System.out.print("Client : ");
			while(i==0)
			{
				int c=System.in.read();
				if(c!='\n')
					bf[ps++]=(byte)c;
				else
					i=1;
			}
			ds.send(new DatagramPacket(bf,ps,InetAddress.getLocalHost(),1044));
			String str1=new String(bf,0,ps);
			if(str1.equals("quit"))
			{
				System.out.println("");
				System.out.println("Client Terminated.");
				break;
			}
			DatagramPacket p=new DatagramPacket(bf,bf.length);
			ds.receive(p);
			System.out.println("");
			System.out.print("Server : ");
			String str=new String(p.getData(),0,p.getLength());
			System.out.println(str);
			if(str.equals("quit"))
			{
				System.out.println("");
				System.out.println("Server Terminated.");
				break;
			}
		}
	}
}
/*
   Compilation Step
   ----------------
   javac udpClient77.java

   Execution Step
   --------------
   java udpClient77

   Output
   ------
   Welcome to UDP Chat !

Client : Hello

Server : Hi

Client : How are you?

Server : Fine

Client : quit

Client Terminated.
 */
