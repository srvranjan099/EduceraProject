package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EducLogin {
	WebDriver driver;
	
	public EducLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"__next\"]/div/nav/div[4]/button[2]")
	WebElement Login;
	
	
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(id="loginPassword")
	WebElement Pass;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/form/button")
	WebElement LoginButt;
	
	public void enterUrl() {
		driver.get("https://www.edureka.co/");
	}
	
	public void eduLogin() throws InterruptedException {
		Login.click();
		Thread.sleep(2000);
		Email.sendKeys("srvranjan099@gmail.com");

		Pass.sendKeys("Ayirpsh1@");
		LoginButt.click();
		System.out.println("Login is successful ");
		
	}
	
	
	

}
