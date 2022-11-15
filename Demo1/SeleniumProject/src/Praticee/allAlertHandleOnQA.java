package Praticee;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class allAlertHandleOnQA {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[h5[text()='Alerts, Frame & Windows']]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		Thread.sleep(3000);
		// handel 1st alert
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(5000);
		String alert = driver.switchTo().alert().getText();
		System.out.println("Alert Msg is : "+alert);
		driver.switchTo().alert().accept();
		
		// handel 2nd alert
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(3000);
		String alertMSG = driver.switchTo().alert().getText();
		System.out.println("Alert Msg is : "+alertMSG);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		// handel 3rd alert
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		String alertmsg = driver.switchTo().alert().getText();
		System.out.println("Alert Msg is : "+alertmsg);
		driver.switchTo().alert().dismiss();// it will click on cancel button
		//check cancel button press or not
		boolean result = driver.findElement(By.id("confirmResult")).isDisplayed();
		System.out.println("Alert Msg is : "+result);

		// handel 4th alert
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(3000);
		// send string
		String input = "Mayur07";
		driver.switchTo().alert().sendKeys(input);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
