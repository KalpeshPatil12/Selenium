package com.OrangeHRMAutomation;

import java.util.Scanner;

public class PalindromeString1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String :- ");
		
		String str=sc.nextLine();
		
		//String str="too Hot to HOOT";
		
		str=str.replaceAll("\\s", "");
		
		String rev="";
		
		int len=str.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println("String is Palindrome String");
		}
		else
		{
			System.out.println("String is not Palindrome String");
		}

	}

}
