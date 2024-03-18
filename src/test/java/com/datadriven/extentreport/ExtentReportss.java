package com.datadriven.extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("Report/restassured.html");
		extent.attachReporter(spark);
		
		/*ExtentHtmlReporter extent = new ExtentHtmlReporter("target/Spark.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(extent);
		*/
		
		ExtentTest test = extent.createTest("api test");
		//ExtentTest test = extent.createTest("demoo test");

		test.log(Status.INFO, "informationnn");
		
		test.log(Status.PASS, "Step passed");
		
		test.log(Status.FAIL, "Step failed");
		
		test.log(Status.INFO, "Step information");
		
		extent.flush();

}
}
