package Day3TestNG;

import org.testng.annotations.Test;

public class TestNgParameters {
	@Test(priority = 0)
	public void createAcc() {
		System.out.println("Create account");
	}

	@Test(priority = 1, dependsOnMethods = "createAcc")
	public void login() {
		System.out.println("Login");
	}

	@Test(priority = 2, invocationCount = 2, dependsOnMethods = "login")
	public void bookTicket() {
		int i = 5 / 0;
		System.out.println("Book ticket");
	}

	@Test(priority = 3, dependsOnMethods = "bookTicket", enabled = true, alwaysRun = true)
	public void logout() {
		System.out.println("Logout");
	}
}
