/*
REG NO:JYAKECS035
EXP NO:9
EXP NAME:Inheritance
*/
import java.util.*;
class college
{
	String name,principal,location;
	void getdata()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("College name:");
		name=scan.nextLine();
		System.out.print("Principal name:");
		principal=scan.nextLine();
		System.out.print("Location:");
		location=scan.nextLine();
	}
	void putdata()
	{
	System.out.println("COLLEGE NAME:" +name+ "\nPRINCIPAL:" +principal+ "\nLOCATION:" +location);
	}
}

class department extends college
{
	String dname,hod;
	int staff_no;
	void getdata1()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Department:");
		dname=scan.nextLine();
		System.out.print("HOD:");
		hod=scan.nextLine();
		System.out.print("No:of staff:");
		staff_no=scan.nextInt();
		super.getdata();
	}
	void putdata1()
	{
		System.out.println("DEPARTMENT:" +dname+ "\nHOD:" +hod+ "\nNO:OF STAFF:" +staff_no);
		super.putdata();
	}
}

interface library
{
	void readl();
	void displ();
}

interface hostel
{
	void readh();
	void disph();
}

class batch extends department
{
	String tutor;
	int sem,year,no_of_stud;
	void getdata2()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter semester:");
		sem=scan.nextInt();
		System.out.print("Enter year:");
		year=scan.nextInt();
		System.out.print("Enter no:of students in department:");
		no_of_stud=scan.nextInt();
		System.out.print("Enter tutor name:");
		tutor=scan.next();
		super.getdata1();
	}
	void putdata2()
	{
		System.out.println("SEMESTER:" +sem+ "\nYEAR:" +year+ "\nNO:OF STUDENTS:" +no_of_stud+ "\nTUTOR:" +tutor);
		super.putdata1();
	}
}

class stud1 extends batch implements hostel,library
{
	int adm_no,rno,b_no,s;
	String name,email,address,mob,h_name,w_name,lib_name;
	void getdata3()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Student Name:");
		name=scan.nextLine();
		System.out.print("Enter adm no:");
		adm_no=scan.nextInt();
		System.out.print("Enter roll no:");
		rno=scan.nextInt();
		System.out.println("Enter address:");
		address=scan.next();
		System.out.print("Enter E-mail id:");
		email=scan.next();
		System.out.print("Enter Mobile no:");
		mob=scan.next();
		super.getdata2();
		readl();
		System.out.println("Is hostler(0/1):");
		s=scan.nextInt();
		if(s==1)
		{
			readh();
		}
	}
	void putdata3()
	{
		System.out.println("NAME:"+name+ "\nADMISSION NO:" +adm_no+ "\nRoll no:" +rno+ "\nADDRESS:"+address+ "\nEMAIL ID:" +email+ "\nMobile No:" +mob);
		super.putdata2();
		displ();
		if(s==1)
		{
			disph();
		}
	}
	
	public void readl()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter librarian name:");
		lib_name=scan.nextLine();
		System.out.println("Enter no of books:");
		b_no=scan.nextInt();
	}
	public void displ()
	{
		System.out.println("LIBRARIAN:"+lib_name+ "\nNo:of books:"+b_no);
	}
	public void readh()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter hostel name:");
		h_name=scan.nextLine();
		System.out.println("Enter Warden name:");
		w_name=scan.nextLine();
	}
	public void disph()
	{
		System.out.println("Hostelname:"+h_name+ "\nWarden name:"+w_name);
	}
}

class JECinheritance
{
	public static void main(String args[])
	{
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of students:");
		int n=s.nextInt();
		stud1 a[]=new stud1[n];
		
		for(i=0;i<n;i++)
		{
			a[i]=new stud1();
			a[i].getdata3();
		}
		System.out.println("Enter Admission no:");
		int m=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i].adm_no==m)
			{
				a[i].putdata3();
			}
		}
	}
}
/*
OUTPUT:
********************
Enter no of students:
2
Enter Student Name:Nidhish
Enter adm no:123
Enter roll no:35
Enter address:
panthalil
Enter E-mail id:nidhishjecc@gmail
Enter Mobile no:7403186507
Enter semester:5
Enter year:2010
Enter no:of students in department:63
Enter tutor name:soumya
Department:cse
HOD:aswathi
No:of staff:50
College name:jyothi
Principal name:gylson
Location:vkt
Enter librarian name:
george
Enter no of books:
34
Is hostler(0/1):
0

Enter Student Name:Mridul
Enter adm no:321
Enter roll no:34
Enter address:
Samridh    
Enter E-mail id:mridulsk@yahoo
Enter Mobile no:9946440109
Enter semester:5
Enter year:2010
Enter no:of students in department:63
Enter tutor name:soumya
Department:cse
HOD:aswathi
No:of staff:63
College name:jyothi
Principal name:gylson
Location:vkt
Enter librarian name:
george
Enter no of books:
34
Is hostler(0/1):
1
Enter hostel name:
stmh
Enter Warden name:
Kuthoor


Enter Admission no:
123
NAME:Nidhish
ADMISSION NO:123
Roll no:35
ADDRESS:panthalil
EMAIL ID:nidhishjecc@gmail
Mobile No:7403186507
SEMESTER:5
YEAR:2010
NO:OF STUDENTS:63
TUTOR:soumya
DEPARTMENT:cse
HOD:aswathi
NO:OF STAFF:50
COLLEGE NAME:jyothi
PRINCIPAL:gylson
LOCATION:vkt
LIBRARIAN:george
No:of books:34
*/
