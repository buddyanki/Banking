package com.inetBanking.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_Login_001 extends BaseClass {
	
	
	@Test
	public void LoginTest() throws IOException {
		
		
		logger.info("URL Opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered Suername");
		
		lp.setPassword(password);
		logger.info("Entered passworsd");
		
		lp.clickSubmit();
		logger.info("Button Clicked");
		
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
		Assert.assertTrue(true);
		logger.info("Test case passed");
	}
		else 
		{
			captureScreen(driver, "LoginTest");
			Assert.assertTrue(false);	
		logger.info("Test case failed");
		}

}
}
