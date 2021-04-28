package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day2 {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\admin\\eclipse-workspace\\demo\\Excel\\day2.xlsx");


		FileInputStream n=new FileInputStream(file);

		Workbook w=new XSSFWorkbook(n);

		Sheet s=w.getSheet("Sheet1");

		
			Row r=s.getRow(1);
			int count = r.getPhysicalNumberOfCells();
			System.out.println(count);
			int count2 = s.getPhysicalNumberOfRows();
			System.out.println(count2);
			
			
			}


		
	}




