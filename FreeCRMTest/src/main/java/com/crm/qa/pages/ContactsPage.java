package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class ContactsPage extends TestBase{
	
	TestUtil testUtil;
	
	@FindBy(xpath="//td[contains(text(),'Contacts')]") WebElement contactslabel;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]") WebElement newContactLink;
	
	
	String selectDDtitle="//select[@class='select' and @name='title']";
	
	public ContactsPage() {
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifyContactLabel() {
		return contactslabel.isDisplayed();
	}
	public void selectContactsByName(String name) {
		
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
		
	}
	
	public void selectTitleDropdown() {
		testUtil.switchToFrame();
		Select sel=new Select(driver.findElement(By.xpath(selectDDtitle)));
		sel.selectByVisibleText("Mr.");
		
	}

}
