package com.OrangeHRMAutomation;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
				
		String str ;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		
	     str=scan.nextLine();
		
		System.out.println("The length of the string :- "+str.length());
	    
		int vow=0, con=0, space=0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || 
			   str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
			   
			{
				++vow;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z' ||
					str.charAt(i)>='A' && str.charAt(i)<='Z')
				
			{
				++con;
			}
			else if(str.charAt(i)==' ')
			{
				++space;
			}
		}
		System.out.println("Number of vowels "+vow);
		
		System.out.println("Number of consonants "+con);
		
		System.out.println("Number of space "+space);

	}

}
