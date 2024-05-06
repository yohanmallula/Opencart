package testCases;


import org.testng.annotations.*;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.TestBase;

public class TC__001Accountregestion  extends TestBase{
	

	@Test
	public void verify_account_registion()
	{
		
		logger.info("log start ...............................");
		HomePage hp = new HomePage(driver);
		hp.Clickmyaccount();
		logger.info("click on my account ...............................");
		hp.clickregister();
		logger.info("click on regestion  ...............................");
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		regpage.setFirstName("yohan");
		logger.info("enter my name  ...............................");
		regpage.setlastname("mallula");
		logger.info("enter my last name  ...............................");
		regpage.setEmail("Yohanmallula546@gmail.com");
		logger.info("enter on my email ...............................");
		regpage.setpassword("Y0h@n(9876)");
		logger.info("enter the password ...............................");
		regpage.setcheck();
		regpage.setcontains();
		
		logger.info("log end ...............................");
		
		System.out.println("end");
	}

}
