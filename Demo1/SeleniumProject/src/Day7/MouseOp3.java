package Day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOp3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		maximize the browser
		driver.manage().window().maximize();

//		Apply implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		it will wait for 0-30 sec for any element to load with polling frequency of 500 milliseconds

		driver.get("https://www.flipkart.com/");
		WebElement body = driver.findElement(By.xpath("//body"));
		body.sendKeys(Keys.ESCAPE); // to close the login pop-up
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[img[@alt='Mobiles']]")).click();
		Thread.sleep(3000);

//		In order to perform mouse operation we have to use Actions class
//		create object of Actions class
		Actions action = new Actions(driver);

//		Identify or locate the webelement on which mouse action is to performed
		WebElement flipKartOption = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));

//		mouse hover operation
		action.moveToElement(flipKartOption).perform();
		Thread.sleep(3000);

		action.moveToElement(flipKartOption, 130, 0).perform(); // move by provided offset from given element

		action.moveByOffset(470, -50).perform();

	}

}