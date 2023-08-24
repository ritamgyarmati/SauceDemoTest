package org.example.test;


import org.example.pages.HomePage;
import org.example.pages.InventoryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class CartTest extends BaseTest{

    private HomePage homePage;
    private InventoryPage inventoryPage;

    @Test
    public void addItemTocartTest() {

        homePage = new HomePage();
        homePage.getWebDriver().get(URL);
        homePage.getUserNameField().sendKeys(standardUserName);
        homePage.getPasswordField().sendKeys(password);
        homePage.getLogInButton().click();

        Assert.assertEquals(homePage.getWebDriver().getCurrentUrl(), URL + "inventory.html");
        inventoryPage = new InventoryPage();
        inventoryPage.selectItemSortingMethod("");


    }
}
