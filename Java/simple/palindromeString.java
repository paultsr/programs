	import java.util.*;
	public class palindromeString
	{
		public static void main(String args[])
		{
			String s;
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the String");
			s=scan.nextLine();
			if(palin(s))
			System.out.println("String is palindrome");
			else
			System.out.println("String is not palindrome");
		}
		
		static boolean palin(String x)
		{
			if(x.length()==1||x.length()==0)
			return true;
			if(x.charAt(0)==x.charAt(x.length()-1))
			return(palin(x.substring(1,x.length()-1)));
			
			return false;
		}
	}
	
/*
OUTPUT
......
enter the string
malayalam
string is palindrome
enter the string
hai
string is not palindrome
*/
