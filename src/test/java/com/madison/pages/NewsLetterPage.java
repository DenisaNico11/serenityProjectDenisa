package com.madison.pages;
import org.junit.Assert;

import com.google.inject.matcher.Matcher;

import io.vavr.API.Match.Pattern;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.steps.ScenarioSteps;


@DefaultUrl("http://www.qa3.madison.ro")
public class NewsLetterPage extends PageObject {
	
	@FindBy(css="input#newsletter.input-text.required-entry.validate-email")
	private WebElementFacade clickOnNewsletter;
	
	@FindBy(css="#newsletter")
	private WebElementFacade enteredEmail;
	
	@FindBy(css=".actions [type=\"submit\"]")
	private WebElementFacade clickOnSubscribe;
	
	@FindBy(css=".success-msg>ul>li>span")
	private WebElementFacade subscriptionSuccessMsg;
	
	@FindBy(css=".error-msg") 
	private WebElementFacade subscriptionFailMsg;
	
	@FindBy(css=".messages span")
	private WebElementFacade responseMessage; 
		
	public void navigationTo(String url) {
		getDriver().get(url);
	}
	
	public void clickOnNewsletter() {
	//	clickOnNewsletter.click();
	}
	
	public void enterEmail(String email) {
		enteredEmail.sendKeys(email); 
	}
	
	public void clickOnSubscribe() {
		clickOnSubscribe.click();
	}
	
	/*public void checkSubscriptionSuccessfulMessage(String expectedMessage){
		WebElementFacade message = subscriptionSuccessfulMessage;
		Assert.assertTrue("Erorr", message.containsText(expectedMessage));
		
	}
	
	public void checkSubscriptionFailedMessage(String expectedFailedMessage) {
		WebElementFacade message = subscriptionFailed;
		Assert.assertTrue("Erorr", message.containsText(expectedFailedMessage));
	}
	*/
	
	/*public void checkSubscriptionMessage(){
		String inputEmail = enteredEmail.getText();
		if(inputEmail.equals(Constants.EMAIL)) {
			Assert.assertTrue("Erorr", subscriptionFailMsg.containsText(Constants.FAIL_MESSAGE));
			System.out.println("Failed");
		} else {
			Assert.assertTrue("Erorr", subscriptionSuccessMsg.containsText(Constants.PASS_MESSAGE));
			System.out.println("Passed");
		}
	}*/
	
	public String getResponseMessage(){
		return responseMessage.getText();
	}
}




