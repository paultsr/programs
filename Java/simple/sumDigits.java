import java.util.*;
class sumDigits
{
static int j=0;
static void sum(int n)
{
	int x;
	x=n%10;
	j=j+x;
	n=n/10;
	if(n>0)
	{sum(n);}
}

public static void main(String args[])
{
	System.out.println("Enter number:");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	sum(n);
	System.out.println("Sum="+j);
}
}
/*
OUTPUT:
Enter number:
123
Sum=6
*/
