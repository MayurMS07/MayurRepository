package Selenium.Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsitePratice3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.olx.in/");
		Thread.sleep(5000);
		driver.close();
/*		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);*/
	}

}
