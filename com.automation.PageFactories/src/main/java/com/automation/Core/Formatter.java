package com.automation.Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Formatter extends Page {
	public static String getDynamicLocator(String locatorTemplate, String replacement) {
		String formattedLocator = String.format(locatorTemplate, replacement);
		return formattedLocator; // Return By.xpath for Selenium
	}

}
