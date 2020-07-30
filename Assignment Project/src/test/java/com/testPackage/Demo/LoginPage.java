package com.testPackage.Demo;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LoginPageObject;
import resources.Base;

public class LoginPage extends Base {
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = InitializeDriver();
		log.info("Driver initialized");
		driver.get(prop.getProperty("url"));
		log.info("Naivgated to Login page");
	}

	@Test(dataProvider = "getData")
	public void basePageNavigation(String userName, String password) throws IOException {
		LoginPageObject lpo = new LoginPageObject(driver);
		lpo.getEmail().sendKeys(userName);
		lpo.getPassword().sendKeys(password);
		lpo.getLoginButton().click();
		Assert.assertEquals(lpo.getTitle().getText(), "Title in the homepage");
		log.info("Landed on homepage");
		lpo.getSearchBox().sendKeys("enter the search tem in the search box\n");
		lpo.getSelectItem().click();
		lpo.getCheckOutButton().click();
		Assert.assertEquals(lpo.getTitle().getText(), "Title of the payment page");
		Assert.assertEquals(lpo.getOrderText().getText(), "Text in the payment page");
		lpo.getName().sendKeys("Enter name");
		lpo.getMobileNumber().sendKeys("enter mobile number");
		lpo.getAddress().sendKeys("Enter Address");
		lpo.getSubmitButton().click();
		lpo.getOtpButton().click();
		lpo.getPayButton().click();
	}

	@DataProvider
	public Object[][] getData() {
		Object data[][] = new Object[2][2];
		data[0][0] = "test email 1";
		data[0][1] = "test pwd 1";
		data[1][0] = "test email 2";
		data[1][1] = "test pwd 2";
		return data;
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
