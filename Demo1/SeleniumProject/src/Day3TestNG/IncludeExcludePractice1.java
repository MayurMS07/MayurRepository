package Day3TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IncludeExcludePractice1 {
	@BeforeTest
	public void beforeTestCase() {
		System.out.println("Before Test 1");
	}
	@Test
	public void testCase1_1() {
		System.out.println("TC1_1");
	}

	@Test
	public void testCase2_1() {
		System.out.println("TC2_1");
	}

	@Test
	public void testCase3_1() {
		System.out.println("TC3_1");
	}

	@Test
	public void testCase4_1() {
		System.out.println("TC4_1");
	}

	@Test
	public void testCase5_1() {
		System.out.println("TC5_1");
	}
}