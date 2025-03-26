package com.LUMA.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LUMA.browser.Browser;

public class LogoutObjects extends Browser {

    public LogoutObjects() {
        PageFactory.initElements(driver, this);
    }

//    public By accountDropdown = By.xpath("//button[@data-action='customer-menu-toggle']");
//    public By logout = By.xpath("//a[contains(text(),'Sign Out')]");

     //webelement to store dropdown element 
    @FindBy(xpath = "//div[@class='panel header']//button[@type='button']")
    public WebElement accountDropdownElement;
     
    @FindBy(xpath = "//a[contains(text(),'Sign Out')]")
    public WebElement logoutElement;

}
