package Praticee;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GSMArena {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		// Create new tab
		WebDriver driver = new ChromeDriver();
		// Maximize Driver
		driver.manage().window().maximize();
		// Open WebSite
		driver.get("https://www.gsmarena.com/");
		// Apply Implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Find Element & make a List
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"body\"]/aside/div[1]/ul"));
		// Print list
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Name of Companies");
			System.out.println(list.get(i).getText());
		}
		Thread.sleep(3000);
		driver.close();
	}
}
