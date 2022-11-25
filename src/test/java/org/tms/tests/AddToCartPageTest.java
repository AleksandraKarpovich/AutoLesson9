package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.pages.CartPage;
import org.tms.pages.InventoryPage;
import org.tms.services.LoginPageService;

public class AddToCartPageTest extends BaseTest{
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
    public void addToCartTest(){
        inventoryPage.addToCart();
        inventoryPage.openCart();
        cartPage = new CartPage();
        String actualTextOfRemoveButton = cartPage.getTextOfNameOfRemoveButton();
        String expectedTextOfRemoveButton = "REMOVE";
        Assert.assertEquals(actualTextOfRemoveButton,expectedTextOfRemoveButton ,
                "The actual text of the REMOVE button does not match expected");
    }
}
