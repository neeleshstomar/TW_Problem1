package com.commerce.pompages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commerce.generics.Utility;

public class HeaderPage extends Utility {

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy(id="nav-cart")
	WebElement cartIcon;
	
	@FindBy(id="nav-link-yourAccount")
	WebElement signInIcon;

	public HeaderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setSearchKeyword(String searchKeyword) {

		searchBox.sendKeys(searchKeyword);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	public void clickOnCart() {
		cartIcon.click();
	}
	
	public void clickOnSignInIcon() {
		signInIcon.click();
	}

}
