package com.automation.pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.automation.Core.Page;
import com.automation.Locators.Bankslocator;

import bsh.This;

public class Banks extends Page {

	public static Bankslocator bankslocator;

	public void Banks() {
		this.bankslocator = new Bankslocator();
		PageFactory.initElements(driver, this.bankslocator);
	}

	public static void selectBankSearchoption(String option) {
		try {
			selectOptionUsingSelectClass(bankslocator.options, option);
		} catch (Exception e) {

			log.debug("Using Javascriptexcutor for clicking" + option);
			ClickUsingJavaScriptwithvalue(bankslocator.options, option);
		}

	}

	public static void search( String value) {

		click(bankslocator.searchbox);
		try {
			Type(bankslocator.searchbox, value);
			log.debug("Vlaue is been entered into the " + ":" + "Bank_search_icon");
		} catch (Exception e) {
			log.debug("Using typewith js to write " + "Bank_search_icon");
			typeUsingJS(bankslocator.searchbox, value);
		}

	}

	public static void searchicon() {
		try {
			click(bankslocator.searchiconElement);
		} catch (Exception e) {
			log.debug("Using javascript clicking on search icon" + "Bank_search_icon_Css");
			ClickUsingJavaScript(bankslocator.searchiconElement);
		}

	}
}
