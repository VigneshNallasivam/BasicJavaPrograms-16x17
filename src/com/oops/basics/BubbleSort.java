package com.oops.basics;
public class BubbleSort 
{
	static void sort(int array[])
	{
		int temp =0;
		for(int i =0 ; i<array.length ; i++)
		{
			for(int k = 1 ; k < array.length-1 ; k++)
			{
				if(array[k-1] > array[k])
				{
					temp = array[k-1];
					array[k-1] = array[k];
					array[k] = temp;
				}
			}
		}

	}

	public static void main(String[] args)
	{
		int array[] = {5,1,4,2,8};
		System.out.println("***Before Bubble-Sort***");
		for(int show:array)
		{
			System.out.print(show +" ");
		}

		System.out.println();
		sort(array);

		System.out.println("***After Bubble-Sort***");
		for(int show:array)
		{
			System.out.print(show +" ");
		}
	}

}
