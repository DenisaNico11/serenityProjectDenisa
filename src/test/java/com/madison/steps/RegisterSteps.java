package com.madison.steps;

import com.madison.pages.RegisterPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import gherkin.formatter.model.Scenario;

public class RegisterSteps extends ScenarioSteps {
	
	RegisterPage registerPage;
	
	@Step
	public void openMadisnIsland(String url) {
		registerPage.getDriver().get(url);
	}
	
	@Step
	public void clickOnAccount(){
		registerPage.clickOnAccount();
		
	}
	
	@Step
	public void clickOnRegister() {
		registerPage.clickOnRegister();
	}
}
