package com.oops.basics;
import java.util.Scanner;
import java.util.regex.Pattern;
public class RegexPattern 
{
	String name;
	String mobNo;
	String date;

	void setName(String name)
	{
		this.name = name;
	}
	void setMobile(String mobNo)
	{
		this.mobNo = mobNo;
	}
	void setDate(String date)
	{
		this.date = date;
	}

	public String getName()
	{
		return name;
	}
	public String getMobile()
	{
		return mobNo;
	}
	public String getDate()
	{
		return date;
	}
	public String toString()
	{
		return ("Name is : "+name +"\nMobile Number Is : "+mobNo +"\nDate Is : "+date);
	}
	public void regexCheck()
	{
		String str1 = "[A-Z]+[.][a-zA-Z]+";
		boolean result1 = Pattern.matches(str1,getName());
		System.out.println("Is Valid : "+result1 );

		String str2 = "^(91)[-][0-9]+";
		boolean result2 = Pattern.matches(str2,getMobile());
		System.out.println("Is Valid : "+result2 );

		String str3 = "[0-9]+[/][0-9]+[/][0-9]+";
		boolean result3 = Pattern.matches(str3,getDate());
		System.out.println("Is Valid : "+result3 );
	}
	public static void main(String[] args)
	{
		RegexPattern objx = new RegexPattern();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name : ");
		objx.setName(scanner.next());
		System.out.println("Enter Mobile Number : ");
		objx.setMobile(scanner.next());
		System.out.println("Enter Date");
		objx.setDate(scanner.next());
		System.out.println(objx.toString());
		objx.regexCheck();
	}
}
