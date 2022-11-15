package Selenium.Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsitePratice2 {

	public static void main(String[] args) throws InterruptedException {
		// Open chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		// Driver OBj
		ChromeDriver driver = new ChromeDriver();
		// Maximize driver
		driver.manage().window().maximize();
		// Open Website
		driver.get("https://www.youtube.com/");
		// wait for 5 sec
		Thread.sleep(5000);
		// close window
		driver.close();
		// Youtube Title Print
		System.out.println(driver.getTitle());
	}

}
