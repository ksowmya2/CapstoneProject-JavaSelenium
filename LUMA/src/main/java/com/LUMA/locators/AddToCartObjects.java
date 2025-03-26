package com.LUMA.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.LUMA.browser.Browser;
import java.util.List;

public class AddToCartObjects extends Browser {

    public AddToCartObjects() {
        PageFactory.initElements(driver, this);
    }


    
    @FindBy(xpath = "//div[@attribute-code='size']/div/div")
    public List<WebElement> sizeOptions;

    @FindBy(xpath = "//div[contains(@class, 'swatch-option color')]")
    public List<WebElement> colorOptions;


    @FindBy(id = "qty")
    public WebElement quantityBox;


    @FindBy(id = "product-addtocart-button")
    public WebElement addToCartButton;

    //after adding item to cart a message appears 
    @FindBy(css = ".message-success")
    public WebElement cartMessage;
    
    @FindBy(xpath = "//span[@class='price']")
    public WebElement cartAmountElement;
    
    @FindBy(xpath = "//a[@class='action showcart']")
    public WebElement cartSymbolElement;
}
