package org.java;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	static WebDriver driver;
	@BeforeClass
	public static void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumDay1\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Before
	public void before() {
		Date date=new Date();	
		System.out.println(date);
	}
	@After
	public void after() {
		Date date=new Date();
		System.out.println(date);

	}

	@AfterClass
	public static void afterclass() {
		driver.quit();
	}

	@Test
	public void test1() throws InterruptedException {
		Thread.sleep(2000);
		WebElement k = driver.findElement(By.id("email"));
		k.sendKeys("hdhjhh");
		String attribute = k.getAttribute("value");
		boolean c = attribute.equals(k);
		Assert.assertEquals("verifying username", "hdhjhh", "attribute`");

		WebElement j = driver.findElement(By.id("pass"));
		j.sendKeys("hasdfhj");
		Assert.assertEquals("verify password", "pass","hasdfhj");
		WebElement h = driver.findElement(By.name("login"));
		h.click();
		String title = driver.getTitle();  
		boolean b = title.contains("login");
		Assert.assertTrue("verify  title", b);

	}

}
