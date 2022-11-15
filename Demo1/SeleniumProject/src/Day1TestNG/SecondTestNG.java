package Day1TestNG;

import org.testng.annotations.Test;

public class SecondTestNG {

	@Test(priority = 1)
	public void testCase1() {
		System.out.println("Test case 1");
	}

	@Test(priority = 1)
	public void testCase2() {
		System.out.println("Test case 2");
	}

	@Test(priority = 3)
	public void testCase3() {
		System.out.println("Test case 3");
	}
}

// I want to execute these test cases in some define follow
// Testcase 2 should be executed first
// Testcase 1 should be executed
// Testcase 3 should be executed
// to achieve this we can us priority parameter
// we can assign negative to priority parameter

// if we assign same priority to two or more test cases then these test cases will be executed based alphabetical orders of their names
// by default priority of all the test cases is zero

