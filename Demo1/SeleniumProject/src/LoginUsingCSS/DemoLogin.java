package LoginUsingCSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demosite.executeautomation.com/Login.html");
		WebElement username = driver.findElement(By.cssSelector("input[name = 'UserName']"));
		username.sendKeys("Mayur07");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.cssSelector("input[name = 'UserName']"));
		password.sendKeys("Satpute07");
		Thread.sleep(3000);
		WebElement logbut = driver.findElement(By.cssSelector("input[name = 'Login']"));
		logbut.click();
		Thread.sleep(6000);
		driver.close();
	
	}

}
