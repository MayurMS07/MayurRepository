package Day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiveElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

//		maximize the browser
		driver.manage().window().maximize();

//		Apply implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		it will wait for 0-30 sec for any element to load with polling frequency of 500 milliseconds
//		InvalidArgumentException: invalid argument: value must be a non-negative integer

		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
//		it will wait for 0-50 for page to load before throwing exception 
//		InvalidArgumentException: invalid argument: value must be a non-negative integer
//		If the timeout is negative, page loads can be indefinite.

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

//		switch to active element
		WebElement userName = driver.switchTo().activeElement();
		userName.sendKeys("Admin", Keys.TAB);

		driver.switchTo().activeElement().sendKeys("admin123", Keys.ENTER);

		driver.close();

	}

}

// Perform login operation on actitime without using any locator