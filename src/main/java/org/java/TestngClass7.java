package org.java;


import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngClass7 {
	WebDriver driver;
	@BeforeClass
	private void beforeclass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\SeleniumDay1\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}
	@AfterClass
	private void afterclass() {
		Date date=new Date();
		System.out.println(date);
	}
	@Test
	private void test1() {
		driver.findElement(By.id("username")).sendKeys("vasanth");
		driver.findElement(By.name("password")).sendKeys("vasanth@123");
		driver.findElement(By.className("login_button")).click();
	}
	@BeforeMethod
	private void beforemethod() {
		System.out.println("beforemethod");
	}
	@AfterMethod
	private void aftermethod() {
		System.out.println("aftermethod");
	}


}
