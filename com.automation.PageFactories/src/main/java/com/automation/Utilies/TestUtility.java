package com.automation.Utilies;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import javax.lang.model.element.ExecutableElement;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.json.StaticInitializerCoercer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;

import com.automation.Core.Page;

public class TestUtility extends Page {

	public static String screenshot;
	public static String screenshotpath;

	public static void takescreenshot(WebDriver driver) throws IOException {

		DateTimeFormatter D = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_MM_SS");
		LocalDateTime ldate = LocalDateTime.now();
		String datetime = D.format(ldate);
		screenshotpath = System.getProperty("user.dir") + "\\target\\";
		screenshot = screenshotpath + "error_" + datetime + ".jpg";

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new java.io.File(screenshot));
	}

	
	@DataProvider(name="dp")
	public static Object[][] getdata(ITestContext context, ExcelReader excel) throws IOException {

		String sheet = context.getName();
		int rows = excel.getrowcount(sheet);
		int cols = excel.getcolumncount(sheet);

		Object[][] data = new Object[rows - 1][cols];

		for (int i = 0; i <= rows; i++) {
			Map<String, String> tableMap = new HashMap<>();
			for (int j = 0; j < cols; j++) {

				String key = excel.getcelldata(sheet, 0, j);
				String value = excel.getcelldata(key, rows, j);

				tableMap.put(key, value);

			}
			data[i - 1][cols] = tableMap;
		}

		return data;

	}

}
