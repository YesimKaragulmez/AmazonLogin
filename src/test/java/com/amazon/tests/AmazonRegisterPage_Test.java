package com.amazon.tests;

import com.amazon.pages.AmazonRegisterPage;
import com.amazon.utilities.ConfigReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonRegisterPage_Test {
    AmazonRegisterPage amazonRegisterPage = new AmazonRegisterPage();

    @Test
    public void mainPageTest() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(amazonRegisterPage.accountList).build().perform();
        amazonRegisterPage.startHereLink.click();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Amazon Registration");

    }

    @Test
    public void registerPageTest() {

        amazonRegisterPage.nameBox.sendKeys(ConfigReader.getProperty("name"));
        amazonRegisterPage.emailBox.sendKeys(ConfigReader.getProperty("email"));
        amazonRegisterPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        amazonRegisterPage.rePasswordBox.sendKeys(ConfigReader.getProperty("repassword"));
        amazonRegisterPage.continueButton.click();

        Assert.assertEquals(Driver.getDriver().getTitle(), "Authentication required");

    }


}

















