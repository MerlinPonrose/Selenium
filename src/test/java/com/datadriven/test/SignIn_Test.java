package com.datadriven.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.datadriven.utility.BaseClass;
import com.datadriven.utility.ExcelRead;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignIn_Test extends BaseClass{

	/*
	@Test(dataProvider="getdata")
	public void signIn(String email, String password) throws InterruptedException, IOException
	{
	sigin.enteremail(email);
	
	sigin.enterpass(password);
	
	sigin.cicksubmit();
	
	hmpg.verifyhmepagetite();
	
	hmpg.CickAddTCart();
	
	}
*/
	
	@DataProvider
	public Object[][] getdata() throws IOException
	{
	return ExcelRead.excelread();
	}
}
