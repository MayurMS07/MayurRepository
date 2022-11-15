package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripNavigation {
	public static WebDriver setUp(String url) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//			launching the browser
		WebDriver driver = new ChromeDriver();

//			maximize the browser
		driver.manage().window().maximize();

		driver.get(url);
		return driver;
	}

	public static void main(String[] args) {
		WebDriver driver = MakeMyTripNavigation.setUp("https://www.makemytrip.com/");

	}

}