package org.hdfc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {
	static WebDriver driver;
	@Test
	private void login(String s1,String s2) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumDay1\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("s1");
		driver.findElement(By.id("pass")).sendKeys(s2);
		driver.findElement(By.name("login")).click();

	}
	}

