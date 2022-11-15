package Day3TestNG;

import org.testng.annotations.Test;

public class GroupParameter {
	@Test(groups = "Smoke")
	public void smokeTestCase1() {
		System.out.println("Smoke TC1");
	}

	@Test(groups = "Smoke")
	public void smokeTestCase2() {
		System.out.println("Smoke TC2");
	}

	@Test(groups = "Regression")
	public void regressionTestCase1() {
		System.out.println("Regression TC1");
	}

	@Test(groups = "Regression")
	public void regressionTestCase2() {
		System.out.println("Regression TC2");
	}

	@Test(groups = "Sanity")
	public void sanityTestCase1() {
		System.out.println("Sanity TC1");
	}

	@Test(groups = "Sanity")
	public void sanityTestCase2() {
		System.out.println("Sanity TC2");
	}
}
