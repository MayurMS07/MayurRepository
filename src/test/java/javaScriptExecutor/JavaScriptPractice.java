package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class JavaScriptPractice extends SeleniumUtility {
	WebDriver driver;

	@Test
	public void testCase1() throws InterruptedException {
		driver = setUp("chrome", "https://www.browserstack.com/users/sign_in");
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement userName = driver.findElement(By.id("user_email_login"));
//		js.executeScript("arguments[0].value='admin@xyz.com';", userName);

		js.executeScript("document.getElementById('user_email_login').click();");
		js.executeScript("document.getElementById('user_email_login').value='admin@xyz.com';");

//		WebElement password = driver.findElement(By.id("user_password"));
//		js.executeScript("arguments[0].value='admin@123';", password);

		js.executeScript("document.getElementById('user_password').value='admin12345';");

//		js.executeScript("document.getElementById('user_submit').click();");

		WebElement signInButton = driver.findElement(By.id("user_submit"));
		js.executeScript("arguments[0].click();", signInButton);

		Thread.sleep(3000);
		js.executeScript("alert('Welcome to Selenium testing');");

		driver.switchTo().alert().accept();

		js.executeScript("history.go(0)");

		System.out.println(js.executeScript("return document.title;").toString());

		System.out.println(js.executeScript("return document.domain;").toString());

		System.out.println(js.executeScript("return document.URL;").toString());
		driver.close();
	}

	@Test
	public void testCase2() throws InterruptedException {
		driver = setUp("chrome", "https://demo.actitime.com/login.do");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript(
				"document.getElementsByName('username')[0].value='admin';document.getElementsByClassName('textField pwdfield')[0].value='manager';document.getElementById('loginButton').click();");
//		js.executeScript(
//				"document.getElementsByClassName('textField pwdfield')[0].value='manager';document.getElementById('loginButton').click();");
//		js.executeScript("document.getElementById('loginButton').click();");

		Thread.sleep(2000);
		js.executeScript("location.reload();");

		Thread.sleep(2000);
		js.executeScript("history.go(0);");

		System.out.println(js.executeScript("return document.title;").toString());

		System.out.println(js.executeScript("return document.URL;").toString());

		js.executeScript("window.location='https://www.google.com/'");

		driver.close();
	}

	@Test
	public void testCase3() throws InterruptedException {
		driver = setUp("edge", "https://www.flipkart.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);

//		js.executeScript("window.scrollBy(0,3000)");

		WebElement element = driver.findElement(By.xpath("//h2[text()='Top Offers']"));

		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}
}