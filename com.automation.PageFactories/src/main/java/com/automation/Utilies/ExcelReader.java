package com.automation.Utilies;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;

public class ExcelReader {

	public static String filepath;

	public static FileInputStream fi;
	public static XSSFWorkbook excel;

	public static XSSFSheet sheet;

	public ExcelReader(String filepath) {
		this.filepath=filepath;
	}
	
	public static int getrowcount(String context) throws IOException {
		fi = new FileInputStream(filepath);

		try {
			excel = new XSSFWorkbook(fi);
		} catch (IOException e) {
			System.out.println("please check the file path");
			e.printStackTrace();
		}
		try {
			sheet = excel.getSheet(context);
		} catch (Exception e) {
			System.out.println("sheet does not exists");
		}

		int lastrow = sheet.getPhysicalNumberOfRows();
		return lastrow;

	}

	public static int getcolumncount(String context) {

		Sheet sheet = excel.getSheet(context);
		Row row = sheet.getRow(0);
		int lastcolumn = row.getPhysicalNumberOfCells();
		return lastcolumn;

	}

	public static String getcelldata(String context, int row, int col) {

		Sheet sheet = excel.getSheet(context);
		Row rows = sheet.getRow(row);
		Cell cell = rows.getCell(col);
		return cell.getStringCellValue().toString();

	}

	public static Map<String, String> getRowData(String context, int row) {

		Map<String, String> hashMap = new HashMap<>();

		Sheet sheet = excel.getSheet(context);
		if (sheet == null) {
			throw new IllegalArgumentException("Sheet not found: " + context);
		}

		Row rowHeader = sheet.getRow(0);
		Row dataRow = sheet.getRow(row);

		if (rowHeader == null || dataRow == null) {
			throw new IllegalArgumentException("Row not found: " + row);
		}

		int cells = rowHeader.getPhysicalNumberOfCells();

		for (int cell = 0; cell < cells; cell++) {
			Cell headerCell = rowHeader.getCell(cell);
			Cell cellValue = dataRow.getCell(cell);

			if (headerCell != null) {
				String header = headerCell.getStringCellValue();
				String value = getcelldata(context, row, cell); 
				hashMap.put(header, value);
			}
		}
		return hashMap;
	}

}
