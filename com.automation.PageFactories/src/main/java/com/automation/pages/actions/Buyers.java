package com.automation.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.automation.Core.Page;
import com.automation.Locators.Buyerlocator;

import bsh.This;

public class Buyers extends Page {

	public static Buyerlocator buyerspagelocators;

	public void Buyers() {

		this.buyerspagelocators = new Buyerlocator();
		PageFactory.initElements(driver, this.buyerspagelocators);
	}

	public static void search(String text) {

		Type(buyerspagelocators.searchbuyerElement, text);
		log.debug("clicking on Buyers Search textfield");
	}

	public static void searchicon() {
		click(buyerspagelocators.searchiconElement);
	}

	public static void searchDropdownOption(String optionName) {
		try {
			ClickUsingJavaScriptwithvalue(buyerspagelocators.buyeroptionElement, optionName);
			log.debug("Entered ");
		} catch (Exception e) {
			log.debug("using select calss to select option");
			selectOptionUsingSelectClass(buyerspagelocators.buyeroptionsElement, optionName);
		}

	}

	public static BuyerDetails ClickViewEdit(String Buyername) {

		click(buyerspagelocators.addnewbuyerElement);
		return new BuyerDetails();
	}

	public static NewBuyer addnewBuyer() {
		click(buyerspagelocators.addnewbuyerElement);
		return new NewBuyer();
	}
}
