package com.OrangeHRMAutomation;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String :- ");
		
		String x=sc.nextLine();
		
		char y[]=x.toCharArray();
		
		int size=y.length;
		
		int i=0;
		
		while(i!=size)
		{
			y[i] = (char) (y[i]-32);
			i++;
		}
		
		System.out.println(y);
		
		
	}

}
