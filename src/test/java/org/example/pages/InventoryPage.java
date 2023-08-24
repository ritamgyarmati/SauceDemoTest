package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class InventoryPage extends HomePage{

    private WebElement itemSortingButton;

    public WebElement getItemSortingButton() {
        return webDriver.findElement(By.cssSelector("//select[@class='product_sort_container']"));
    }

    public void selectItemSortingMethod(String option) {
        Actions action = new Actions(webDriver);
        action.moveToElement(getItemSortingButton()).click().perform();
    }
}
