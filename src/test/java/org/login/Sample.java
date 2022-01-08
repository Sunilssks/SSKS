package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {
	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\SSKS\\eclipse-workspace\\Login\\target\\classes\\demo.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		//Sheet sheet = workbook.getSheet(SheetName);
		//Row row = sheet.getRow(rownum);
		//Cell cell = row.getCell(cellnum);
	}

}
