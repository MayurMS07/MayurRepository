package Day3TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class ClassLevelAnnotation {
	@BeforeTest
	public void testCase1() {
		System.out.println("Test case 1");
	}

	public void testCase2() {
		System.out.println("Test case 2");
	}

	public void testCase3() {
		System.out.println("Test case 3");
	}

	void testCase4() {
		System.out.println("Test case 4");
	}
}