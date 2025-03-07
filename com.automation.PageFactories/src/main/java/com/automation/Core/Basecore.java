package com.automation.Core;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public interface Basecore {

	@BeforeSuite
	private static void beforesuite() throws FileNotFoundException, IOException {
	}

	public static boolean isDisplayed() {
		return false;
	}

	public static void ClickWithValue(String locator, String value) {
	}

	public static void click() {
	}

	public static void ClickUsingJavaScriptwithvalue() {

	}

	public static void ClickUsingJavaScript() {

	}

	public static void Type(String locator, String vlaue) {
	}

	public static void typeUsingJS() {

	}

	public static void selectOptionUsingSelectClass() {

	}

	@AfterSuite
	private void aftersuite() {
	}
}
