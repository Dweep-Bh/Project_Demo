package com.demoproject.testcases;


import org.testng.annotations.Test;



import com.demoproject.pageobject.RegistrationPage;


public class RegistrationTest extends BaseClass {
	
	@Test
	public void registration()
	{
		
		RegistrationPage pg=new RegistrationPage(driver);
		
		pg.clickOnRegisterButton();
		pg.enterfirstname("Dweep");
		pg.enterlastname("Bhowmick");
		pg.enterphnnumber("8981652396");
		pg.enterEmailId("abc@gmail.com");
		pg.enterAddress("32/A saltlake sector v");
		pg.enterCityName("Ichapur");
		pg.enterStateName("WB");
		pg.enterPostalCode("7659565");
		pg.selectCountry("INDIA");
		pg.enterUserName("Dweepi-B");
		pg.enterPassword("123456");
		pg.confirmPassword("123456");
		pg.clickOnSubmitButton();
		
		
		
	}

	

}
