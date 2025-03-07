package com.automation.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Buyerlocator {

	
	
	@FindBy(css="#addNewBuyer")
	public WebElement  addnewbuyerElement;
	
	@FindBy(css="=#travelx-sidebar #bank a.withoutCollapseMenu div.title")
	public WebElement buyeroptionElement;
	
	@FindBy(css="#search_box")
	public WebElement searchbuyerElement;
	@FindBy(css="#search_icon")
	public WebElement searchiconElement;
	@FindBy(xpath ="//select [@id='search_options']/option[.='%s']")
	public WebElement buyeroptionsElement; 
}
