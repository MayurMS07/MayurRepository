package Selenium.Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingCromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// for Lanuch chrome Browser.
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		
		// Create the object of Chrome driver class.
		ChromeDriver driver = new ChromeDriver();
		
		// it will Maximize the Browser.
		driver.manage().window().maximize();
		
		// open any web application.
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		// Get Webpage Title.
		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
		
		// Get the current Url opened in the browser.
		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);
		Thread.sleep(9000); // Sec * 1000
		
		// Close Automatic open Website
		driver.close();
	}

}
