package Praticee;
// Alert Handling alert comes after 5 sec
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[h5[text()='Alerts, Frame & Windows']]")).click();

		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("timerAlertButton"));
		Thread.sleep(3000);
		
		String alertMSG = driver.switchTo().alert().getText();
		System.out.println("Alert Msg Print : "+alertMSG);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
