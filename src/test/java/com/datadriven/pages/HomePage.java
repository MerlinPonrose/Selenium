package com.datadriven.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class HomePage extends com.datadriven.utility.BaseClass{
	
	public static By AddTCartButtn = By.xpath("(//button[text()='Add to cart'])[1]");
	
	public void verifyhmepagetite()
	{
		
		com.verifyPageTitle("demo store");
	}
	
	public void CickAddTCart()
	{
		com.clickElement(AddTCartButtn);
	
	}

}
