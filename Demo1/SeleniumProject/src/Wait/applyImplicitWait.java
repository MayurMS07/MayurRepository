package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class applyImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Apply implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// it will wait for 0-30 sec for any element to load.
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// here open website, OrangeHRM
		WebElement username = driver.findElement(By.cssSelector("input[class = 'oxd-input oxd-input--active']"));
		//username.clear();
		username.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.cssSelector("input[type = 'password']"));
		password.clear();
		password.sendKeys("admin123");
		Thread.sleep(3000);
		WebElement logbtn = driver.findElement(By.cssSelector("button[type = 'submit']"));
		logbtn.click();
		Thread.sleep(3000);
		String afterlogbtn = driver.getPageSource();
		System.out.println(afterlogbtn);
		
	}

}
