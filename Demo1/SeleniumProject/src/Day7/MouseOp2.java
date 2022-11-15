package Day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOp2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		maximize the browser
		driver.manage().window().maximize();

//		Apply implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		it will wait for 0-30 sec for any element to load with polling frequency of 500 milliseconds

		driver.get("http://omayo.blogspot.com/");

		Actions action = new Actions(driver);

		WebElement textField1 = driver.findElement(By.cssSelector("#ta1"));
		action.moveToElement(textField1).click().sendKeys("SELENIUM-JAVA").doubleClick().keyDown(Keys.CONTROL)
				.sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);

		WebElement searchField = driver.findElement(By.xpath("//input[@name='q' and @title='search']"));
		action.moveToElement(searchField).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build()
				.perform();
		
//		build() Generates a composite action containing all actions so far, ready to be performed 
//		(and resets the internal builder state, so subsequent calls to build() will contain fresh sequences).
	}

}