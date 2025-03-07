package com.automation.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.automation.Core.Page;
import com.automation.Locators.forgotPasswordPage;

public class ForgotPasswordPage extends Page {

	public static forgotPasswordPage forgotPasswordPagelocators;

	public void ForgotPasswordPage() {
		this.forgotPasswordPagelocators = new forgotPasswordPage();
		PageFactory.initElements(driver, this.forgotPasswordPagelocators);

	}

	public static void enteremail(String email) {
		Type(forgotPasswordPagelocators.forgotpasswordElement, email);
		click(forgotPasswordPagelocators.restbuttonElement);
	}

	public static void backtoLogin() {
		click(forgotPasswordPagelocators.backtologinElement);
	}

}
