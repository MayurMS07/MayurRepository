package Praticee;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboardop2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.clear();
		Thread.sleep(3000);
		username.sendKeys("admin");
		Thread.sleep(3000);
		// Select & copy username
		username.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.chord(Keys.CONTROL, "c"));
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		Thread.sleep(3000);
		password.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		driver.close();
	}

}
