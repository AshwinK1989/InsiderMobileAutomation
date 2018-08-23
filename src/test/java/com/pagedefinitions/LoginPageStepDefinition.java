package com.pagedefinitions;

import com.contexts.TestContext;
import com.pageobjects.LoginPage;

import cucumber.api.java.en.And;

public class LoginPageStepDefinition {

	LoginPage loginPage;
	TestContext testContext;

	public LoginPageStepDefinition(TestContext context) {
		testContext = context;
		loginPage = testContext.getPageObjectManager().getMedicineDetailsPage();

	}

	@And("^Login into Application$")
	public void loginIntoApp() {

		loginPage.loginIntoApp();
	}

	
}
