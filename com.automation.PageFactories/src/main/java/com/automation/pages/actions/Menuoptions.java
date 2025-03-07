package com.automation.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.automation.Core.Page;
import com.automation.Locators.Menuoptionslocators;

public class Menuoptions extends Page {

	public static Menuoptionslocators menuoptionslocators;

	public void Menuoptions() {

		this.menuoptionslocators = new Menuoptionslocators();

		PageFactory.initElements(driver, this.menuoptionslocators);
	}

	public static MonitoringDashbordoption monitoringDashbordoption() {

		ClickUsingJavaScript(menuoptionslocators.monitoringDashboardElement);

		return new MonitoringDashbordoption();

	}

	public static Buyers buyers() {

		ClickUsingJavaScript(menuoptionslocators.buyerssElement);

		return new Buyers();

	}

	public static Banks banks() {

		ClickUsingJavaScript(menuoptionslocators.banksElement);

		return new Banks();
	}

}