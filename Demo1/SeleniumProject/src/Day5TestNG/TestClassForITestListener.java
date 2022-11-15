package Day5TestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(testngDay5.TestNgListener.class)
public class TestClassForITestListener {
	@Test
	public void testCase1() {
		System.out.println("Test case 1");
	}

	@Test
	public void testCase2() {
		System.out.println("Test case 2");
		Assert.assertEquals(false, true);
	}

	@Test
	public void testCase3() {
		System.out.println("Test case 3");
	}

	@Test
	public void testCase4() {
		System.out.println("Test case 4");
	}

	@Test
	public void testCase5() {
		System.out.println("Test case 5");
	}
}