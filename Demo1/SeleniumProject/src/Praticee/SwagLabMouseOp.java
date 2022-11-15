package Praticee;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwagLabMouseOp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("standard_user");
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Actions action = new Actions(driver);
		action.moveToElement(username, 0, 60).click().perform();
		pass.sendKeys("secret_sauce");
		Thread.sleep(3000);
		action.moveToElement(pass, 0, 100).click().perform();
		Thread.sleep(4000);
		driver.close();
	
	}

}
