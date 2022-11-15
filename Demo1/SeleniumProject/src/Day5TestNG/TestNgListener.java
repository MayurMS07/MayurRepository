package Day5TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " starts");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " Passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " Failed");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// not implemented
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	public void onStart(ITestContext context) {
		System.out.println(context.getName() + " Suite starts");
	}

	public void onFinish(ITestContext context) {
		System.out.println(context.getName() + " Suite finishes");
	}
}