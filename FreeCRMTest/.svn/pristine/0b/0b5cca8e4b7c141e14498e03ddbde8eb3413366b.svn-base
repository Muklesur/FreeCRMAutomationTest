package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//td[contains(text(),'User: SK MUKLESUR RAHAMAN')]") WebElement usernamelabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]") WebElement contactslink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]") WebElement dealslink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]") WebElement tasklink;
	
	
	//Initialize the page objects:
	
		public HomePage() {
			PageFactory.initElements(driver,this);
		}

		
		public String verifyGetTitle() {
			return driver.getTitle();
		}
		
		public boolean verifyUserName() {
			return usernamelabel.isDisplayed();
		}
		
		public ContactsPage clickOnContacts() {
			contactslink.click();
			return new ContactsPage();	
		}
		
		public DealsPage clickOnDeals() {
			dealslink.click();
			return new DealsPage();	
		}
		
		public TasksPage clickOnTasks() {
			tasklink.click();
			return new TasksPage();	
		}
		
		
		
}
