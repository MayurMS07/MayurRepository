package Day3TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IncludeExcludePractice2 {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method 2");
	}

	@Test
	public void testCase1_2() {
		System.out.println("TC1_2");
	}

	@Test
	public void testCase2_2() {
		System.out.println("TC2_2");
	}

	@Test
	public void testCase3_2() {
		System.out.println("TC3_2");
	}

	@Test
	public void testCase4_2() {
		System.out.println("TC4_2");
	}

	@Test
	public void testCase5_2() {
		System.out.println("TC5_2");
	}
}