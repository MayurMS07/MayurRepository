package Day5TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestCase {

	@Test(retryAnalyzer = Day5TestNG.RetryAnalyzer.class)
	public void testCase1() {
		System.out.println("testCase1");
//		written to forcefully fail this test case
		Assert.assertEquals(false, true);
	}

	@Test
	public void testCase2() {
		System.out.println("testCase2");
//		written to forcefully fail this test case
		Assert.assertEquals(false, true);
	}
}