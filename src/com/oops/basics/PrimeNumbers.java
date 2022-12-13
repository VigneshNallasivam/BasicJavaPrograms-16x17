package com.oops.basics;
import java.util.Scanner;
public class PrimeNumbers 
{
	public static boolean isPrime(int num)
	{
		if(num<=1)                                    //Because '0' & '1' is not a prime number 
			return false;
		else if(num==2)                               //Because '2' is the only Even prime number
			return true;
		else if(num%2==0)                             //Because numbers perfectly divisible by 2(other Even numbers) is not considered,so false 
			return false;
		for(int k=3;k<=Math.sqrt(num);k=k+2)          //For Getting all the Odd Numbers Other than '1'
		{
			if(num%k==0)                              //For filtering out the possibility of odd to odd division
				return false;
		}
		return true;
	}

	public static void main(String[] args)
	{
		PrimeNumbers objx = new PrimeNumbers();
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(isPrime(num) == true)
			System.out.println("Number is a Prime Number");
		else
			System.out.println("Number is Not a Prime Number");
	}

}
