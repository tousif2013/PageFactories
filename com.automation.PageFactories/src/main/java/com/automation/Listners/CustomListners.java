package com.automation.Listners;

import org.testng.ITestListener;
import java.io.ObjectInputFilter.Status;

import org.openqa.selenium.devtools.v121.network.model.ReportStatus;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.automation.Core.Page;
import com.relevantcodes.extentreports.LogStatus;

public class CustomListners extends Page implements ITestListener {

	public void onTestStart(ITestContext context) {
		
		
		Reporter.log(context.getName() + "Test Started");

		System.out.println("Test started: " + context.getName());
	}

	@Override
	public void onTestSuccess(ITestResult testname) {

		Page.test.log(LogStatus.INFO, testname.getName().toUpperCase() + "PASSED");
		log.debug("Test passed: " + testname.getName().toUpperCase() + "PASSED");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		
		
		System.out.println("Test failed: " + result.getName());
		// Additional logging or actions can be performed here
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped: " + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test failed but within success percentage: " + result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test context started: " + context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test context finished: " + context.getName());
	}
}
