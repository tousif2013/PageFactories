package com.automation.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocator {
	
	@FindBy(css="#email")
	public  WebElement email_TextField;
	
	@FindBy(css ="#password")
	public WebElement passwordElement;
	
	@FindBy(css="#submit")
	public  WebElement loginbutton;
	
	@FindBy(css="#forgot-password")
	public WebElement forgotpasswordElement;
	
	@FindBy(css="#password-toggle")
	public WebElement passwordtogglElement;
	
	@FindBy(css="@email-forgot")
	public WebElement foremailfieldElement;
	
	@FindBy(css="#reset")
	public WebElement resetbuttonElement;
			

}
