package com.commerce.pompages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commerce.generics.Utility;

public class SearchResultsPage extends Utility {
	
	@FindBy(xpath = "//*[@class='s-item-container']/div/div/div[1]/div/div/a")
	List<WebElement> searchResults;

	public SearchResultsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnSearchResult(int index) {
		searchResults.get(index).click();;
	}
	
}
