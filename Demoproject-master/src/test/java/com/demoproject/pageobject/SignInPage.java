package com.demoproject.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	
WebDriver ldriver;
	
	public SignInPage(WebDriver rdriver)
	{
		ldriver = rdriver;


		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="(//font[@face='Arial, Helvetica, sans-serif'])[2]")
	WebElement actualUsername;
	
	@FindBy(xpath="//a[normalize-space()='sign-in']")
	WebElement clickSignIn;
	
	public String getUserName()
	{
		String text = actualUsername.getText();

		return text;
	}
	
	public void clickOnSignInButton()
	{
		clickSignIn.click();
	}

	
}
