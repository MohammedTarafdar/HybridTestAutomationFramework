package com.name.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement textEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement textPassword;
	
	@FindBy(xpath = "//input[@value='Log in']")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(linkText = "Logout")
	@CacheLookup
	WebElement btnLogout;
	
	
	public void setUserName(String uName) {
		textEmail.clear();
		textEmail.sendKeys(uName);
		
	}
	
	public void setPassword(String pwd) {
		textPassword.clear();
		textPassword.sendKeys(pwd);
	}
	
	public void clickLoginButton() {
		btnLogin.click();
	}
	
	public void clickLogoutButton() {
		btnLogout.click();
	}

}
