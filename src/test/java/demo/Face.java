package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtmail = driver.findElement(By.id("email"));
		txtmail.sendKeys("greens");
		WebElement txtp = driver.findElement(By.id("pass"));
		txtp.sendKeys("greens@123");
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
	}

}
