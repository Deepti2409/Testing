package testCases;

import java.io.File;
import java.util.Date;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Dummy {
  @Test
	public void system() {
	  
		String parentdir = System.getProperty("user.dir");
	  
	  ExtentReports reports = new ExtentReports();
	  
	   ExtentSparkReporter spark = new ExtentSparkReporter(parentdir +"\\Reports\\" );
	   
	   //System.out.println(spark);
	   spark.config().setReportName("Regression Testing");
	   spark.config().setDocumentTitle("Selenium Automation Report");
	   spark.config().setTheme(Theme.DARK);
	     reports.attachReporter(spark);
	     
	     ExtentTest test=reports.createTest("LoginTest");
	     
	     test.log(Status.INFO, "Starting login test");
	     test.log(Status.INFO, "Browser Opened");
	     test.log(Status.PASS, "Logged in successfully");
	     test.log(Status.WARNING, "Issues while logging out");
	     
	     reports.flush();
		
			
	}
	
}
