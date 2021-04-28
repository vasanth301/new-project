package org.java;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {
	static WebDriver driver;
	@BeforeClass
	public static void BeforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumDay1\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}


	@Before
	public  void BeforeMethod() {
		Date date=new Date();
		System.out.println(date);
	}
	@After
	public void AfterMethod() {
		Date date=new Date();
		System.out.println(date);

	}
	@Test
	public void Test1() {
		WebElement txt1 = driver.findElement(By.id("username"));
		txt1.sendKeys("greeens");
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("greens@123");
		WebElement btnlogin = driver.findElement(By.className("login_button"));
		btnlogin.click();
	}
	@AfterClass
	public static void Quit() {
		driver.quit();
	}



}
