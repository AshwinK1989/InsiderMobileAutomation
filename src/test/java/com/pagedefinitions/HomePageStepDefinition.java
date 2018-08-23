package com.pagedefinitions;

import com.contexts.TestContext;
import com.pageobjects.HomePage;

import cucumber.api.java.en.And;

public class HomePageStepDefinition {

	HomePage homePage;
	TestContext testContext;

	public HomePageStepDefinition(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();

	}

	@And("^Load the Home page$")
	public void loadTheHomePage() {

		homePage.clickOnSkip();
		homePage.clickOnGetStarted();
	}

	@And("^Load Group Page of Events$")
	public void loadEventsPage() {

		homePage.clickOnEventsTab();
		
	}
	
}
