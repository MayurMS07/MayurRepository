package Input;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPratice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		Thread.sleep(3000);
		WebElement logbut = driver.findElement(By.id("loginButton"));
		logbut.click();
		Thread.sleep(3000);
		driver.close();
	}

}
