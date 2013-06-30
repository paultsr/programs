/*
   EXP. NO : 1
PROGRAM : Chat Implementation using TCP
FILENAME : tcpServer77.java
BATCH NO : 1
ROLL NO : 77
AUTHOR : Paul S
DATE : 15-06-2013
 */
import java.io.*;
import java.net.*;
class tcpServer77 
{
	public static void main(String args[])throws IOException
	{
		ServerSocket ss = new ServerSocket(4056);
		System.out.println("TCP Chat Server Started....");
		System.out.println("");
		Socket s = ss.accept();
		System.out.println("Client Connected.");
		while(true)
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str1 =br.readLine();
			System.out.println("");
			System.out.print("Client : ");
			System.out.println(str1);
			if(str1.equals("quit"))
			{
				System.out.println("");
				System.out.println("Client Terminated.");
				break;
			}
			System.out.println("");
			System.out.print("Server : ");
			BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
			String str=br1.readLine();
			PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
			pw.println(str);
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
   javac tcpServer77.java

   Execution Step
   --------------
   java tcpServer77

   Output
   ------
   TCP Chat Server Started....

   Client Connected.

Client : Hello

Server : Hi

Client : How are you?

Server : Fine

Client : quit

Client Terminated.
 */


