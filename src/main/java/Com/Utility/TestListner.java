package Com.Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestListner implements ITestListener{
	
	ExtentReports extent= ExtentReportGenerator.getReports();
	ThreadLocal<ExtentTest> extenttest= new ThreadLocal<ExtentTest>();
	@Override
	public void onTestStart(ITestResult result) {
		
		Library.test = extent.createTest(result.getClass().getName()+"=="+result.getMethod().getMethodName());
		extenttest.set(Library.test);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		Library.test.log(Status.PASS, "Test case Pass");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Library.test.log(Status.PASS, "Test case Fail");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Library.test.log(Status.SKIP, "Test case Skip");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}
	
	
	

}
