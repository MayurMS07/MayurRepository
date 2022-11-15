package headLessBrowsers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HtmlDriverClass {
// 	If we don't want to load any UI during testing then we can use the concept of headless browser
//	If we have to run the automation script on remote servers or virtual machines, there we don't need monitor the UI part
// 	To use HtmlUnitDriver we need to first add its dependency in the pom.xml file

	@Test
	public void testCase1() throws InterruptedException {
		WebDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Selenium Interview Questions");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[last()]")).click();
//		driver.findElement(By.cssSelector("div#search")).isDisplayed();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.close();
	}
}