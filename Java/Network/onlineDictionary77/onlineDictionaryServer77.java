/*
   EXP. NO : 4
PROGRAM : Online Dictionary Implementation
FILENAME : onlineDictionaryServer77.java
BATCH NO : 1
ROLL NO : 77
AUTHOR : Paul S
DATE : 21-06-2013
 */
import java.io.*;
import java.net.*;
public class onlineDictionaryServer77
{
	public static void main(String arg[])throws IOException
	{       
		String strm =new String();
		String temp1=new String();
		ServerSocket ss=new ServerSocket(4321);
		System.out.println("Online Dictionary Server Started....");
		Socket s=ss.accept();
		System.out.println("Client Connected !");
		System.out.println("");
		while(true)
		{
			BufferedReader br1= new BufferedReader(new InputStreamReader(s.getInputStream()));
			String strw=br1.readLine();
			System.out.println("Client: "+strw);
			if(strw.equals("quit"))
			{
				System.out.println("");
				System.out.println("Client Terminated.");
				break;
			}
			File f=new File("jecdict");
			if(f.isFile())
			{
				BufferedReader br=new BufferedReader(new FileReader("jecdict"));
				do
				{
					String tem=br.readLine();
					strw=strw.trim();
					int t=tem.indexOf(':');
					temp1=tem.substring(0,t);
					strm=tem.substring(t+1,tem.length());
				}
				while(!(strw.equals(temp1)));
			}
			System.out.println(strw+" = "+strm);
			PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
			pw.println(strm);
			System.out.println("");
			System.out.println("Meaning Sent. ");
			System.out.println("");
		}
	}
}
/*
   Compilation Step
   ----------------
   javac onlineDictionaryServer77.java

   Execution Step
   --------------
   java onlineDictionaryServer77

   Output
   ------
   Online Dictionary Server Started....
   Client Connected !

   Client: hiatus
   hiatus = gap

   Meaning Sent. 

   Client: betenoire
   betenoire = enemy

   Meaning Sent. 

   Client: quit

   Client Terminated.
 */

