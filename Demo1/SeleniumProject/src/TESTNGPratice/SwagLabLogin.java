package TESTNGPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;

public class SwagLabLogin extends SeleniumUtility {
	public static WebDriver driver;
	@Test
	public void Login() {
		driver = setUp("chrome", "https://www.saucedemo.com/");
		WebElement user = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		typeInput(user, "standard_user");
		WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		typeInput(pass, "secret_sauce");
		WebElement logbtn = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
		clickOnElement(logbtn);
		driver.close();
	}
	
}
