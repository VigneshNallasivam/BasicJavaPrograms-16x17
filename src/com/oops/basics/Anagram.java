package com.oops.basics;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram 
{		
	public void isAnagram(String str1,String str2)
	{
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		if(str1.length() == str2.length())
		{
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();

			Arrays.sort(charArray1); 
			Arrays.sort(charArray2);

			boolean result = Arrays.equals(charArray1,charArray2);
			System.out.println("Is Given Two Strings Are Anagram..? : Yes! " +result);
		}
		else
			System.out.println("Is Given Two Strings Are Anagram..? : No! false");
	}

	public static void main(String[] args)
	{
		Anagram objx = new Anagram();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String-1");
		String str1 = scan.next();
		System.out.println("Enter String-2");
		String str2 = scan.next();
		objx.isAnagram(str1, str2);
	}

}
