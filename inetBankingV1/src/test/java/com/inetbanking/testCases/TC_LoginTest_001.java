package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbankingV1.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void LoginTest() {
		
  driver.get(baseURL);
  logger.info("URL is opened");
  
  LoginPage lp = new LoginPage(driver);
  
	lp.setUsername(username);
	logger.info("Entered Username");
	lp.setPassword(password);
	logger.info("Entered Password");
	lp.clickSubmit();
	
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
		
		Assert.assertTrue(true);
		logger.info("Login test is passed");
	}
	else {
		 Assert.assertTrue(false);
		 logger.info("test case is failed");
	}
  
  
	}
	
}
