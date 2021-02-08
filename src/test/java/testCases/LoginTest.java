package testCases;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


import reportsUtil.ExtentManager;

public class LoginTest {
	ExtentTest test;
	  ExtentReports reports;
	
	
	@BeforeMethod
	public void init()  {
		       reports=ExtentManager.getReports();
				test=reports.createTest("LoginTest");

	}
	@AfterMethod
	public void quit() {
		reports.flush(); //to generate the report
	}
	
	@Test
	public void logintestCase() {
		test.log(Status.INFO, "Starting Login Test");
		test.log(Status.INFO, "Browser Opened");
		test.log(Status.PASS, "Logged in Successfully");
		test.log(Status.WARNING, "Issue while logging out");
		
		 
	}

}
