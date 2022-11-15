package Selenium.Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsitesPratice {

	public static void main (String [] args) throws InterruptedException {
		// Open Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		// Create the chrome obj
		ChromeDriver driver = new ChromeDriver();
		// Maximize Chrome window
		driver.manage().window().maximize();
		// Open web site
		driver.get("https://customer.onebroadband.in/Customer/Default.aspx");
		// Wait for 5 Sec
		Thread.sleep(5000);
		// Close the Web page
		driver.close();
	
	}
}
