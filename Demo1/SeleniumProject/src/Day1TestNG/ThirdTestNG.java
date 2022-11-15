package Day1TestNG;

import org.testng.annotations.Test;

public class ThirdTestNG {

	@Test(priority = 1, description = "Registration script")
	public void testCase1() {
		System.out.println("Test case 1");
	}

	@Test(priority = 2, description = "Login script")
	public void testCase2() {
		System.out.println("Test case 2");
	}

	@Test(priority = 3, description = "Logout script")
	public void testCase3() {
		System.out.println("Test case 3");
	}
}

// description parameter is used to give some description for the test case

