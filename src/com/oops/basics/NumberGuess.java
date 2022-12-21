package com.oops.basics;
import java.util.*;
public class NumberGuess
{
	public static void binarySearch(int inputs[],int lowerbound,int upperbound,int guess)
	{
		int position;
		int count=1;
		position = (lowerbound + upperbound)/2;   
		while((inputs[position]!=guess)&&(lowerbound<=upperbound))
		{
			count++;
			if(inputs[position] > guess)
			{
				upperbound = position-1;
			}
			else
			{
				lowerbound = position+1;
			}
			position = (lowerbound + upperbound)/2;
		}
		if(lowerbound<=upperbound)
		{
			System.out.println("Guessed number is found in position : "+position);
			System.out.println("Guessed number is found after "+count +" comparisions");
		}
		else
		{
			System.out.println("Sorry..! Guessed number is not founded.");
		}
	}

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("The Inputs : ");
		int inputs[] = new int[101];
		for(int i=1 ; i<inputs.length ;i++)
		{
			//inputs[i] = i;
			inputs[i] = random.nextInt(100+1);
			System.out.println(i+") "+inputs[i]);
		}
		System.out.println("Guess any one number between 1 - 100");
		int guess = random.nextInt(100+1);
		System.out.println(guess);
		binarySearch(inputs,1,100,guess);
	}
}
