package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    protected WebDriver webDriver;
    private WebElement userNameField;
    private WebElement passwordField;
    private WebElement logInButton;

    public HomePage() {
        this.webDriver = new ChromeDriver();
    }

    public WebDriver getWebDriver() {
        return this.webDriver;
    }

    public WebElement getUserNameField() {
        return webDriver.findElement(By.id("user-name"));
    }

    public WebElement getPasswordField() {
        return webDriver.findElement(By.id("password"));
    }

    public WebElement getLogInButton() {
        return webDriver.findElement(By.id("login-button"));
    }
}
