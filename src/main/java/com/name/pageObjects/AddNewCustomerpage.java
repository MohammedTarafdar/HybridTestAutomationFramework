package com.name.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerpage {
	
	public WebDriver ldriver;
	public AddNewCustomerpage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	By top_manu_customers = By.xpath("(//div[@class=\"sidebar\"]/ul//span[(text()=\"Customers\")])[1]");
	By inner_link_customers = By.xpath("(//div[@class=\"sidebar\"]/ul//span[(text()=\"Customers\")])[2]");
	
	By add_new_button = By.xpath("//div[@class=\"pull-right\"]/a");
	
	By textEmail = By.id("Email");
	By textPassword = By.id("Password");
	By textFirstName = By.id("FirstName");
	By textLastName = By.id("LastName");
	By text_gender_male = By.id("Gender_Male");
	By text_genger_female = By.id("Gender_Female");
	
	By text_save = By.name("save");
	
	
	
	public String getPageTitle() {
		return ldriver.getTitle();
	}
	
	public void clickOnTopManuCustomers() {
		ldriver.findElement(top_manu_customers).click();
	}
	
	public void clickOnInnerLinkCustomers() {
		ldriver.findElement(inner_link_customers).click();
	}
	
	public void clickOnAddNewButton() {
		ldriver.findElement(add_new_button).click();
	}
	
	public void setEmail(String email) {
		ldriver.findElement(textEmail).sendKeys(email);
	}
	
	public void setPassword(String password) {
		ldriver.findElement(textPassword).sendKeys(password);
	}
	
	public void setFirstName(String firstName) {
		ldriver.findElement(textFirstName).sendKeys(firstName);
	}
	
	public void setLastName(String lastName) {
		ldriver.findElement(textLastName).sendKeys(lastName);
	}
	
	
	public void setCustomerGender(String gender) {
		
		if (gender.equals("male")) {
			ldriver.findElement(text_gender_male).click();	
		}
		else if (gender.equals("female")) {
			ldriver.findElement(text_genger_female).click();
		}
		else {
			ldriver.findElement(text_genger_female).click();
		}
	}
	
	public void setCustomerDateOfBirth() {
		
	}
	
	public void setCompanyName() {
		
	}
	
	public void setIsTaxExempt() {
		
	}
	
	
	public void setCustomerRoles() {
		
	}
	
	public void setManagerOfVendor() {
		
	}
	
	public void clickOnSave() {
		ldriver.findElement(text_save).click();
	}
	

}
