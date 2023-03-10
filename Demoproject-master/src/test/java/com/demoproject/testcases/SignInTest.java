package com.demoproject.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.demoproject.pageobject.SignInPage;

public class SignInTest extends RegistrationTest{

	@Test
	public void signIn()
	{   
		
		SignInPage sg=new SignInPage(driver);
		String actualUsername = sg.getUserName();


		if(actualUsername.equals("Dear Dweep Bhowmick,"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			
			Assert.assertTrue(false);

		}
		sg.clickOnSignInButton();
		
	}
}
