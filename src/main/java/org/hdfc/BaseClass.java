package org.hdfc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {


	public BaseClass() {
	}
	//1
	public static WebDriver driver;
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	//2
	public void launchUrl(String data) {
		driver.get(data);
	}
	//3
	public void enterText(WebElement element, String data) {
		element.sendKeys(data);
	}
	//4
	public void btnClick(WebElement element) {
		element.click();
	}
	//5
	public void moveToElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}
	//6
	public void enterTextByJs(String data, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('Value','"+data+"')", element);
	}
	//7
	public void dragAndDrop(WebElement element, WebElement element2) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(element, element2).perform();
	}
	//8
	public void doubleClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).perform();
	}
	//9
	public void contextClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).perform();
	}
	//10
	public void clickByJs(String data, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);	
	}
	//11
	public void returnTextByJs(String data, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return arguments[0].getAttribute('Value','"+data+"')", element);
	}
	//12
	public void scrollDownByJs(String data, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScrollIntoView(true)", element);
	}
	//13
	public void scrollUpByJs(String data, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScrollIntoView(false)", element);
	}
	//14
	public void index(WebElement element,int id) {
		Select select = new Select(element);
		select.selectByIndex(id);
	}
	//15
	public void value(WebElement element, String txtUser) {
		Select select = new Select(element);
		select.selectByValue(txtUser);
	}
	//16
	public void visibleText(WebElement element, String txtUser) {
		Select select = new Select(element);
		select.selectByVisibleText(txtUser);
	}
	//17
	public void allOptions(WebElement element, String txtUser) {
		Select select = new Select(element);
		List<WebElement>allOptions = select.getOptions();
		for (WebElement webelement : allOptions) {
			String name = webelement.getAttribute(txtUser);
			System.out.println(name);
		}
	}
	//18
	public void allSelectedOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement>allOptions = select.getAllSelectedOptions();
		for (WebElement webElement : allOptions) {
			String name = webElement.getText();
			System.out.println(name);
		}
	}
	//19
	public void firstSelectedOption(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
	}
	//20
	public void deselectByIndex(WebElement element,int id) {
		Select select = new Select(element);
		select.deselectByIndex(id);
	}
	//21
	public void deselectByValue(WebElement element, String txtUser) {
		Select select = new Select(element);
		select.deselectByValue(txtUser);
	}
	//22
	public void deselectByVisibleText(WebElement element, String txtUser) {
		Select select = new Select(element);
		select.deselectByVisibleText(txtUser);
	}
	//23
	public void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}
	//24
	public void isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean b = select.isMultiple();
		System.out.println(b);
	}
	//25
	public void frame(WebElement element) {
		driver.switchTo().frame(element);
	}
	//26
	public void frame(String id) {
		driver.switchTo().frame(id);
	}
	//27
	public void frame(int index) {
		driver.switchTo().frame(index);
	}
	//28
	public void reverseFrame() {
		driver.switchTo().defaultContent();
	}
	//29
	public void frames(String name) {
		driver.switchTo().frame("frame 1");
		driver.switchTo().frame("frame 2");
		driver.switchTo().frame("frame 3");
		driver.switchTo().frame("frame 4");
	}
	//30
	public void parentFrame() {
		driver.switchTo().parentFrame();
	}
	//31
	public void takesScreenshot() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
	}
	//32
	public void windowHandle() {
		String handle = driver.getWindowHandle();
		System.out.println(handle);
	}
	//33
	public static void WindowsHandles() {
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
	}
	//34
	public void navigateUrl(String path) {
		driver.navigate().to(path);
	}
	//35
	public void navigateForward() {
		driver.navigate().forward();
	}
	//36
	public void navigateback() {
		driver.navigate().back();
	}
	//37
	public void navigateRefresh() {
		driver.navigate().refresh();
	}
	//38
	public void sheetLocation(String path) {
		File file = new File(path);
	}
	//39
	public void objectConversion(String file) throws FileNotFoundException {
		FileInputStream stream = new FileInputStream(file);
	}
	//40
	public void createWorkbook() {
		Workbook w = new XSSFWorkbook();
	}
	//41
	public void date() {
		SimpleDateFormat dateFrmat = new SimpleDateFormat();
	}
	//42
	public void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	//43
	public void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	//44
	public void attribute(WebElement element,String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);
	}
	//45
	public void keys(WebElement element,String text) {
		Actions ac = new Actions(driver);
		ac.keyDown(element,Keys.SHIFT).sendKeys(element, text);
	}






























}




















































