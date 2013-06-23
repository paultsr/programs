//BinSearchTree.java
//demonstrates binary search tree
//to run this program : java TreeApp
//date :2011/07/14
import java.io.*;
import java.util.*;
class Node
{
	public int data;
	public Node leftChild;
	public Node rightChild;
	public void displayNode()
	{
		System.out.print('{');
		System.out.print(data);
		System.out.print('}');
	}
}
class Tree
{
	private Node root;
	public Tree()
	{ root=null;}
	public Node find(int key)
	{
		Node current=root;
		while(current.data!=key)
		{
			if(key<current.data)
				current=current.leftChild;
			else
				current=current.rightChild;
			if(current==null)
				return null;
		}
		return current;
	}
	public void insert(int id)
	{
		Node newNode=new Node();
		newNode.data=id;
		if(root==null)
			root=newNode;
		else
		{
			Node current=root;
			Node parent;
			while(true)
			{
				parent=current;
				if(id<current.data)
				{
					current=current.leftChild;
					if(current==null)
					{
						parent.leftChild=newNode;
						return;
					}
				}
				else
				{
					current=current.rightChild;
					if(current==null)
					{
						parent.rightChild=newNode;
						return;
					}
				}
			}
		}
	}
	public void traverse(int traverseType)
	{
		switch(traverseType)
		{
			case 1:System.out.print("\n Preorder traversal:");
			       preOrder(root);
			       break;
			case 2:System.out.print("\n Inorder traversal:");
			       inOrder(root);
			       break;
			case 3:System.out.print("\n Postorder traversal:");
			       postOrder(root);
			       break;
		}
		System.out.println();
	}
	private void preOrder(Node localRoot)
	{
		if(localRoot!=null)
		{
			localRoot.displayNode();
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}
	private void inOrder(Node localRoot)
	{
		if(localRoot!=null)
		{
			inOrder(localRoot.leftChild);
			localRoot.displayNode();
			inOrder(localRoot.rightChild);
		}
	}
	private void postOrder(Node localRoot)
	{
		if(localRoot!=null)
		{
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			localRoot.displayNode();
		}
	}
	public void displayTree()
	{
		Stack globalStack=new Stack();
		globalStack.push(root);
		int nBlanks=32;
		boolean isRowEmpty=false;
		System.out.println(".................................................................................");
		while(isRowEmpty==false)
		{
			Stack localStack=new Stack();
			isRowEmpty=true;
			for(int j=0;j<nBlanks;j++)
				System.out.print(' ');
			while(globalStack.isEmpty()==false)
			{
				Node temp =(Node)globalStack.pop();
				if(temp!=null)
				{
					System.out.print(temp.data);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);
					if(temp.leftChild!=null ||temp.rightChild!=null)
						isRowEmpty=false;
				}
				else
				{
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				for(int j=0;j<nBlanks*2-2;j++)
					System.out.print(' ');
			}
			System.out.println();
			nBlanks /=2;
			while(localStack.isEmpty()==false)
				globalStack.push(localStack.pop());
		}
		System.out.println(".................................................................................");
	}
}

class TreeApp
{
	public static void main(String args[]) throws IOException
	{
		int value;
		Tree theTree=new Tree();
		theTree.insert(50);
		theTree.insert(25);
		theTree.insert(75);
		theTree.insert(12);
		theTree.insert(37);
		while(true)
		{
			putText("Enter first letter of\t");
			putText("show, insert, find, traverse or exit:");
			int choice=getChar();
			switch(choice)
			{
				case 's': theTree.displayTree();
					  break;
				case 'i': putText("Enter value to insert:");
					  value=getInt();
					  theTree.insert(value);
					  break;
				case 'f': putText("Enter value to find:");
					  value=getInt();
					  Node found=theTree.find(value);
					  if(found!=null)
					  {
						  putText("Found:");
						  found.displayNode();
						  putText("\n");
					  }
					  else
						  putText("Could not find"+value+'\n');
					  break;
				case 't': putText("Enter type 1:preOrder, 2:inOrder or 3:postOrder :-");
					  value=getInt();
					  theTree.traverse(value);
					  break;
				case 'e': System.exit(0);
				default : putText("Invalid entry\n");
			}
		}
	}
	public static void putText(String s)
	{
		System.out.print(s);
		System.out.flush();
	}
	public static String getString() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		return s;
	}
	public static char getChar() throws IOException
	{
		String s=getString();
		return s.charAt(0);
	}
	public static int getInt() throws IOException
	{
		String s=getString();
		return Integer.parseInt(s);
	}
}
/*
OUTPUT
------
paulson@paulson-Inspiron-1525:~/pplab/2/BinSearchTree$ javac BinSearchTree.java
Note: BinSearchTree.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
paulson@paulson-Inspiron-1525:~/pplab/2/BinSearchTree$ java TreeApp 
Enter first letter of	show, insert, find, traverse or exit:s
.................................................................................
                                50                                                              
                25                              75                              
        12              37              --              --              
.................................................................................
Enter first letter of	show, insert, find, traverse or exit:i
Enter value to insert:61
Enter first letter of	show, insert, find, traverse or exit:s
.................................................................................
                                50                                                              
                25                              75                              
        12              37              61              --              
.................................................................................
Enter first letter of	show, insert, find, traverse or exit:f
Enter value to find:61
Found:{61}
Enter first letter of	show, insert, find, traverse or exit:t
Enter type 1:preOrder, 2:inOrder or 3:postOrder :-2

 Inorder traversal:{12}{25}{37}{50}{61}{75}
Enter first letter of	show, insert, find, traverse or exit:e
paulson@paulson-Inspiron-1525:~/pplab/2/BinSearchTree$ 
*/
