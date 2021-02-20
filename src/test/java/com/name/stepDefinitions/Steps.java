package com.name.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.name.pageObjects.AddNewCustomerpage;
import com.name.pageObjects.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Steps extends StepsBase {
	
	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		lp = new LoginPage(driver);	    
	}

	@When("User browse URL {string}")
	public void user_browse_url(String url) {
	    driver.get(url);
	}

	@Then("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
	    lp.setUserName(email);
	    lp.setPassword(password);
	}

	@Then("User click on Login")
	public void user_click_on_login() {
	    lp.clickLoginButton();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		}
		else {
			Assert.assertEquals(title, driver.getTitle());
		}
	    
	}

	@Then("User click on log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
		Thread.sleep(3000);
	    lp.clickLogoutButton();   
	}

	@Then("close browser")
	public void close_browser() {
	    driver.quit();
	}
	
	// for add new customer


	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {
		addNewCust = new AddNewCustomerpage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", addNewCust.getPageTitle());
	}
	
	@When("User click on customers menu")
	public void user_click_on_customers_menu() throws InterruptedException {
		Thread.sleep(3000);
		addNewCust.clickOnTopManuCustomers();
	}
	
	@Then("User click on customer menu item")
	public void user_click_on_customer_menu_item() throws InterruptedException {
		Thread.sleep(2000);
		addNewCust.clickOnInnerLinkCustomers();   
	}
	
	@Then("User click on add new button")
	public void user_click_on_add_new_button() throws InterruptedException {
	    Thread.sleep(2000);
	    addNewCust.clickOnAddNewButton();
	}
	
	@Then("User can view Add New Customer page")
	public void user_can_view_add_new_customer_page() throws InterruptedException {
	    Thread.sleep(2000);
	    Assert.assertEquals("Add a new customer / nopCommerce administration", addNewCust.getPageTitle() );
	}
	
	@When("User enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
		Thread.sleep(2000);
		String email = randomeString() + "@gmail.com";
		
		addNewCust.setEmail(email);
		addNewCust.setPassword("test123");
		addNewCust.setFirstName("Jeff");
		addNewCust.setLastName("Thomus");
		addNewCust.setCustomerGender("male");
	    
	}
	@When("User click on Save button")
	public void user_click_on_save_button() throws InterruptedException {
		addNewCust.clickOnSave();
		Thread.sleep(2000);
	}
	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String msg) {
	    Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully."));
	}
	




}
