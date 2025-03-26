package com.LUMA.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LUMA.browser.Browser;

public class HomePageObjects extends Browser {

	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

//	public By signIn = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
//	public By createNewAccount = By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']");
//	public By homepage = By.xpath("//span[@class='base']");
	
    //signin link in the homepage
	@FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
	public WebElement signinLink;
	//createNewAccount link in the homepage
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[3]/a")
	public WebElement createNewAccountLink;
	
	// Homepagetext
	@FindBy(xpath = "//span[@class='base']")
	public WebElement homepageText;
	
	//carticon
	@FindBy(xpath="//a[@class='action showcart']")
	public WebElement cartIcon;
	
	//totalprice of the all the items in cart
	@FindBy(xpath="//div[2]/div[2]/div/span/span")
	public WebElement totalPrice;

    //delete button(remove item)
	@FindBy(xpath = "//a[@title='Remove item'] ")
	public List<WebElement> cartList;
	
	 //after click on remove item then a confirmation popup appears it click ok in confirmation popup
	@FindBy(xpath = "//button[@class='action-primary action-accept'] ")
	public WebElement popUpAcceptElement;
	
	//no of items in the cart
	@FindBy(xpath="//span[@class='counter qty'] /span[@class='counter-number']")
	public List<WebElement> counterElement;
	
	
	//proceed to checkout button
	@FindBy(xpath="//button[@id='top-cart-btn-checkout'] ")
	public WebElement proceedToCartElement;
	
	//to close the cart
	@FindBy(xpath="//button[@data-action='close']")
	public WebElement closingButtonElement;

}
