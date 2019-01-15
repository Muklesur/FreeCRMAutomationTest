package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory or Object Repository
	
	@FindBy(name="username") WebElement username;
	
	@FindBy(name="password") WebElement password;
	
	@FindBy(xpath="//input[@type='submit']") WebElement loginBtn;
	
	@FindBy (xpath="//font[text()='Sign Up']") WebElement signUpBtn;

	@FindBy(xpath="//img[contains(@class,'img-responsive') and @alt='free crm logo']") WebElement logo;
	
	
	//Initialize the page objects:
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}

	public String validateLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	public boolean validateCRMLogo() {
		
		return logo.isDisplayed();
	}
	
	public HomePage login(String un,String pwd) {
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}


	}
