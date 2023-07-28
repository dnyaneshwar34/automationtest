package uioj;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import technical.technical1.Testbase;

public class LIsten extends Testbase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	logger.info("testsuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("test fails");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("test skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	

}
