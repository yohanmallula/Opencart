package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath = "//*[@name=\"firstname\"]")
	WebElement txtFirstname;
	
	@FindBy(xpath = "//*[@name=\"lastname\"]")
	WebElement txtLastname;
	
	@FindBy(xpath = "//*[@name=\"email\"]")
	WebElement txtemail;
	
	@FindBy(xpath = "//*[@name=\"password\"]")
	WebElement TxtPassword;
	//submit
	@FindBy(xpath = "//*[@name=\"agree\"]")
	WebElement policyCheck;
	//submit
	@FindBy(xpath = "//*[text() = \"Continue\"]")
	WebElement Clickonbutton;
	
	
	public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	
	public void setlastname(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	public void setEmail(String email)
	{
		txtemail.sendKeys(email);
	}
	public void setpassword(String password) {
		TxtPassword.sendKeys(password);
	}
	
	public void setcheck() {
		policyCheck.submit();
	}
	
	public void setcontains()
	{
		Clickonbutton.submit();
	}
	
}
