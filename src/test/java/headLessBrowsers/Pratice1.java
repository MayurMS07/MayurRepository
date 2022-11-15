package headLessBrowsers;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class Pratice1 {
	@Test
	public void acttimeLogin() throws InterruptedException
	{
	  WebDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
	//  WebDriver driver = new HtmlUnitDriver();
	//  WebDriverManager.chromedriver().setup();
	//	WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		//driver.findElement(By.cssSelector("input[id='username']")).sendKeys(Keys.chord("admin", Keys.TAB));
		
		//driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(Keys.chord("manager", Keys.ENTER));
		
		//Thread.sleep(3000);
		
        WebElement userNameField = driver.findElement(By.id("username"));
		userNameField.sendKeys("admin");
		// Apply wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(userNameField));
		
		WebElement passwordField = driver.findElement(By.name("pwd"));
		passwordField.sendKeys("manager");
		
		WebElement loginBtn = driver.findElement(By.id("loginButton"));
		loginBtn.click();
		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.close();
		
	
	}

}