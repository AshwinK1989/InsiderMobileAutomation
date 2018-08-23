package com.pageobjects;

import org.openqa.selenium.WebDriver;

import com.setup.GenericMethods;

public class LoginPage {

	WebDriver driver;
	public String txtEmail = "//android.widget.EditText[@resource-id='in.insider.consumer:id/et_login_email']";
	public String btnNext = "//android.widget.Button[@resource-id='in.insider.consumer:id/btn_login_next']";
	public String txtPassword = "//android.widget.EditText[@resource-id='in.insider.consumer:id/et_password_password']";
	public String btnSignIn = "//android.widget.Button[@resource-id='in.insider.consumer:id/btn_submit_password']";

	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loginIntoApp ()  {
		
		GenericMethods.input(driver, txtEmail, "ashwin.karangutkar@gmail.com");
		GenericMethods.click(driver, btnNext);
		GenericMethods.input(driver, txtPassword, "test@123");
		GenericMethods.click(driver, btnSignIn);

	}
	
  
}
