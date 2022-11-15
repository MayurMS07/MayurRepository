package TESTNGPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;

public class OrangeHRMLogin extends SeleniumUtility {
	public static WebDriver driver;
	@Test
	public void login() {
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement user = driver.findElement(By.name("username"));
		clickOnElement(user);
		typeInput(user, "Admin");
		WebElement pass = driver.findElement(By.name("password"));
		typeInput(pass, "admin123");
		WebElement logbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		clickOnElement(logbtn);
		cleanUp();
	}
}
