package April.may;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;




public class ExtentReport {
	
	public static void main(String[] args) {
		
		ExtentReports report = new ExtentReports();	
	    String filepath = System.getProperty("user.dir")+"\\Report\\ExtentReport+report.html";
		File file = new File(filepath);
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(file);
		report.attachReporter(sparkReport);
		ExtentTest TestOne = report.createTest("Test one");
		TestOne.pass("Test is passed");
		report.flush();
	}

}
