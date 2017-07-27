package com.madison.pages;
import com.google.inject.matcher.Matcher;

import io.vavr.API.Match.Pattern;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.ScenarioSteps;

public class RegisterPage extends PageObject {
	
	@FindBy(css="a.skip-link.skip-account span.label")
	private WebElementFacade clickOnAccount;
	
	@FindBy (css=".links>ul>li>a[title=Register]")
	private WebElementFacade clickOnRegister;
	
	
	
	public void navigationTo(String url) {
		getDriver().get(url);
	}
	
	public void clickOnAccount(){
		clickOnAccount.click();
	}
	
	public void clickOnRegister() {
		clickOnRegister.click();
	}
	
}
