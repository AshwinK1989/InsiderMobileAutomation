package com.pageobjects;

import org.openqa.selenium.WebDriver;
import com.setup.GenericMethods;

public class EventPage {
	
	public static String cardEvent="//android.widget.TextView[@resource-id='in.insider.consumer:id/tv_home_event_name']";
    public static String toolBarFavorite = "//android.widget.ImageView[@resource-id='in.insider.consumer:id/iv_toolbar_favourite']";
    public static String txtSearch = "//android.widget.TextView[@resource-id='com.phonegap.rxpal:id/lblSearchMedicine']";
    public static String btnBack = "//android.widget.ImageView[@resource-id='in.insider.consumer:id/iv_toolbar_back']";
    public static String optionFavorite = "//android.widget.TextView[@resource-id='in.insider.consumer:id/menu_favourite']";
    public static String cardFavorite = "//android.widget.TextView[@resource-id='in.insider.consumer:id/tv_event_title']";
	WebDriver driver;

	public EventPage(WebDriver driver) {
		this.driver = driver;
	}
	

	
	public void selectEvent ()  {
		
		GenericMethods.click(driver, cardEvent);
	}
	
    public void favoriteEvent ()  {
		
		GenericMethods.click(driver, toolBarFavorite);
	}
 	
   
   public void clickOnBackButton ()  {
		
	   GenericMethods.click(driver, btnBack);
	 
		
	}
   
   public void clickOnFavoriteOption ()  {
		
	   GenericMethods.click(driver, optionFavorite);
		
	}
   
   public void favoriteCardPresent() {
	   
	   GenericMethods.getElement(driver, cardFavorite).isDisplayed();

   }
   
 
}
