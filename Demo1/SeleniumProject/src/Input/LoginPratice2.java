package Input;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPratice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demosite.executeautomation.com/Login.html");
		WebElement username = driver.findElement(By.name("UserName"));
		username.sendKeys("Mayur");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.name("Password"));
		password.sendKeys("Satpute");
		Thread.sleep(3000);
		WebElement logbut = driver.findElement(By.name("Login"));
		logbut.click();
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
