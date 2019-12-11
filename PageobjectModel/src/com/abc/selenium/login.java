package com.abc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	WebDriver driver;
	By email = By.id("email");
	By pass = By.id("pass");
	By login = By.id("send2");
	public login(WebDriver driver)
	{
		this.driver = driver;
	}
	public void enteremail()
	{
driver.findElement(email).sendKeys("mzaidurahman@gmai.com");
}
public void enterpassword()
{
	driver.findElement(pass).sendKeys("welcome123");
}
public void clickonlogin()
{
	driver.findElement(login).click();
}
}
