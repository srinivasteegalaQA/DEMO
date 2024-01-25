package ResponsiveEDGenericUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * This class provides Implementaion to all the methods in ITestListener Interface of Testing
 * @author SrinivasTeegala/SureshRajaboina
 *
 */

public class ListenersImplementaionClass implements ITestListener{
	ExtentReports report;
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		String MethodName=result.getMethod().getMethodName();
		test=report.createTest(MethodName);
		test.log(Status.INFO, "test execution Started");
	}

	public void onTestSuccess(ITestResult result) {
		String MethodName=result.getMethod().getMethodName();
		test.log(Status.PASS,"Test Script Passed"+MethodName);

	}

	public void onTestFailure(ITestResult result) {
		WebDriverUtility web = new WebDriverUtility();
//		JavaUtility jav = new JavaUtility();
		
		String MethodName=result.getMethod().getMethodName();
		test.log(Status.FAIL, "test Script Failed"+MethodName);
		test.log(Status.FAIL, result.getThrowable());
		
//		String screenshotName = MethodName+"-"+jav.getSystemDateformat();
		try
		{
//			String path = web.takescreenshot(BaseClass.sdriver, screenshotName);
			String path = web.takescreenshot(BaseClass.sdriver, "ResponsiveED");
			test.addScreenCaptureFromPath(path);
		}
		catch (Exception e) {
					
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		String MethodName=result.getMethod().getMethodName();
		test.log(Status.SKIP, "test Script is Skipped"+MethodName);
		test.log(Status.SKIP, result.getThrowable());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {
	
//		JavaUtility jav = new JavaUtility();
//		String Report =jav.getSystemDateformat();
//		ExtentSparkReporter htmlReport=new ExtentSparkReporter(".\\extndsReports\\ResponsiveEDReport-"+Report+".html");
		
		System.out.println("======Suite Execution started======");
		ExtentSparkReporter htmlReport=new ExtentSparkReporter(".\\extndsReports\\ResponsiveEDReport-"+".html");
		htmlReport.config().setDocumentTitle("ResponsiveED Execution Reports");
		htmlReport.config().setReportName("ResponsiveED Execution Report");
		htmlReport.config().setTheme(Theme.DARK);
		
	

		 report=new ExtentReports();
	       report.attachReporter(htmlReport);
	       report.setSystemInfo("Browser","Chrome");
	       report.setSystemInfo("Base OS", "Windows");
	       report.setSystemInfo("Base URL","https://lms-sis-demo.sapphirus.in/");
	       report.setSystemInfo("ReporterName : ", "SrinivasTeegala/SureshRajaboina");
	       
		
	}

	public void onFinish(ITestContext context) {
	
		System.out.println("----Suite Execution Finished----");
		report.flush();
	}

	
}
