package com.automation.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MakerSignout {

	@FindBy(css = "#adminName")
	public WebElement adminsignoutlink;
	@FindBy(css = "#logout")
	public WebElement signoutElement;

}
