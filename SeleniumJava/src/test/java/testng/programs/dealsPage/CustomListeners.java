package testng.programs.dealsPage;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.xml.XmlSuite;


public class CustomListeners extends TestListenerAdapter  implements ITestListener,IReporter{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTeststart"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("test is passed successfully"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}
	@Override
	   public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
	      String outputDirectory) {
	      
	      //Iterate over every suite assigned for execution
	      for (ISuite suite : suites) {
	            
	         String suiteName = suite.getName();
	         Map<String, ISuiteResult> suiteResults = suite.getResults();
	         for (ISuiteResult sr : suiteResults.values()) {
	            ITestContext tc = sr.getTestContext();
	            System.out.println("Passed tests for suite '" + suiteName +
	               "' is:" + tc.getPassedTests().getAllResults().size());
	            System.out.println("Failed tests for suite '" + suiteName +
	               "' is:" + tc.getFailedTests().getAllResults().size());
	            System.out.println("Skipped tests for suite '" + suiteName +
	               "' is:" + tc.getSkippedTests().getAllResults().size());
	         }
	      }
	   }
	

}
