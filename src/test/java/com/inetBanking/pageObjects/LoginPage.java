package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver Idriver;
	
	public LoginPage(WebDriver rdriver)
	
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(name="uid")
	WebElement txtusername;
	
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	
	@FindBy(name="btnLogin")

	WebElement btnLogin;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;
	
	
	public void setUserName(String uname) {
		txtusername.sendKeys(uname);
		
	}
	
	public void setPassword(String pwd) {
		txtpassword.sendKeys(pwd);
		
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	}
	
