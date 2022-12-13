package com.oops.basics;
import java.util.Arrays;
import java.util.Scanner;
public class PrimeAnagramPalindrome 
{
	public static boolean isPrime(int number)
	{
		if(number<=1)                                    //Because '0' & '1' is not a prime number 
			return false;
		else if(number==2)                               //Because '2' is the only Even prime number
			return true;
		else if(number%2==0)                             //Because numbers perfectly divisible by 2(other Even numbers) is not considered,so false 
			return false;
		for(int i=3 ; i<=Math.sqrt(number) ; i=i+2)          //For Getting all the Odd Numbers Other than '1'
		{
			if(number % i == 0)                              //For filtering out the possibility of odd to odd division
				return false;
		}
		return true;
	}

	public void palindromeNumber(int number)
	{
		int sum=0;
		int remainder;
		int temp = number;
		while(number>0)
		{
			remainder = number % 10;           
			sum = (sum*10) + remainder;  
			number = number/10;              
		}

		if(temp==sum)
			System.out.println("Yes! Given Number Is a Palindrome Number");
		else 
			System.out.println("No! Given Number Is NOT a Palindrome Number");
	}

	public void anagramNumbers(int number)
	{
		char result[] = (String.valueOf(number)).toCharArray();
		Arrays.sort(result);
		if(result.equals(number))
			System.out.println("Number is Anagram");
		else
			System.out.println("Number is Not Anagram");

	}

	public static void main(String[] args)
	{
		PrimeAnagramPalindrome objx = new PrimeAnagramPalindrome();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number : " );
		int number = scan.nextInt();
		objx.isPrime(number);
		if(isPrime(number) == true)
		{
			System.out.println("Number is a Prime Number");
			objx.palindromeNumber(number);
			objx.anagramNumbers(number);
		}
		else
			System.out.println("Number is Not a Prime Number");

	}

}
