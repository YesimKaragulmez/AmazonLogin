package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignInPage {
    @FindBy(id = "ap_email")
    public WebElement emailBox;
    @FindBy(id = "continue")
    public WebElement continueButton;
    @FindBy(id = "ap_password")
    public WebElement passwordBox;
    @FindBy(id = "signInSubmit")
    public WebElement signInButton;

    public AmazonSignInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
