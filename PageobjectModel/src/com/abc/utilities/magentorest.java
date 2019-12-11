package com.abc.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.selenium.login;
import com.abc.selenium.welcome;

public class magentorest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url;
		driver.get(url);
		welcome w = new welcome(driver);
		w.clickonMyAccount();
		login l = new login(driver);
		l.enteremail();
		l.enterpassword();
		l.clickonlogin();
		main m = new main(driver);
		m.clickonlogout();
		driver.close();

	}

}
