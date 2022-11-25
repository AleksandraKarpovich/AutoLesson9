package org.tms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage{

    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfMainPageSection;

    public String getTextOfNameOfMainPageSection(){
        return nameOfMainPageSection.getText();
    }
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private  WebElement buttonAddToCart;

    public void addToCart(){
        buttonAddToCart.click();
    }
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private  WebElement buttonCart;
    public void openCart(){
        buttonCart.click();
    }
    public String getTextOfNameOfAddButton(){
        return buttonAddToCart.getText();
    }

    // Lesson 11: Loadable Page
    public InventoryPage waitButtonIsLoaded() {
        waitVisibilityOf(buttonAddToCart);
        return this;
    }

}
