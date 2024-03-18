package com.datadriven.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.datadriven.pages.HomePage;
import com.datadriven.pages.SigInPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	
	public static SigInPage sigin = new SigInPage();
	
	public static HomePage hmpg = new HomePage();
	
	public static Selenium_Common com = new Selenium_Common();
	
	public static ExcelRead excel = new ExcelRead();
	
	public static HashMap<String, String> map = new HashMap();
	
	public static DataFormatter dataformat = new DataFormatter();
	
	public static ExtentReports extent;
	
	//public static ExtentSparkReporter spark;
	
	
	@BeforeTest
	public void startreport()
	{
		/* extent = new ExtentReports();
		 ExtentSparkReporter spark = new ExtentSparkReporter("Report/demosite.html");
		extent.attachReporter(spark);*/
	}

	
	@BeforeMethod
	public void openApplication() throws IOException
	{
		File f = new File("C:\\neworkspace\\DataDrivenFramework_Jan\\src\\test\\java\\com\\datadriven\\config\\environment.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String application_url = prop.getProperty("URL");
		
		String browser = prop.getProperty("Browser");
		
		if(browser.equals("chrome"))
		{
			System.out.println("Inside chrome");
			WebDriverManager.chromedriver().setup();
			
			driver	 = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		
		{
			System.out.println("Inside firefox");
			WebDriverManager.firefoxdriver().setup();
			
			driver	 = new FirefoxDriver();
		}
		
		
		driver.get(application_url);
			
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}

	@AfterTest
	public void endreport()
	{
		extent.flush();
	}
	
	public String getdata(String key) throws IOException
	{
		return ExcelRead_map.getValueMap(key);
	}
	
}
