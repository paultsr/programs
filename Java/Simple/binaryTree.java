/*
REG NO:JYAKECS035
EXP NO:12
*/
import java.util.*;
class node
{
	int value;
	node left;
	node right;
	node (int v)
	{
		value=v;
	}
}

class operations
{
	void start()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the root");
		int r=scan.nextInt();
		node root=new node(r);
		insert(root);
		System.out.println("Preorder Traversal");
		preorder(root);
		System.out.println("Inorder Traversal");
		inorder(root);
		System.out.println("Postorder Traversal");
		postorder(root);
	}
	
	void insert(node r)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Is there a left child for " +r.value+ "(y/n):");
		String c=scan.next();
		if(c.equals("y"))
		{
			System.out.print("Enter element:");
			int n=scan.nextInt();
			r.left=new node(n);
			insert(r.left);
		}
		System.out.print("Is there a right child for " +r.value+ "(y/n):");
		c=scan.next();
		if(c.equals("y"))
		{
			System.out.print("Enter element:");			
			int n=scan.nextInt();
			r.right=new node(n);
			insert(r.right);
		}
	}
	
	void preorder(node r)
	{
		if(r!=null)
		{
			System.out.print(" "+r.value);
			preorder(r.left);
			preorder(r.right);
		}
	}
	
	void inorder(node r)
	{
		if(r!=null)
		{
			inorder(r.left);
			System.out.print(" "+r.value);
			inorder(r.right);
		}
	}
	
	void postorder(node r)
	{
		if(r!=null)
		{
			postorder(r.left);
			postorder(r.right);
			System.out.print(" "+r.value);
		}
	}
}
	

class binaryTree
{
	public static void main(String args[])
	{
		operations s=new operations();
		s.start();	
	}
}
/*
OUTPUT:
========================================
Enter the root
5
Is there a left child for 5(y/n):y
Enter element:6
Is there a left child for 6(y/n):n
Is there a right child for 6(y/n):n
Is there a right child for 5(y/n):y
Enter element:7
Is there a left child for 7(y/n):n
Is there a right child for 7(y/n):n
Preorder Traversal
 5 6 7
Inorder Traversal
 6 5 7
Postorder Traversal
 6 7 5
*/

