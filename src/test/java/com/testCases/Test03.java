package com.testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test03 {
	
	@BeforeClass
	public void init() {
		System.out.println("its a before class test ");
		
	}
	
	@Test
	public void test03()  {
		System.out.println("Test03");
		
	}
	@AfterClass
	public void tearup() {
		System.out.println("After class method");
	}

}
