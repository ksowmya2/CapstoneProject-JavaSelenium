package com.LUMA.locators;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LUMA.browser.Browser;

public class MyAccountObject extends Browser {

    public MyAccountObject() {
        PageFactory.initElements(driver, this);
    }

//    
//    public By myAccountText = By.xpath("//span[@class='base']");
    //public By searchBox = By.xpath("//input[@id='search']");
    //public By searchItem = By.xpath("//ul[@role='listbox']/li/span[1]"); // ✅ Fixed XPath
//    public By RegistrationText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    
    //my account text
    @FindBy(xpath = "//span[@class='base']")
    public WebElement myAccountTextElement;

    //searchbox to enter the items
    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchBoxElement;

    //after entering item in searchbox then we get list of items that list of items stored in serachlist list
    @FindBy(xpath = "//ul[@role='listbox']/li/span[1]")
    public List<WebElement> searchList;
    
    //webelement store successfully registration message
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement RegistrationTextElement;
}
