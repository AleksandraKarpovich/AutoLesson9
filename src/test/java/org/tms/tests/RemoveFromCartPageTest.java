package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.pages.CartPage;
import org.tms.pages.InventoryPage;
import org.tms.services.LoginPageService;

public class RemoveFromCartPageTest extends BaseTest{
    InventoryPage inventoryPage;
    CartPage cartPage;

    @BeforeClass
    public void loginPage() {
        LoginPageService loginPageService = new LoginPageService();
        inventoryPage = new InventoryPage();
        User user = new User();
        loginPageService.login(user);
    }


    @Test
    public void removeFromCartTest(){
        inventoryPage.addToCart();
        inventoryPage.openCart();
        cartPage = new CartPage();
        cartPage.removeFromCart();
        cartPage.continueShopping();
        String actualTextOfAddButton = inventoryPage.getTextOfNameOfAddButton();
        String expectedTextOfAddButton = "ADD TO CART";
        Assert.assertEquals(actualTextOfAddButton,expectedTextOfAddButton ,
                "The actual text of the REMOVE button does not match expected");
    }
}
