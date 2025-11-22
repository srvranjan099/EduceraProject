package com.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		WebElement ele=driver.findElement(By.id("dropdownMenuButton"));
		ele.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/a[1]")).click();
		

	}

}
