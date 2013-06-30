import java.io.*;
public class perfectNumber
{
	public static void main(String args[]) throws IOException
	{
		int s=0,j,n,i;
	System.out.println("Enter the no:");
	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	n=Integer.parseInt(buf.readLine());
	for(i=1;i<n;i++)
	{
	if((n%i)==0)
	s=s+i;
	}
	if(s==n)
	System.out.println("No is perfect");
	else
	System.out.println("Not palindrome");
	}
} 
/*
OUTPUT:
Enter the no:6
No is perfect
*/
