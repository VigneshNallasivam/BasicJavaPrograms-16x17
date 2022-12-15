package com.oops.basics;
import java.util.Scanner;
public class Permutations 
{
	/*
	 * Function To Perform Permutation
	 */
	public void permute(String str,int Qa,int Qb)
	{
		if(Qa==Qb)
			System.out.println(str);
		else
		{
			for(int i=Qa ; i<=Qb ; i++)
			{
				str = swap(str,Qa,i);
				permute(str,Qa+1,Qb);
				str = swap(str,Qa,i);
			}
		}
	}
	/*
	 * Function To Perform Swapping
	 */
	public String swap(String str,int a,int b)
	{
		char temp;                        
		char cArray[] = str.toCharArray();
		temp = cArray[a];                 
		cArray[a]=cArray[b];              
		cArray[b]=temp;                   
		return String.valueOf(cArray);    
	}
	/*
	 * Driver/Main Function
	 */
	public static void main(String[] args)
	{
		Permutations objx = new Permutations();
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter A String To Perform Permutation :-");
	    String str = scanner.nextLine();
		int Qa = 0;
		int Qb = str.length()-1;
		System.out.println("Permutations of a String Is :-");
		objx.permute(str,Qa,Qb);
	}

}
