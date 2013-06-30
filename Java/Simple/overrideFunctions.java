/*
REG NO:JYAKECS035
EXP NO:11
*/
import java.util.*;
class base
{
	int x;
	base(int a)
	{
	x=a;
	}
	void display()
	{
		System.out.println("demo"+x);
	}
}
class child extends base
{
	int y;
	child(int a,int b)
	{
		super(a);
		y=b;
	}
	void display()
	{
		System.out.println("VARIABLE 1=" +x);
		System.out.println("VARIABLE 2=" +y);
	}
}

class overrideFunctions
{
	public static void main(String args[])
	{
		child s=new child(12,13);
		s.display();
	}
}
/*
OUTPUT:
*************
VARIABLE 1=12
VARIABLE 2=13
*/
