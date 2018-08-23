package com.pageobjects;

import org.openqa.selenium.WebDriver;

import com.setup.GenericMethods;

public class HomePage {

	
	public static String btnSkip = "//android.widget.Button[@resource-id='in.insider.consumer:id/btn_skip']";
	public static String btnGetStarted = "//android.widget.Button[@resource-id='in.insider.consumer:id/btn_finish']";
    public static String tabEvents = "//android.widget.TextView[@text='EVENTS']";
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnSkip ()  {
		
		GenericMethods.click(driver, btnSkip);
	}
	
   public void clickOnGetStarted ()  {
		
		GenericMethods.click(driver, btnGetStarted);
	}
   
   public void clickOnEventsTab ()  {
		
		GenericMethods.click(driver, tabEvents);
	}
}
