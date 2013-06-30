import java.util.*;
class bubbleSort
{
	static int i,j,n,t;
	static int a[];
	static void getdata()
	{
		System.out.println("Enter limit:");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		a=new int[n];
		System.out.println("Enter elements:");
		for(i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
	}
	
	static void sort()
	{
		for(i=0;i<n;i++)
			{
				for(j=1;j<n-i;j++)
				{
					if(a[j-1]>a[j])
					{
						t=a[j-1];
						a[j-1]=a[j];
						a[j]=t;
					}
				}
			}
	}
	
	static void putdata()
	{
		System.out.println("Sorted list");
		for(i=0;i<n;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
}


class bub
{
	public static void main(String args[])
	{
		test m=new test();
		m.getdata();
		m.sort();
		m.putdata();		
	}
}
/*
OUTPUT:
Enter limit:
5
Enter elements:
5 4 3 2 1
Sorted list
1 2 3 4 5
*/

