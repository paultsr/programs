import java.io.*;
public class strongNumber
{
	public static void main(String args[]) throws IOException
	{
	int i,j=0,n,s,f,x;
	System.out.println("Enter the no:");
	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	n=Integer.parseInt(buf.readLine());
	s=n;
	while(s>0)
	{
	f=s%10;
	s=s/10;
	x=1;
	for(i=1;i<=f;i++)
	{
	x=x*i;
	}
	j=j+x;
	}
	if(j==n)
	System.out.println("Strong no");
	else
	System.out.println("Not strong");
	}
}
/*
OUTPUT:
Enter the no:145
Strong no
*/
