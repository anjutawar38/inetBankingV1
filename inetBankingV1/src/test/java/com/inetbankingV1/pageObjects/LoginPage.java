package com.inetbankingV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(name = "uid")
	WebElement txtUsername;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "btnLogin")

	WebElement LoginButton;
	
	public void setUsername(String Username)
	
	{
		txtUsername.sendKeys(Username);
	}

	public void setPassword(String pwd)
	
	{
		password.sendKeys(pwd);
	}

	public void clickSubmit()
	
	{
		LoginButton.click();
	}

}
