package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportUtils {
	
	public static ExtentSparkReporter spark;
	public static ExtentReports extent;
	public static ExtentTest log;
	
	public static ExtentReports initReport() {
		String time = String.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyy hh.mm.ss a")));
		
		spark = new ExtentSparkReporter("target/AutomationReport_" + time + ".html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		
		spark.config().setDocumentTitle("Internet Herokuapp Automation Report");
		spark.config().setReportName("Automation Report");
		spark.config().setTheme(Theme.DARK);
		
		return extent;
		
	}
	
	public static void generatereport() {
		extent.flush();
	}
	
	public static void creatTest(String methodName) {
		log = extent.createTest(methodName);
	}
		

}
