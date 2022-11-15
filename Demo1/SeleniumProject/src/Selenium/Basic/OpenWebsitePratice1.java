package Selenium.Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsitePratice1 {

	public static void main(String[] args) throws InterruptedException {
		// Open Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		// Create obj chrome
		ChromeDriver driver = new ChromeDriver();
		// maximize window
		driver.manage().window().maximize();
		// Open Website
		driver.get("https://in.tradingview.com/chart/ElHfO2kS/?symbol=NSE%3ABANKNIFTY");
		// Wait for 5 sec
		Thread.sleep(5000);
		// Print Current Page URL & Store URL
		String PageURL = driver.getCurrentUrl();
		System.out.println(PageURL);		
		// close driver
		driver.close();
		
	}

}
