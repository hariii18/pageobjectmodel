package com.abc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class welcome {
	WebDriver driver;
	By myacct = By.linkText("my Account");
	public welcome(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickonMyAccount()
	{
		driver.findElement(myacct).click();
		
	}

}
