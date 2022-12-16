package com.oops.basics;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class QueuePalindrome 
{
	/*
	 * Using Queue Basic Operations & String-Builder Finding String Is Palindrome/Not
	 */
	public void palindrome()
	{
		StringBuilder builder = new StringBuilder();
		Queue<String> que = new LinkedList<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String : ");
		que.offer(scanner.next());
		String strOrg = que.peek();
		System.out.println("Before Reversing : "+strOrg);
		builder.append(strOrg);
		builder.reverse();
		String strRev = builder.toString();
		System.out.println("After Reversing : "+strRev);
		if(strOrg.equals(strRev))
			System.out.println("Given String is Palindrome");
		else
			System.out.println("Given String is NOT Palindrome");
	}

	public static void main(String[] args)
	{
		QueuePalindrome objx = new QueuePalindrome();
		objx.palindrome();
	}
}



