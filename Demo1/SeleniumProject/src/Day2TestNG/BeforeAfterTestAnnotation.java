package Day2TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;

// testNG supports around 9 annotations

// following is the list of annotations based on their hierarchy of execution
// 1. BeforeSuite
// 2. BeforeTest   --> It will execute before all the @Test
// 3. BeforeClass
// 4. BeforeMethod
// 5. Test
// 6. AfterMethod
// 7. AfterClass
// 8. AfterTest    --> It will execute after all the @Test
// 9. AfterSuite

public class BeforeAfterTestAnnotation extends SeleniumUtility {
	public static WebDriver driver;

	@BeforeTest
	public void lauchBrowserAndOpenUrl() {
		driver = setUp("chrome", "https://demo.actitime.com/login.do");
		System.out.println("Login page title : " + driver.getTitle());
		Assert.assertEquals("actiTIME - Login", driver.getTitle());
	}

	@Test
	public void enterUserNameAndPasswordAndClickLoginButton() throws InterruptedException {
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		Assert.assertTrue(driver.findElement(By.cssSelector("input#username")).isDisplayed());

		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		System.out.println("Home page title : " + driver.getTitle());
		Assert.assertEquals("actiTIME - Enter Time-Track", driver.getTitle(), "Home Page title validation failed");
	}

	@Test
	public void logout() throws InterruptedException {
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(5000);
		System.out.println("Login page title : " + driver.getTitle());
		Assert.assertEquals("actiTIME - Login", driver.getTitle());
	}

	@AfterTest
	public void tearDown() {
		cleanUp();
	}
}

// In testNg for test case validations we use assertions
// Assertions are of two type 
//		1. Hard Assert  2. Soft Assert

// Hard assert stops the test method execution when an assert statement fails, and subsequent assert statements will not be
// executed(validated)
// Hard asserts are the default type of assert in TestNg