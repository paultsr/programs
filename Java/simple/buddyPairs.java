import java.io.*;
public class buddyPairs
{
	static int i,j,n,k,x,y,l;
public static void main(String args[]) throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the limit");
n=Integer.parseInt(buf.readLine());
for(i=1;i<n;i++)
	{
		x=0;
		for(j=1;j<i;j++)
		{
			if(i%j==0)
			x=x+j;
		}
		for(k=1;k<n;k++)
		{
			y=0;
			for(l=1;l<k;l++)
			{
				if(k%l==0)
				y=y+l;
			}
		if((k==x)&&(i==y)&&(i!=k))
		System.out.println( "("+i+","+k+")");
		}
	}
}
}
/*
OUTPUT:
Enter the limit
500
(220,284)
(284,220)
*/
