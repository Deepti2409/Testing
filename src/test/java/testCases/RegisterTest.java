package testCases;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


import reportsUtil.ExtentManager;

public class RegisterTest  {
	ExtentReports reports;
	ExtentTest test;
	ExtentSparkReporter spark;
	
	@BeforeMethod
	public void init()  {
        
		reports=ExtentManager.getReports();
		test = reports.createTest("RegisterTest");
	}
	@AfterMethod
	public  void quit() {
		
		reports.flush();
	}
	
	@Test
	public void registertestCase() {
		
		
		 
		 
		 test.log(Status.INFO, "Starting Register Test");
		 test.log(Status.INFO, "Browser Opened");
		 test.log(Status.PASS, "Registered successfully");
		 
		 
		
		
		
			
	}
}
