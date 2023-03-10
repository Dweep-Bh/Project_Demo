package com.demoproject.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	
	WebDriver ldriver;
	
	public RegistrationPage(WebDriver rdriver)
	{
		ldriver = rdriver;


		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//a[text()='REGISTER']")
	WebElement Registerbutton;
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement phnno;
	
	@FindBy(xpath="//input[@id='userName']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='address1']")
	WebElement address;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement state;
	
	@FindBy(xpath="//input[@name='postalCode']")
	WebElement postcode;
	
	@FindBy(xpath="//select[@name='country']")
	WebElement country;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='confirmPassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement submitButton;
	
	
 
	public void clickOnRegisterButton()
	{
		Registerbutton.click();;
	}
	public void enterfirstname(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void enterlastname(String lname)
	{
		lastname.sendKeys(lname);
	}
	
	public void enterphnnumber(String phno)
	{
		phnno.sendKeys(phno);
	}
	public void enterEmailId(String emailid)
	{
		email.sendKeys(emailid);
	}
	public void enterAddress(String add)
	{
		address.sendKeys(add);
	}
	
	public void enterCityName(String cname) {
		city.sendKeys(cname);
		
	}
	
	public void enterStateName(String statename) {
		state.sendKeys(statename);
		
	}
	
	public void enterPostalCode(String postcodename)
	{
		postcode.sendKeys(postcodename);
	}
	public void selectCountry(String text)
	{
		Select obj = new Select(country);
		obj.selectByVisibleText(text);
	}
	
	public void enterUserName(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void enterPassword(String passw)
	{
		password.sendKeys(passw);
	}
	
	public void confirmPassword(String cnpassw)
	{
		confirmPassword.sendKeys(cnpassw);
	}
	
	public void clickOnSubmitButton()
	{
		submitButton.click();
	}
	
	
	
	
	
	
}
