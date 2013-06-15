/*
   EXP. NO : 2
PROGRAM : Chat Implementation using UDP
FILENAME : udpServer77.java
BATCH NO : 1
ROLL NO : 77
AUTHOR : Paul S
DATE : 15-06-2013
 */
import java.io.*;
import java.net.*;
class udpServer77
{
	public static void main(String args[])throws IOException
	{
		DatagramSocket ds=new DatagramSocket(1044);
		System.out.println("UDP Chat Server Started....");
		byte bf[]=new byte[1024];                
		while(true)
		{
			DatagramPacket p=new DatagramPacket(bf,bf.length);  
			ds.receive(p);
			System.out.println("");
			System.out.print("Client : ");
			String str1=new String(p.getData(),0,p.getLength());
			System.out.println(str1);
			if(str1.equals("quit"))
			{
				System.out.println("");
				System.out.println("Client Terminated.");
				break;
			}
			int i=0;
			int ps=0;
			System.out.println("");
			System.out.print("Server : ");
			while(i==0)
			{
				int c=System.in.read();
				if(c!='\n')
					bf[ps++]=(byte)c;
				else
					i=1;
			}
			ds.send(new DatagramPacket(bf,ps,InetAddress.getLocalHost(),1043));
			String str=new String(bf,0,ps);
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
   javac udpServer77.java

   Execution Step
   --------------
   java udpServer77

   Output
   ------
   UDP Chat Server Started....

Client : Hello

Server : Hi

Client : How are you?

Server : Fine

Client : quit

Client Terminated.
 */

