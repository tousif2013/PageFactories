package com.automation.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Bankslocator {

	
@FindBy(css="#search_box-for-bank")
public static WebElement searchbox;

@FindBy(css="#search_box")
public WebElement searchbbocxElement;


@FindBy(css="#travelx-sidebar #bank a.withoutCollapseMenu div.title")
public WebElement options;


@FindBy(css="#search_icon")
public WebElement searchiconElement;



}
