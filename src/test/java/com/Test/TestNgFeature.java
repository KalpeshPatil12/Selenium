package com.Test;

import org.testng.annotations.Test;

public class TestNgFeature {
	
	@Test
	public void loginTest() {
		
		System.out.println("Login test");
		int a=9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePageTest() {
		
		System.out.println("Home page");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void searchTest() {
		
		System.out.println("Search Test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void regTest() {
		
		System.out.println("Reg Test");
	}

}
