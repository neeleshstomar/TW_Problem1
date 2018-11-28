package com.commerce.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commerce.generics.Utility;

public class LoginPage extends Utility {
	
	@FindBy(id = "ap_email")
	WebElement emailIdInput;

	@FindBy(xpath="//input[@id='continue']")
	WebElement continueBTN;
	
	@FindBy(id = "ap_password")
	WebElement passwordInput;

	@FindBy(id="signInSubmit")
	WebElement loginBTN;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setEmail(String emailId) {

		emailIdInput.sendKeys(emailId);
	}
	
	public void clickOnContinueBTN() {
		continueBTN.click();
	}
	
	public void setPassword(String password) {

		passwordInput.sendKeys(password);
	}
	
	public void clickOnLoginBTN() {
		loginBTN.click();
	}
	
	public void login(String emailId, String password) {
		setEmail(emailId);
		clickOnContinueBTN();
		setPassword(password);
		clickOnLoginBTN();
	}

}
