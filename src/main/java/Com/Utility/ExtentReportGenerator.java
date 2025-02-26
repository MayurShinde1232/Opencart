package Com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
	public static ExtentReports extent;
	public static ExtentReports getReports() {
		
		String ReportPath= "D:\\Automatio Testing\\NewOpenCart\\TestReports\\index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(ReportPath);
		reporter.config().setDocumentTitle("Automation Testing");
		reporter.config().setReportName("Opencart Registration Page");
		reporter.config().setTheme(Theme.DARK);
		
		 extent= new ExtentReports();
		extent.setSystemInfo("Project Name", "Demo Project");
		extent.setSystemInfo("ModuleName", "Registration page");
		extent.setSystemInfo("OS", "Windows11");
		extent.setSystemInfo("QA", "Mayur Shinde");
		return extent;
		
	}
	

}
