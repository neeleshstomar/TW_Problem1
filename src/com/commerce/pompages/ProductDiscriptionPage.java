package com.commerce.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commerce.generics.Utility;

public class ProductDiscriptionPage extends Utility {
	
	@FindBy(id = "add-to-cart-button")
	WebElement addToCartBTN;

	public ProductDiscriptionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnAddToCartButton() {
		addToCartBTN.click();
	}

}
