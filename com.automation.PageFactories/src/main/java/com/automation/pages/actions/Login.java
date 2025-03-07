package com.automation.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.xml.sax.Locator;

import com.automation.Core.Constants;
import com.automation.Core.Page;
import com.automation.Locators.LoginPageLocator;

public class Login extends Page {
	public static LoginPageLocator loginLocator;

	public Login() {
		this.loginLocator = new LoginPageLocator();
		PageFactory.initElements(driver, this.loginLocator);

	}

	public static void email(String email) {

		Type(loginLocator.email_TextField, email);
	}

	public static void password(String password) {
		Type(loginLocator.passwordElement, password);

	}

	public static  void loginbtn() {
		click(loginLocator.loginbutton);
	}

	public static void forgotpassword() {
		click(loginLocator.forgotpasswordElement);
	}

	public static void passwordtoggle() {
		click(loginLocator.passwordtogglElement);
	}
}
