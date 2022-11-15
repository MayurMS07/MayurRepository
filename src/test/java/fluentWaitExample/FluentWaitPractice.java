package fluentWaitExample;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class FluentWaitPractice extends SeleniumUtility {
	WebDriver driver;

	@Test
	public void swagLab() {
		driver = setUp("chrome", "https://www.saucedemo.com/");
		typeInput(driver.findElement(By.id("user-name")), "standard_user");
		typeInput(driver.findElement(By.id("password")), "secret_sauce");
		clickOnElement(driver.findElement(By.id("login-button")));
		clickOnElement(driver.findElement(By.id("add-to-cart-sauce-labs-backpack")));
		clickOnElement(driver.findElement(By.xpath("//a[@class='shopping_cart_link']")));

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
//		It will wait for maximum of 30 seconds, and with polling frequency of 5 seconds, ignoring NoSuchElementException
//		can throw TimeoutException
		
		WebElement checkoutbtn = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("checkout1"));
			}
		});
		clickOnElement(checkoutbtn);

		typeInput(driver.findElement(By.id("first-name")), "Amit");
		typeInput(driver.findElement(By.id("last-name")), "Sharma");
		typeInput(driver.findElement(By.id("postal-code")), "123456");
		clickOnElement(driver.findElement(By.id("continue")));
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).isDisplayed());
		clickOnElement(driver.findElement(By.id("finish")));
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Pony Express']")).isDisplayed());

		clickOnElement(driver.findElement(By.id("back-to-products")));
		clickOnElement(driver.findElement(By.id("react-burger-menu-btn")));
		clickOnElement(driver.findElement(By.id("logout_sidebar_link")));
		Assert.assertTrue(driver.findElement(By.id("login-button")).isDisplayed());
		cleanUp();
	}
}