package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EducMyProfile {
	WebDriver driver;
	
	public EducMyProfile(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id  = "dropdown-user_drop")
	WebElement Myprof;
	
	@FindBy(linkText = "My Profile")
	WebElement PersonalDetBut;
	
	@FindBy(xpath = "//*[@id=\"other_details\"]")
	WebElement icon;
	
	@FindBy(id = "fullName")
	WebElement name;
	
	@FindBy(xpath="//*[@id=\"mat-tab-content-0-0\"]/div/div/div/div[2]/div[1]/div[2]/ngx-select-dropdown/div/button")
	WebElement Experiance;
	
	@FindBy(xpath = "//*[@id=\"mat-tab-content-0-0\"]/div/div/div/div[2]/div[1]/div[3]/ngx-select-dropdown/div/button/span[1]")
	WebElement Industry;
	
	@FindBy(name="designation")
	WebElement Degination;
	
	@FindBy(xpath = "//*[@id=\"mat-tab-content-0-0\"]/div/div/div/button")
	WebElement SaveAndContinue;
	
	public void myProfile() throws InterruptedException  {
		Thread.sleep(1000);
		Myprof.click();
		PersonalDetBut.click();
		Thread.sleep(1000);
		icon.click();
		Thread.sleep(2000);
		name.clear();
		name.sendKeys("Saurav Ranjan");
		Thread.sleep(2000);
		Select sel=new Select(Experiance);
		sel.selectByIndex(0);
		System.out.println("not failtill now");
		Thread.sleep(2000);
		Select sel1=new Select(Industry);
		sel.selectByIndex(6);
		
		Degination.sendKeys("Test Engineer");
		Thread.sleep(2000);
		SaveAndContinue.click();
		
	}

}
