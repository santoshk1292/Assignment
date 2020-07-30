package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;
	
	By email = By.cssSelector("expression to find the element");
	By password = By.xpath("expression to find the element");
	By loginButton = By.id("unique id to find element");
	By title = By.cssSelector("expression to find the element");
	By searchBox = By.xpath("expression to find the element");
	By selectItem = By.cssSelector("expression to find the element");
	By checkOutButton = By.id("unique id to find element");
	By orderText = By.id("unique id to find element");
	By name = By.xpath("expression to find the element");
	By mobileNumber = By.id("unique id to find element");
	By address = By.cssSelector("expression to find the element");
	By submitButton = By.xpath("expression to find the element");
	By otpButton = By.cssSelector("expression to find the element");
	By payButton = By.xpath("expression to find the element");
	
	
	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
	}
	public WebElement getSearchBox() {
		return driver.findElement(searchBox);
	}
	public WebElement getSelectItem() {
		return driver.findElement(selectItem);
	}
	public WebElement getCheckOutButton() {
		return driver.findElement(checkOutButton);
	}
	public WebElement getOrderText() {
		return driver.findElement(orderText);
	}
	public WebElement getName() {
		return driver.findElement(name);
	}
	public WebElement getMobileNumber() {
		return driver.findElement(mobileNumber);
	}
	public WebElement getAddress() {
		return driver.findElement(address);
	}
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	public WebElement getSubmitButton() {
		return driver.findElement(submitButton);
	}
	public WebElement getOtpButton() {
		return driver.findElement(otpButton);
	}
	public WebElement getPayButton() {
		return driver.findElement(payButton);
	}

}
