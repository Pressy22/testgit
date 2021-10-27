package org.maventest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Mvn {


	public static void main(String[] args) throws IOException {
		
		
		File f = new File("D:\\Selenium\\Maven\\Book1.xlsx");
		
		FileInputStream Stream = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(Stream);
		
		Sheet S =w.getSheet("Sheet1");
		
		Row row = S.getRow(0);
		
		Cell cell = row.getCell(0);
		
		String stringCellValue = cell.getStringCellValue();
		
		System.out.println(stringCellValue);

}
	
}