package Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

//		Load a new web page in the current browser window. This is done using an HTTP GET operation, and the method will block until the load is complete
		driver.get("https://www.amazon.in/");

//		click on the books menu
		driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_books']")).click();

		Thread.sleep(3000);

//		how to refresh the web page (Refresh the current page)
		driver.navigate().refresh();

//		it will navigate back (Move back a single "item" in the browser's history)
		driver.navigate().back();
		Thread.sleep(3000);

//		Move a single "item" forward in the browser's history. Does nothing if we are on the latest page viewed.
		driver.navigate().forward();
		Thread.sleep(3000);

//		Load a new web page in the current browser window. This is done using an HTTP GET operation, and the method will block until the load is complete.
		driver.navigate().to("https://www.flipkart.com/");
//		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
//		Thread.sleep(3000);

		driver.close();

	}

}