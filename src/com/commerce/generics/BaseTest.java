package com.commerce.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class BaseTest implements IAutoConstant{
	public WebDriver driver;

	static {
		System.setProperty(CHROME_KEY, CHROME_PATH);
	}

	@BeforeTest
	public void openApplication() {

		driver = new ChromeDriver();
		String url = Utility.getPropertyValue("URL");
		driver.get(url);
		
		String ITO = Utility.getPropertyValue("ITO");

		driver.manage().timeouts().implicitlyWait(Long.parseLong(ITO), TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	}

	@AfterTest
	public void closeApplication() {
		driver.quit();

	}

}
