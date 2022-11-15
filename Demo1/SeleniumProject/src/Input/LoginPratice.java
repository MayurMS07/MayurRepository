package Input;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPratice {

	public static void main(String[] args) throws InterruptedException {
		// Open Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		// Open Chrome
		WebDriver driver = new ChromeDriver();
		// Maximize Window
		driver.manage().window().maximize();
		// Wait 3 Sec
		Thread.sleep(3000);
		// Open URL
		driver.get("http://www.testyou.in/Login.aspx");
		// Wait 2 Sec
		Thread.sleep(2000);
		// Locate UserName
		WebElement username = driver.findElement(By.name("ctl00$CPHContainer$txtUserLogin"));
		// type username
		username.sendKeys("MAYUR");
		// Wait 2 Sec
		Thread.sleep(2000);
		// Locate Password
		WebElement password = driver.findElement(By.id("ctl00_CPHContainer_txtPassword"));
		// type Password
		
		// Print Current URL
		System.out.println(driver.getCurrentUrl());
		
		
		password.sendKeys("Satpute");
		// Locate Login Button
		WebElement logBut = driver.findElement(By.id("ctl00_CPHContainer_btnLoginn"));
		// Click Login Button
		logBut.click();
		driver.close();
		
	}

}
