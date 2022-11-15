package headLessBrowsers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {
	@Test
	public void testCase1() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("headless");
//		WebDriver driver = new ChromeDriver(option);
		
		WebDriverManager.edgedriver().setup();
		EdgeOptions option = new EdgeOptions();
		option.addArguments("headless");
		WebDriver driver = new EdgeDriver(option);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Selenium Interview Questions");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[last()]")).click();
		driver.findElement(By.cssSelector("div#search")).isDisplayed();
//		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.close();
	}
}