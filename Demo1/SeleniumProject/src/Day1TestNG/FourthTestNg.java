package Day1TestNG;

import org.testng.annotations.Test;

public class FourthTestNg {

	@Test(enabled = false)
	public void testCase1() {
		System.out.println("Test case 1");
	}

	@Test(enabled = true)
	public void testCase2() {
		System.out.println("Test case 2");
	}

	@Test(enabled = true)
	public void testCase3() {
		System.out.println("Test case 3");
	}
}

// I want to execute only testcase 2 & testcase 3
// deafult enabled parameter for all test cases will be true