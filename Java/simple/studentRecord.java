/*
	REG NO:JYAKECS035
	EXP NO:8
	EXP NAME:Students Record
*/
	import java.util.*;
	class stud
	{
		String name;
		String dept;
		int rno;
		int mark1,mark2,mark3,marks,average;
		
		
		void getdata()
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter Name:");
			name=scan.nextLine();
			System.out.print("Enter Department:");
			dept=scan.nextLine();
			System.out.print("Enter Roll no:");
			rno=scan.nextInt();
			System.out.print("Enter Mark of 3 subjects:");
			mark1=scan.nextInt();
			mark2=scan.nextInt();
			mark3=scan.nextInt();
		}
		
		void putdata()
		{
			marks=mark1+mark2+mark3;
			average=marks/3;
			System.out.print(" NAME:" +name+ "\n DEPARTMENT:" +dept+ "\n Roll no:" +rno+ "\n Total Marks:" +marks+ "\nAverage:" +average);
		}
	}
	
	class studentRecord
	{
		public static void main(String args[])
		{
		int i;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of students:");
		int n=scan.nextInt();
		stud a[]=new stud[n];
		
		for(i=0;i<n;i++)
		{
			a[i]=new stud();
			a[i].getdata();
			System.out.println("\n");
		}
		
		System.out.print("Enter the roll no of student to be displayed:");
		int m=scan.nextInt();
		
			for(i=0;i<n;i++)
			{
				if(a[i].rno==m)
				{
					a[i].putdata();
				}
			}
		}
	}

/*
OUTPUT:
*************************
Enter the no of students:
3
Enter Name:Nidhish P
Enter Department:cse
Enter Roll no:35
Enter Mark of 3 subjects:45 43 41


Enter Name:Mridul S Kumar
Enter Department:cse
Enter Roll no:34
Enter Mark of 3 subjects:41 42 43


Enter Name:Liya Thomas
Enter Department:cse
Enter Roll no:33
Enter Mark of 3 subjects:48 49 50


Enter the roll no of student to be displayed:33
 NAME:Liya Thomas
 DEPARTMENT:cse
 Roll no:33
 Total Marks:147
 Average:49
*/
