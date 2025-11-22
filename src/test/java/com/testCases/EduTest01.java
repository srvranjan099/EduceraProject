package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.EducLogin;
import pages.EducLogout;
import pages.EducMyProfile;

public class EduTest01 {
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test() throws InterruptedException {
		EducLogin logi=new EducLogin(driver);
		EducMyProfile pr=new EducMyProfile(driver);
		EducLogout logo=new EducLogout(driver);
		logi.enterUrl();
		logi.eduLogin();
		logo.logout();
	}
		
	

}
