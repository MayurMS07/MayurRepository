package Praticee;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutLocatingLoginPerform {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.switchTo().activeElement();
		username.sendKeys("admin", Keys.TAB);
		Thread.sleep(3000);
		WebElement pass = driver.switchTo().activeElement();
		pass.sendKeys("manager", Keys.ENTER);
		
		Thread.sleep(5000);
		driver.close();
	}

}
