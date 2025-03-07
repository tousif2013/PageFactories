package com.automation.Utilies;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.Core.Page;

public class ValidateMandatoryFields extends Page {
	
	public static void validateErrorMessages(Map<String, String> expectedErrors) {
	    for (Map.Entry<String, String> entry : expectedErrors.entrySet()) {
	        String locator = entry.getKey();
	        String expectedMessage = entry.getValue();

	        WebElement errorMessageElement;
	        if (locator.endsWith("_Css")) {
	//for now commenting            errorMessageElement = driver.findElement(By.cssSelector(or.getProperty(locator) + " + .error"));
	        } else if (locator.endsWith("_Xpath")) {
	//for now commenting            errorMessageElement = driver.findElement(By.xpath(or.getProperty(locator) + "/following-sibling::span[contains(@class, 'error')]"));
	        } else {
	            throw new IllegalArgumentException("Locator must end with _Css or _Xpath");
	        }

	//for now commenting this        String actualMessage = errorMessageElement.getText();
	 //for now commenting this       if (!actualMessage.equals(expectedMessage)) {
	/*
	 * throw new IllegalArgumentException("Expected error message: " +
	 * expectedMessage + " but found: " + actualMessage); }
	 */
	    }
	}

}
