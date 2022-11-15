package LoginUsingCSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		WebElement Username = driver.findElement(By.cssSelector("#user-name"));
		Username.sendKeys("Mayur");
		Thread.sleep(3000);
		WebElement Password = driver.findElement(By.cssSelector("input[type = 'password']"));
		Password.sendKeys("Satpute");
		Thread.sleep(3000);
		WebElement logbut = driver.findElement(By.cssSelector("input[class = 'submit-button btn_action']"));
		logbut.click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
