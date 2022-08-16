package com.OrangeHRMAutomation;

import java.util.Scanner;

public class Count1 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		String str;
		
		System.out.println("Enter the String :- ");
		
		str=scan.nextLine();
		
		int i=0;
		
		for(char a:str.toCharArray())
		{
			i++;
		}
		
		System.out.println("The length of the string "+i);

	}

}
