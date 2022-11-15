package Day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		maximize the browser
		driver.manage().window().maximize();

//		Apply implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		it will wait for 0-30 sec for any element to load

		driver.get("https://demo.vtiger.com/vtigercrm/index.php");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement userNameField = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#username")));
		userNameField.clear();
		userNameField.sendKeys("admin");

		WebElement passwordField = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[placeholder='Password']")));
		passwordField.clear();
		passwordField.sendKeys("Test@123");

		WebElement loginBtn = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class='button buttonBlue']")));
		loginBtn.click();

		driver.close();
	}

}

// 2. Explicit wait (Smart Wait)
// it will wait for specific element to load

// i. Create object of WebDriverWait class
//		WebDriverWait wait = new WebDriverWait(WebDriver instance, time in milli sec);

// ii. wait.until(ExpectedConditions. -----());

//	alertIsPresent()
//	elementSelectionStateToBe()
//	elementToBeClickable()
//	elementToSelected()

// WebElement webElement =wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("-------")));

// it can throw exception when element is not found

// NoSuchAlert
// NoSuchElement