package com.madison.tests;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.madison.pages.Constants;
import com.madison.steps.NewsLetterSteps;


@RunWith(SerenityRunner.class)
public class NewsLetterTest {
	
	//private static final String URL = null;

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public NewsLetterSteps newsLetterSteps;
	
	String invalidEmailAddress ="denis@atest.yu";
//	String expectedMessage = "Thank you for your subscription.";
//	String failedExpectedMessage = "There was a problem with the subscription: This email address is already assigned to another user."; 
	
	
	
//	@Test
//	public void navigateToUrl() { 
//		
//		newsLetterSteps.openMadisnIsland(Constants.URL);
//		newsLetterSteps.clickOnNewsletter();
//		newsLetterSteps.enterEmail(Constants.EMAIL);
//		newsLetterSteps.clickOnSubscribe();   //new email address*/
//		newsLetterSteps.checkSubscriptionMessage() ;  
//		
//	}
	
	@Test
	public void checkSubscriptionWithInvalidEmailAddress() {
		newsLetterSteps.openMadisnIsland(Constants.BASE_URL);
		newsLetterSteps.clickOnNewsletter();
		newsLetterSteps.enterEmail(Constants.INVALID_EMAIL);
		newsLetterSteps.clickOnSubscribe(); 
		newsLetterSteps.checkInvalidEmailSubscriptionMessage();
	}
	
	@Test
	public void checkSubscriptionWithUsedEmailAddress() {
		newsLetterSteps.openMadisnIsland(Constants.BASE_URL);
		newsLetterSteps.clickOnNewsletter();
		newsLetterSteps.enterEmail(Constants.SUBSCRIBED_EMAIL);
		newsLetterSteps.clickOnSubscribe(); 
		newsLetterSteps.checkUsedEmailSubscriptionMessage();
	}
	
	@Test
	public void checkSubscriptionWithNewEmailAddress() {
		newsLetterSteps.openMadisnIsland(Constants.BASE_URL);
		newsLetterSteps.clickOnNewsletter();
		String email = "denisa.test" + UUID.randomUUID().toString() + "@test.com";
		newsLetterSteps.enterEmail(email);
		newsLetterSteps.clickOnSubscribe(); 
		newsLetterSteps.checkSuccessfullSubscriptionMessage();
	}
//	@Pending
//	@Test
//	public void emailAddressAlreadyIntroduced() {
//		newsLetterSteps.openMadisnIsland(url);
//		newsLetterSteps.clickOnNewsletter();
//		newsLetterSteps.enterEmail(email);
//		newsLetterSteps.clickOnSubscribe();  //email address already introduced 
//		newsLetterSteps.checkFailedSubscriptionMessage(failedExpectedMessage);
//}
	
	
	}	

