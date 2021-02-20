package com.name.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.name.utilities.WaitHelper;

public class SearchCustomerPage {
	
	public WebDriver lDriver;
	WaitHelper waitHelper;
	
	public SearchCustomerPage(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(lDriver, this);
		waitHelper = new WaitHelper(lDriver);
		
	}

}
