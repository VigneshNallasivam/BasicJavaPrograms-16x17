package com.oops.basics;

public class BinarySearchTree 
{
	class Node 
	{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data = data;
		}
	}
	Node root;
	BinarySearchTree()
	{
		root = null;
	}
	void insert(int data)
	{
		root = insertRec(root,data);

	}
	Node insertRec(Node root,int data)
	{
		if(root == null)
		{
			root = new Node(data);
			return root;
		}

		else if(data < root.data)
			root.left = insertRec(root.left,data);
		else
			root.right = insertRec(root.right,data);
		return root;
	}
	void order()
	{
		orderRec(root);
	}
	void orderRec(Node root)
	{
		if(root == null)
			return;

		orderRec(root.left);
		System.out.print(root.data + " ");
		orderRec(root.right);
	}
	public boolean search(Node root, int input)
	{
		if(root == null)
		{
			return false;
		}
		if(root.data == input)
		{
			return true;
		}
		boolean result1 = search(root.left,input);
		if(result1 == true)
			return true;
		boolean result2 = search(root.right,input);
		return result2;
	}
	public static void main(String[] args)
	{
		BinarySearchTree tree = new BinarySearchTree();//5 1 2 3 4 100
		System.out.println("Test Case #1 :  We have only one tree.");
		tree.insert(5);
		tree.order();
		System.out.println();
		
		System.out.println("Test Case #2: Two trees can be created using two nodes.");
		tree.insert(1);
		tree.order();
		System.out.println();
		
		System.out.println("Test Case #3:Five Trees can be created using 3 Nodes.");
		tree.insert(2);
		tree.order();
		System.out.println();
		tree.insert(3);
		tree.order();
		System.out.println();
		tree.insert(4);
		tree.order();
		System.out.println();
		tree.insert(100);
		tree.order();
		System.out.println();
	}

}
