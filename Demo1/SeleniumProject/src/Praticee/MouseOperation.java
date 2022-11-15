package Praticee;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseOperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		username.sendKeys(Keys.TAB);
		pass.sendKeys("admin123");
		Thread.sleep(3000);
		pass.sendKeys(Keys.ENTER);
		// Login Done
		WebElement ennerBody = driver.findElement(By.xpath("//body"));
		ennerBody.sendKeys(Keys.ESCAPE);
		Thread.sleep(3000);
		ennerBody.sendKeys(Keys.ESCAPE); // google saving password
		WebElement EName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
		EName.sendKeys("Mayur Satpute");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		WebElement EId = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input"));
		action.moveToElement(EId).click();
		Thread.sleep(2000);
		EId.sendKeys("9527650");
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("// button[@type='submit']"));
		action.moveToElement(search).perform();
		Thread.sleep(3000);
		WebElement Id = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
		action.moveToElement(Id).perform();;
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		action.moveToElement(logout).perform();
		Thread.sleep(3000);
		WebElement mainpage = driver.findElement(By.xpath("//body"));
		mainpage.sendKeys(Keys.F5);
		Thread.sleep(2000);
		driver.close();
	}

}
