package com.oops.basics;
import java.util.Arrays;
public class BinarySearch 
{
	/*
	 * As Binary Search is always Performed After Sorting we Need Sorting First
	 */
    public void binarySearch(String array[]) 
	{
        System.out.println("String Array Before Sorting :-");
        for(String singers:array)
        {
        	System.out.println(singers);
        }
       
        System.out.println("\nString Array After Sorting :-");
        Arrays.sort(array);
        for(String singers:array)
        {
        	System.out.println(singers);
        }
        String key = "Sza"; 
        int result = Arrays.binarySearch(array,key); //Using Arrays library function to do Binary Search Operation
        System.out.println("\nThe Key Is Found At Index Position : " +result);
	}
    
    public static void main(String[] args)
    {
    	BinarySearch objx = new BinarySearch();
    	String array[] = {"Ariana Grande","Beyonce","Taylor Swift","Bruno Mars","Sza"};
    	objx.binarySearch(array);
    }

}
