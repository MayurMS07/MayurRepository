package Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LunchBrowser {

	public static void main(String[] args) {
//		set the system property
		System.setProperty("webdriver.chrome.driver",
				"E:\\Acceleration\\27 May\\workspace\\SeleniumPractice\\driver\\chromedriver.exe");
//		create the object of ChromeDriver class
		ChromeDriver driver = new ChromeDriver();

//		it will maximize the browser
		driver.manage().window().maximize();

//		how to open web-application {provided you have url}
//		Open amazon --> https://www.amazon.in/
		driver.get("https://www.amazon.in/");

//		get the webpage title
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

//		get the current url opened in the browser
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

//		how to close the browser
		driver.close();
	}
}
