package com.managers;

import org.openqa.selenium.WebDriver;
import com.pageobjects.HomePage;
import com.pageobjects.EventPage;
import com.pageobjects.LoginPage;

public class PageObjectManager {

	WebDriver driver;
	EventPage eventPage;
	LoginPage medicineDetailsPage;
	HomePage homePage;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;
	}

	public EventPage getEventPage() {

		return (eventPage == null) ? new EventPage(driver) : eventPage;
	}


	public LoginPage getMedicineDetailsPage() {

		return (medicineDetailsPage == null) ? new LoginPage(driver) : medicineDetailsPage;
	}

	public HomePage getHomePage() {

		return (homePage == null) ? new HomePage(driver) : homePage;
	}

}
