package com.commerce.tests;

import org.testng.annotations.Test;

import com.commerce.generics.BaseTest;
import com.commerce.generics.Utility;
import com.commerce.pompages.HeaderPage;
import com.commerce.pompages.LoginPage;

public class Flow02 extends BaseTest {

	@Test
	public void searchItem() {

		HeaderPage hp = new HeaderPage(driver);
		hp.clickOnSignInIcon();

		LoginPage lp = new LoginPage(driver);
		lp.login(Utility.getPropertyValue("EmailID"), Utility.getPropertyValue("Password"));
		
		hp.setSearchKeyword("B00CE3FT66");
	}
}
