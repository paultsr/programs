/*
REG NO:JYAKECS035
EXP NO:10
*/
import java.util.*;
class area
{
	double areas(int r)
	{
		return(3.14*r*r);
	}
	
	double areas(int a,int b)
	{
		return(a*b);
	}
	
	double areas(int a,int b,int c)
	{
		int s=(a+b+c)/2;
		return(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}
}

class read extends area
{
	Scanner scan=new Scanner(System.in);
	void readc()
	{
		System.out.println("Enter the radius:");
		int r=scan.nextInt();
		System.out.println("Area of circle="+areas(r));
	}
	void readr()
	{
		System.out.println("Enter the sides:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Area of rectangle="+areas(a,b));
	}
	void readt()
	{
		System.out.println("Enter the sides:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		System.out.println("Area of triangle="+areas(a,b,c));
	}
}

class overloadFunctions
{
	public static void main(String args[])
	{
		read m=new read();
		int c;
		Scanner scan=new Scanner(System.in);
		System.out.println("1:CIRCLE  2:RECTANGLE  3:TRIANGLE  4:EXIT");
		do
		{
		System.out.println("Enter choice:");
		c=scan.nextInt();
		switch(c)
		{
			case 1:m.readc();break;
			case 2:m.readr();break;
			case 3:m.readt();break;
			case 4:System.out.println("HAVE A NICE TIME.....");
		}
		}while(c!=4);
	}
}
/*
1:CIRCLE  2:RECTANGLE  3:TRIANGLE  4:EXIT
Enter choice:
3
Enter the sides:
6 5 4
Area of triangle=6.48074069840786
Enter choice:
2
Enter the sides:
5 4
Area of rectangle=20.0
Enter choice:
1
Enter the radius:
5
Area of circle=78.5
Enter choice:
4
HAVE A NICE TIME.....
*/
