/*
   EXP. NO : 1
PROGRAM : Chat Implementation using TCP
FILENAME : tcpClient77.java
BATCH NO : 1
ROLL NO : 77
AUTHOR : Paul S
DATE : 15-06-2013
 */
import java.io.*;
import java.net.*;
class tcpClient77 
{
	public static void main(String args[])throws IOException
	{
		System.out.println("Welcome to TCP Chat !");
		System.out.println("");
		Socket s = new Socket(InetAddress.getLocalHost(),4056);
		System.out.println("Connected to TCP Chat Server.");
		while(true)
		{
			System.out.println("");
			System.out.print("Client : ");
			BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
			String str1=br2.readLine();
			PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
			pw.println(str1);
			if(str1.equals("quit"))
			{
				System.out.println("");
				System.out.println("Client Terminated.");
				break;
			}
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str =br.readLine();
			System.out.println("");
			System.out.print("Server : ");
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
   javac tcpClient77.java

   Execution Step
   --------------
   java tcpClient77

   Output
   ------
   Welcome to TCP Chat !

   Connected to TCP Chat Server.

Client : Hello

Server : Hi

Client : How are you?

Server : Fine

Client : quit

Client Terminated.
 */
