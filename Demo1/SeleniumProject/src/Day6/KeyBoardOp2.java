package Day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardOp2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		maximize the browser
		driver.manage().window().maximize();

//		Apply implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		it will wait for 0-30 sec for any element to load with polling frequency of 500 milliseconds

		driver.get("https://demo.automationtesting.in/Register.html");

		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));

		userName.sendKeys("SDET-QA"); // enter text into input field
		Thread.sleep(2000);

		userName.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.chord(Keys.CONTROL, "c")); // select text and copy it
		Thread.sleep(2000);

		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));

		lastName.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		Thread.sleep(2000);

		driver.close();
	}

}