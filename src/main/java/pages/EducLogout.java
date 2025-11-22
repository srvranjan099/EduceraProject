package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EducLogout {
	WebDriver driver;
	
	public EducLogout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//*[@id=\"footauto\"]/app-root/app-onboarding-user-details/app-header/header/nav/div/div[3]/ul/li[6]/div/button/img")
	WebElement profile;
	
	@FindBy(linkText = "Log Out")
	WebElement Logout;
	
	public void logout() throws InterruptedException {
		profile.click();
		Thread.sleep(2000);
		Logout.click();
		
		
	}

}
