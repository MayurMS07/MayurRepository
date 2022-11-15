package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class JavascriptExecutorPractice extends SeleniumUtility {
//	@Test
	public void testCase1() throws InterruptedException {
		WebDriver driver = setUp("chrome", "https://www.browserstack.com/users/sign_in");

//		upcast the reference of WebDriver interface to JavascriptExecutor interface
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement userName = driver.findElement(By.id("user_email_login"));
		js.executeScript("arguments[0].value='admin@xyz.com';", userName);

		js.executeScript("document.getElementById('user_password').value='Admin@123';");

//		WebElement signMeInBtn = driver.findElement(By.id("user_submit"));
//		js.executeScript("arguments[0].click();", signMeInBtn);

		js.executeScript("document.getElementById('user_submit').click();");

		js.executeScript("alert('Welcome to Selenium World')");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

//		to referesh the browser use any of the below method
		js.executeScript("history.go(0)");
//		js.executeScript("location.reload()");

		driver.close();
	}

//	@Test
	public void testCase2() {
		WebDriver driver = setUp("chrome", "https://demo.actitime.com/login.do");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('username').value='admin';");

		js.executeScript("document.getElementsByName('pwd')[0].value='manager';");

		js.executeScript("document.getElementById('keepLoggedInCheckBox').checked=true");

		System.out.println(driver.findElement(By.id("keepLoggedInCheckBox")).isSelected());

		String pageTitle = js.executeScript("return document.title;").toString();
		System.out.println("Login page title : " + pageTitle);

		js.executeScript("document.getElementById('loginButton').click()");

		Wait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement logoutBtn = (WebElement) wait
				.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("logoutLink"))));

		System.out.println("Home page title : " + js.executeScript("return document.title").toString());

		System.out.println("Domain name : " + js.executeScript("return document.domain").toString());

		System.out.println("Application URL : " + js.executeScript("return document.URL").toString());

		js.executeScript("arguments[0].click();", logoutBtn);

		js.executeScript("window.location='https://www.google.com/'");
		System.out.println("Page title : " + js.executeScript("return document.title").toString());

//		to open a new window tab
		js.executeScript("window.open()");
		driver.quit();
	}

	@Test
	public void testCase3() throws InterruptedException {
		WebDriver driver = setUp("chrome", "https://www.flipkart.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);

//		js.executeScript("window.scrollBy(0, 500)");

//		WebElement element = driver.findElement(By.xpath("//h2[text()='Top Offers']"));
//		js.executeScript("arguments[0].scrollIntoView(true);", element);
//		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
	}
}