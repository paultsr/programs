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
public class onlineDictionaryClient77
{
	public static void main(String arg[]) throws IOException
	{
		Socket s =new Socket(InetAddress.getLocalHost(),4321);
		System.out.println("Welcome to Online Dictionary !");
		System.out.println("");
		while(true)
		{

			System.out.print("Enter The Word : ");
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			String strw=br.readLine();
			PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
			pw.println(strw);
			if(strw.equals("quit"))
			{
				System.out.println("");
				System.out.println("Client Terminated.");
				break;
			}
			BufferedReader br1= new BufferedReader(new InputStreamReader(s.getInputStream()));
			String strm=br1.readLine();
			System.out.println(strw+" = "+strm);
			System.out.println("");
			System.out.println("Meaning Received. ");
			System.out.println("");

		}


	}
}
/*
   Compilation Step
   ----------------
   javac onlineDictionaryClient77.java

   Execution Step
   --------------
   java onlineDictionaryClient77

   Output
   ------
   Welcome to Online Dictionary !

   Enter The Word : hiatus
   hiatus = gap

   Meaning Received. 

   Enter The Word : betenoire
   betenoire = enemy

   Meaning Received. 

   Enter The Word : quit

   Client Terminated.
 */
