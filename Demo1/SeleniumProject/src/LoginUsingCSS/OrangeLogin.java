package LoginUsingCSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.cssSelector("input[name = 'username']"));
		username.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.cssSelector("input[type = 'password']"));
		password.sendKeys("admin123");
		Thread.sleep(3000);
		System.out.println("Before login : "+driver.getCurrentUrl());
		System.out.println("Before login : "+driver.getTitle());
		WebElement logbtn = driver.findElement(By.cssSelector("button[type = 'submit']"));
		logbtn.click();
		Thread.sleep(3000);
		System.out.println("After login : "+driver.getCurrentUrl());
		System.out.println("After login : "+driver.getTitle());
		driver.close();
		
	}

}
