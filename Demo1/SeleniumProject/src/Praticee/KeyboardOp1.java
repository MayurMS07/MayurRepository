package Praticee;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOp1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demosite.executeautomation.com/Login.html");
		WebElement username = driver.findElement(By.xpath("//input[@name='UserName']"));
		username.clear();
		Thread.sleep(4000);
		username.sendKeys("Mayur");
		Thread.sleep(3000);
		username.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.name("Password"));
		password.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		Thread.sleep(3000);
		WebElement logbtn = driver.findElement(By.name("Login"));
		logbtn.click();
		Thread.sleep(3000);
		driver.close();
	}

}
