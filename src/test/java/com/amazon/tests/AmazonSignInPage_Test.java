package com.amazon.tests;

import com.amazon.pages.AmazonSignInPage;
import com.amazon.utilities.ConfigReader;
import com.amazon.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonSignInPage_Test {

    @Test
    public void signInTest() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_sign"));
        AmazonSignInPage amazonSignInPage = new AmazonSignInPage();
        amazonSignInPage.emailBox.sendKeys(ConfigReader.getProperty("email"));
        amazonSignInPage.continueButton.click();

        amazonSignInPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        amazonSignInPage.signInButton.click();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Authentication required");

    }


}
