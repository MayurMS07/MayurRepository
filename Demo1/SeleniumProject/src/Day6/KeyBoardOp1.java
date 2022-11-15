package Day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardOp1 {

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

		body.sendKeys(Keys.F5); // refresh the page
		Thread.sleep(3000);

		body.sendKeys(Keys.chord(Keys.CONTROL, Keys.END)); // scroll till last
		Thread.sleep(3000);

		body.sendKeys(Keys.chord(Keys.CONTROL, Keys.HOME)); // scroll up
		Thread.sleep(3000);

		driver.close();
	}

}