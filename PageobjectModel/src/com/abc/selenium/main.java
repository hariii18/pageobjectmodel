package com.abc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class main {
	WebDriver driver;
	By logout = By.linkText("logout");
	public main(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickonlogout()
	{
		driver.findElement(logout).click();
		
	}

}
