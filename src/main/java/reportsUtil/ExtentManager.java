package reportsUtil;







import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	static ExtentReports reports;
	
	public static ExtentReports getReports()  {	
		if (reports == null) {
		 String parentdir = System.getProperty("user.dir");
			reports = new ExtentReports();
			
			Date d = new Date();
			String reportsfolder = d.toString().replaceAll(":", "-") + "\\screenshots";
			
			String screenshotfolderpath = parentdir + "\\Reports\\" + reportsfolder;
			
			System.out.println(screenshotfolderpath);
			
			String reportfolderpath = parentdir + "\\Reports\\" + d.toString().replaceAll(":", "-");
		
			File f = new File(screenshotfolderpath);
			f.mkdirs();
			
			ExtentSparkReporter spark = new ExtentSparkReporter(reportfolderpath);
			
			spark.config().setReportName("Regression Testing");
			spark.config().setDocumentTitle("Selenium Automation Testing");
			spark.config().setTheme(Theme.DARK);
			
			reports.attachReporter(spark);

		}
		return reports;
		}
	}

