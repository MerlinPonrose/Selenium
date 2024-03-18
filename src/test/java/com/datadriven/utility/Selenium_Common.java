package com.datadriven.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;




public class Selenium_Common extends BaseClass{
	
	public void clickElement(By locator)
	{
		WebElement element = driver.findElement(locator);
		element.click();
	}
	
	public void enterValue(By locator,String text) throws IOException
	{

		
		WebElement element = driver.findElement(locator);
		element.click();
		element.clear();
		element.sendKeys(text);
	
	}
	
	public void verifyPageTitle(String expectedTitle)
	{
		String Actualtitle = driver.getTitle();
		if(Actualtitle.contains(expectedTitle))
		{
			System.out.println("Landed in correct page");
		}
		else
		{
			System.out.println("It is a diffrent page !!!");
		}
	}

}
