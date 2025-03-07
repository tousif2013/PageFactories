package com.automation.Core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ProcessHandle.Info;
import java.lang.System.Logger;
import java.security.DrbgParameters.Capability;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.poi.hssf.record.common.FeatFormulaErr2;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v121.layertree.model.StickyPositionConstraint;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.automation.Utilies.ExcelReader;
import com.automation.Utilies.JsonReader;
import com.automation.Utilies.ValidateMandatoryFields;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import ch.qos.logback.core.status.Status;

public class Page implements Basecore {
	private static DesiredCapabilities capabilites = new DesiredCapabilities();
	public static WebDriver driver;
	public static FileInputStream file;

	public static JsonReader js = new JsonReader();
	public static final org.slf4j.Logger log = LoggerFactory.getLogger(Page.class);
	public static final org.apache.logging.log4j.Logger alog = LogManager.getLogger("devpinoyLogger");
	public static ExtentTest test = new ExtentTest("status", "Info");

	public static ValidateMandatoryFields validatemandotry = new ValidateMandatoryFields();
	ExcelReader excelReader = new ExcelReader(
			"C:\\Users\\TousifInamdar\\OneDrive - EQUENTIA SCF TECHNOLOGIES PVT LTD\\Desktop\\Automation eclipse\\com.automation.pom\\src\\test\\resource\\Test Data\\TestData.xlsx");
	public static Formatter format = new Formatter();

	public static void beforesuite() throws IOException {

		// removed config & OR properties file now we are consuming all the variables
		// from constants class in this page factory model

		if (Constants.Browser.equals("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resource\\executables\\chromedriver.exe");
			capabilites.setCapability(CapabilityType.ENABLE_DOWNLOADS, true);
			driver = new ChromeDriver();
			driver.get(Constants.Url);
		} else if (Constants.Browser.equals("Firefox")) {
			System.setProperty("webdriver.geckodriver.driver",
					System.getProperty("user.dir") + "\\src\\test\\resource\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
			capabilites.setCapability(CapabilityType.ENABLE_DOWNLOADS, true);
		}
		driver.get(Constants.Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static boolean isDisplayed(WebElement locator) {
		try {
			scrollToElement(locator);
			locator.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static void click(WebElement locator) {
		scrollToElement(locator);
		locator.click();
	}

	public static void Type(WebElement locator, String value) {
		scrollToElement(locator);

		log.debug("locator 	With Xpath");
		locator.clear();
		locator.sendKeys(value);
		log.debug("entered into the elemetn !!");

	}

	public static void ClickUsingJavaScriptwithvalue(WebElement locator, String value) {
		scrollToElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("argument[0].click();", locator);
	}

	public static void ClickUsingJavaScript(WebElement locator) {
		scrollToElement(locator);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("argument[0].click();", locator);
	}

	public static void typeUsingJS(WebElement Locator, String Text) {
		scrollToElement(Locator);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript("arguments[0].scrollIntoView(true);", Locator);
		Locator.clear();
		js2.executeScript("arguments[0].value=arguments[1];", Locator, Text);
	}

	public static void selectOptionUsingSelectClass(WebElement Locator, String text) {
		scrollToElement(Locator);

		// WebElement we = driver.findElement(By.xpath(or.getProperty(Locator)));
		Select select = new Select(Locator);
		select.selectByValue(text);
	}

	public static void scrollToElement(WebElement locator) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", locator);

	}

	public static void aftersuite() {

		driver.quit();
	}

}
