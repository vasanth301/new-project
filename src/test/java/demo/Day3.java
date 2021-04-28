package demo;

import java.io.File;
import java.util.List;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\SeleniumDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement country = driver.findElement(By.id("countries"));
		Select s=new Select(country);
		List<WebElement> options = s.getOptions();

		File file=new File("C:\\Users\\admin\\eclipse-workspace\\demo\\Excel\\day2.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet se=w.createSheet("Sheet0");
		for (int i = 0; i < options.size(); i++) {

			WebElement element = options.get(i);
			String s1=element.getText();
			Row r=se.getRow(i);
			Cell cell=r.createCell(0);
			cell.setCellValue(s1);

		}
		FileOutputStream out=new FileOutputStream(file);
		w.write(out);












	}

}
