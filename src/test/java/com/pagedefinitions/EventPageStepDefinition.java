package com.pagedefinitions;

import com.pageobjects.EventPage;
import com.setup.MobileSetup;
import com.contexts.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class EventPageStepDefinition extends MobileSetup {

	EventPage eventPage;
	TestContext testContext;

	public EventPageStepDefinition(TestContext context) {
		testContext = context;
		eventPage = testContext.getPageObjectManager().getEventPage();

	}


	@And("^Select the Event$")
	public void selectTheEvent() {

		eventPage.selectEvent();
	}


	@And("^Favorite the Event$")
	public void favoriteTheEvent() {

		eventPage.favoriteEvent();
	}
	
	@Then("^Check whether the Event is selected as favorite$")
	public void checkEventSelectedAsFavorite() {

		eventPage.clickOnBackButton();
		eventPage.clickOnFavoriteOption();
		eventPage.favoriteCardPresent();
	}
	
	
	
}
