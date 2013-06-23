import java.util.*;
class palindromeNumber
{
static int j=0;
static int rev(int c)
{
	int i;
	i=c%10;
	c=c/10;
	j=j*10+i;
	if(c==0)
	return(j);
	else
	return(rev(c));		
}

public static void main(String args[])
{
int x,n;
System.out.println("Enter no:");
Scanner scan=new Scanner(System.in);
n=scan.nextInt();
x=rev(n);
if(x==n)
System.out.println("Palindrome");
else
System.out.println("Not palindrome");
}
}
/*
OUTPUT:
Enter no:
121
Palindrome
*/
