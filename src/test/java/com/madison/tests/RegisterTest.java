package com.madison.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.madison.steps.RegisterSteps;

@RunWith(SerenityRunner.class)
public class RegisterTest {
	
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	RegisterSteps registerSteps;
	
	String url = "http://qa3.madison.com/";
	
//	Testing register
	@Test
	public void register(){
		registerSteps.openMadisnIsland(url);
		registerSteps.clickOnAccount();
		registerSteps.clickOnRegister();
	}
	
}
