package Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class applyExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// Now Apply Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement usernamefiled = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[class = 'oxd-input oxd-input--active']")));
		
		usernamefiled.clear();
		usernamefiled.sendKeys("Admin");
	}

}
