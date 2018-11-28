package com.commerce.tests;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.commerce.generics.BaseTest;
import com.commerce.generics.Utility;
import com.commerce.pompages.CartViewPage;
import com.commerce.pompages.HeaderPage;
import com.commerce.pompages.LoginPage;
import com.commerce.pompages.ProductDiscriptionPage;
import com.commerce.pompages.SearchResultsPage;

public class Flow01 extends BaseTest{
	
	@Test
	public void searchItem() {
		
		HeaderPage hp = new HeaderPage(driver);
		hp.setSearchKeyword("B00CE3FT66");
		
		SearchResultsPage srp = new SearchResultsPage(driver);
		srp.clickOnSearchResult(0);
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    
	    ProductDiscriptionPage pdp = new ProductDiscriptionPage(driver);
	    pdp.clickOnAddToCartButton();
	    
	    hp.clickOnCart();
	    
	    CartViewPage cvp = new CartViewPage(driver);
	    cvp.clickProceedToChaeckoutBTN();
	    
	    LoginPage lp = new LoginPage(driver);
	    
	    lp.login(Utility.getPropertyValue("EmailID"), Utility.getPropertyValue("Password"));
	    
	}

}
