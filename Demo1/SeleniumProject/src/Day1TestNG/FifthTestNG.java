package Day1TestNG;

import org.testng.annotations.Test;

public class FifthTestNG {

	@Test(timeOut = 200)
	public void testCase1() throws InterruptedException {
		System.out.println("Test case 1");
		Thread.sleep(250);
	}

	@Test
	public void testCase2() {
		System.out.println("Test case 2");
	}

	@Test
	public void testCase3() {
		System.out.println("Test case 3");
	}
}

// (timeOut = 200 milliseconds)
