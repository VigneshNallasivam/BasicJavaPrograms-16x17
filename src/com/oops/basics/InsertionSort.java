package com.oops.basics;
public class InsertionSort 
{
	static void sort(int array[])
	{
		for(int i=1 ; i<array.length ; i++)
		{
			int key = array[i];
			int x = i-1;
			
			while((x > -1) && (array[x] > key))
			{
				array[x+1] = array[x];
				x--;
		    }
			array[x+1]=key;
		}
	}
	
	public static void main(String[] args)
	{
		int array[] = {12,11,13,5,6};
		System.out.println("***Before Insertion-Sort***");
		for(int show:array)
		{
			System.out.print(show +" ");
		}
		
		sort(array);
		System.out.println();
		
		System.out.println("***After Insertion-Sort***");
		for(int show:array)
		{
			System.out.print(show +" ");
		}
	}

}
