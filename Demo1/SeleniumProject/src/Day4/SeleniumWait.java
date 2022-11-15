package Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		maximize the browser
		driver.manage().window().maximize();

//		Apply implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		it will wait for 0-30 sec for any element to load --> it will try to poll element every 500 milli second

		driver.get("https://demo.vtiger.com/vtigercrm/index.php");

		WebElement userNameField = driver.findElement(By.cssSelector("input#username"));
		userNameField.clear();
		userNameField.sendKeys("admin");

		WebElement passwordField = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		passwordField.clear();
		passwordField.sendKeys("Test@123");

		driver.findElement(By.cssSelector("button[class='button buttonBlue']")).click();

		driver.close();
	}

}