package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonRegisterPage {
    @FindBy(id = "nav-link-accountList")
    public WebElement accountList;
    @FindBy(linkText = "Start here.")
    public WebElement startHereLink;
    @FindBy(id = "ap_customer_name")
    public WebElement nameBox;
    @FindBy(id = "ap_email")
    public WebElement emailBox;
    @FindBy(id = "ap_password")
    public WebElement passwordBox;
    @FindBy(id = "ap_password_check")
    public WebElement rePasswordBox;
    @FindBy(id = "continue")
    public WebElement continueButton;

    public AmazonRegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
