package com.oops.basics;
import java.util.Scanner;
import java.util.Stack;
public class BalancedParanthesis 
{
	public boolean paranthesis(String str)
	{
		Stack stck = new Stack();
		char charArray[] = str.toCharArray();
		for(int i=0; i<charArray.length;i++)
		{
			char brackets = charArray[i];
			stck.push(brackets);
			System.out.print("The Characters Are : ");
			System.out.println(stck);
		}
		stck.pop();
		if(stck.isEmpty()==false)
			System.out.println("Balanced Paranthesis");
		else 
			System.out.println("Un-Balanced Paranthesis");
		return stck.empty();
	}
	public static void main(String[] args)
	{
		BalancedParanthesis objx = new BalancedParanthesis();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String Value");
		String str = scanner.next();
		objx.paranthesis(str);
	}

}
