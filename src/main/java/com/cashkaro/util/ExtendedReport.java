package com.cashkaro.util;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendedReport {

	public static final ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(
			new File(System.getProperty("user.dir") + "/cashKaro-Reports.html"));
	public static final ExtentReports extent = new ExtentReports();
	public static ExtentTest test;

	static {
		htmlReporter.loadXMLConfig(new File(System.getProperty("user.dir") + "/report-config.xml"));
		htmlReporter.setAppendExisting(false);
		extent.attachReporter(htmlReporter);
	}

}
