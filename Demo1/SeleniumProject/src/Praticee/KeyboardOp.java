package Praticee;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		// Create new tab
		WebDriver driver = new ChromeDriver();
		// maximize tab
		driver.manage().window().maximize();
		// apply implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// open URL
		driver.get("https://www.flipkart.com/");
		// close login popup
		WebElement body = driver.findElement(By.xpath("//body"));
		body.sendKeys(Keys.ESCAPE); // here close the login popup
		// wait for 3 sec
		Thread.sleep(3000);
		// close driver
		driver.close();
		

	}

}
