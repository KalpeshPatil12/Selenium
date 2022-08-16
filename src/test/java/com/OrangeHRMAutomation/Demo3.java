package com.OrangeHRMAutomation;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String :- ");
		
		String str=sc.nextLine();
		
		String[] s=str.split(" ");
		
		for(int i=0; i<s.length; i++)
		{
			char c=s[i].charAt(0);
			
			String s1=String.valueOf(c).toUpperCase();
			
			String s2=s[i].substring(1);
			
			System.out.print(s1+s2+ " ");
		}
		
	}

}
