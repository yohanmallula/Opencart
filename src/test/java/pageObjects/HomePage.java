package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement LnkMyAccount;
	
	@FindBy(xpath = "//a[text()='Register']" )
	WebElement LnkRegister;
	
	
	public void Clickmyaccount()
	{
		LnkMyAccount.click();
	}
	
	public void clickregister()
	{
		LnkRegister.click();
	}

}
