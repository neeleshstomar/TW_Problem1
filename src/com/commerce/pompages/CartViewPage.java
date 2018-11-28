package com.commerce.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commerce.generics.Utility;

public class CartViewPage extends Utility {
	@FindBy(name = "proceedToCheckout")
	WebElement proceedToCheckoutBTN;

	public CartViewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickProceedToChaeckoutBTN() {

		proceedToCheckoutBTN.click();
	}

}