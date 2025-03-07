package com.automation.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.automation.Core.Page;
import com.automation.Locators.MakerSignout;

import bsh.This;

public class MakerSignoutLink extends Page {

	public static MakerSignout signoutlocators;

	public void MakerSignoutLink() {

		this.signoutlocators = new MakerSignout();
		PageFactory.initElements(driver, this.signoutlocators);
	}

	public static void signout() {

		click(signoutlocators.adminsignoutlink);
		click(signoutlocators.signoutElement);
	}
}
