package Day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWaits {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		maximize the browser
		driver.manage().window().maximize();

//		Apply implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		it will wait for 0-30 sec for any element to load

		driver.get("https://demo.vtiger.com/vtigercrm/index.php");

		Thread.sleep(3000);
		WebElement userNameField = driver.findElement(By.cssSelector("input#username"));
		userNameField.clear();
		userNameField.sendKeys("admin");

		Thread.sleep(3000);
		WebElement passwordField = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		passwordField.clear();
		passwordField.sendKeys("Test@123");

		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class='button buttonBlue']")).click();

		driver.quit();

	}

}

// NoSuchElement exception

// Synchronization 
// 1. Implicit wait
// 2. Explicit wait
// 3. Fluent wait


//1. Implicit wait
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);