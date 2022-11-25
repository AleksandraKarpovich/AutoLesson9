package org.tms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    private  WebElement buttonRemoveFromCart;

    public String getTextOfNameOfRemoveButton(){
        return buttonRemoveFromCart.getText();
    }

    public void removeFromCart(){
        buttonRemoveFromCart.click();
    }
    @FindBy(xpath = "//button[@id='continue-shopping']")
    private  WebElement buttonContinueShopping;

    public void continueShopping(){
        buttonContinueShopping.click();
    }

}

