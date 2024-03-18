package com.datadriven.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.datadriven.utility.BaseClass;



public class SigInPage extends BaseClass{
	
	public static By Email = By.id("Email");
	
	public static By Pass = By.id("Password");
	
	public static By Submit = By.xpath("(//button[@type='submit'])[2]");
	
	
	public void enteremail() throws InterruptedException, IOException
	{
			com.enterValue(Email, getdata("username"));
			Thread.sleep(2000);
	}
	
	public void enterpass() throws IOException
	{
		com.enterValue(Pass, getdata("password"));
	}
	
	public void cicksubmit()
	{
		com.clickElement(Submit);
	}
	

}
