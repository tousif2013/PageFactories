package com.automation.Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automation.Core.Page;
import com.mysql.cj.util.LogUtils;

public class Login extends Page {

	@Test
	public static void login() {

		com.automation.pages.actions.Login.email("email");
		com.automation.pages.actions.Login.password("password");

		isDisplayed(com.automation.pages.actions.Login.loginLocator.loginbutton);
		com.automation.pages.actions.Login.loginbtn();

	}

}
