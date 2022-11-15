package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		launching the browser
		WebDriver driver = new ChromeDriver();

//		maximize the browser
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		System.out.println("Length of the page title " + pageTitle.length());

//		Unique String ID of current window
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);

//		Page source code
		System.out.println(driver.getPageSource());

	}

}