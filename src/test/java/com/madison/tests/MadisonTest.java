package com.madison.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MadisonTest {



    Actions action;
    WebDriver driver;


    @Before
    public void sett() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\denisacojanu\\Desktop\\Proiect\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://qa3.madison.com");

    }

    @Test
    public void homePagetest() {
        Assert.assertEquals(driver.getTitle(), "Madison Island");
        Assert.assertEquals(driver.getCurrentUrl(), "http://qa3.madison.com/");

        //    WebElement logo = driver.findElement(By.className("logo"));
        //    logo.click();


        Assert.assertEquals(driver.getCurrentUrl(), "http://qa3.madison.com/");
        driver.findElement(By.className("nav-2")).click();


        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


        action.moveToElement(driver.findElement(By.className("nav-1"))).build().perform();
    }

    @Test
    public void accountPageTest() {
        Assert.assertEquals(driver.getTitle(), "Madison Island");
        Assert.assertEquals(driver.getCurrentUrl(), "http://qa3.madison.com/");
        driver.findElement(By.className("skip-account")).click();
        driver.findElement(By.className("top-link-cart")).click();
        driver.quit();
    }


    @Test
        public void languagePage() {
        Assert.assertEquals(driver.getTitle(), "Madison Island");
        Assert.assertEquals(driver.getCurrentUrl(), "http://qa3.madison.com/");
        WebElement element = driver.findElement(By.id("select-language"));
        Select oSelect = new Select(element);
        oSelect.getOptions().size();
        int a = oSelect.getOptions().size();
        System.out.println("There are " + a + " language options ");
        element.click();
    }

    @Test
        public void search(){
        Assert.assertEquals(driver.getTitle(), "Madison Island");
        Assert.assertEquals(driver.getCurrentUrl(), "http://qa3.madison.com/");
        WebElement element = driver.findElement(By.className("required-entry"));
        element.clear();
        element.sendKeys("women");
        driver.findElement(By.className("search-button")).click();
    }


    }









