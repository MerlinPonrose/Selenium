package com.datadriven.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.datadriven.utility.BaseClass;

public class SignIn_Map extends BaseClass{
	
	@Test
	public void signIn() throws InterruptedException, IOException
	{
		
		ExtentTest test = extent.createTest("Sign Inn");
		
		test.log(Status.PASS, "Step passed");
		
		test.log(Status.FAIL, "Step failed");
		
		test.log(Status.INFO, "Step information");
		
		sigin.enteremail();
		
		sigin.enterpass();
		
		sigin.cicksubmit();
		
		hmpg.verifyhmepagetite();
		
		hmpg.CickAddTCart();
		
	}

}
