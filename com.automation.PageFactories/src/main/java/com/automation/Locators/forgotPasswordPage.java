package com.automation.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class forgotPasswordPage {
	
	
	
	@FindBy(css="#forgot-password")
	public WebElement forgotpasswordElement ;
	
	
	@FindBy(css="#reset")
	public WebElement restbuttonElement;
	
 @FindBy(xpath = "//button[@id='reset']/following-sibling::div")
 public WebElement backtologinElement;
}
