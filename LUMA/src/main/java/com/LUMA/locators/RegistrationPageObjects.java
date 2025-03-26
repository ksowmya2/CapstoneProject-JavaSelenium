package com.LUMA.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LUMA.browser.Browser;

public class RegistrationPageObjects extends Browser 
{

	public RegistrationPageObjects() {
		PageFactory.initElements(driver,this);
	}
//	public By firstName = By.xpath("//input[@id='firstname']");
//	public By lastName = By.xpath("//input[@id='lastname']");
//	public By email = By.xpath("//input[@id='email_address']");
//	public By password = By.xpath("");
//	public By confirmPassword = By.xpath("//input[@id='password-confirmation']");
//	public By createAnAccount = By.xpath("//button[@title='Create an Account']");
//	public By emailError = By.xpath("//div[@id='email_address-error']");

	
	
	@FindBy(xpath = "//input[@id='firstname']")
	public WebElement firstNameElement;
	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement lastNameElement;
	@FindBy(xpath = "//input[@id='email_address']")
	public WebElement emailElement;
	@FindBy(xpath = "//input[@id='password']")
	public WebElement passwordElement;
	@FindBy(xpath = "//input[@id='password-confirmation']")
	public WebElement confirmPasswordElement;
	@FindBy(xpath = "//button[@title='Create an Account']")
	public WebElement createAnAccountElement;
	@FindBy(xpath = "//div[@id='email_address-error']")
	public WebElement emailErrorElement;

}