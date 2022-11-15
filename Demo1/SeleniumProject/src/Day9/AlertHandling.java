package Day9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

//		maximize the browser
		driver.manage().window().maximize();

//		Apply implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		it will wait for 0-30 sec for any element to load with polling frequency of 500 milliseconds

		driver.get("https://demoqa.com/");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, Keys.PAGE_DOWN));

		driver.findElement(By.xpath("//div[h5[text()='Alerts, Frame & Windows']]")).click();

		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(5000);

//		read alert message
		String alertMsg = driver.switchTo().alert().getText();
		System.out.println("Alert message is  : " + alertMsg);

//		accept the alert 
		driver.switchTo().alert().accept();
		Thread.sleep(5000);

		driver.findElement(By.id("timerAlertButton")).click(); // alert will pop-up after 5 seconds

		Wait<WebDriver> wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());

//		read 5 sec delayed alert message
		System.out.println("Wait alert message : " + driver.switchTo().alert().getText());

//		accept 5 second delayed alert using WebDriverWait
		driver.switchTo().alert().accept();

//		dismiss alert
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss(); // it will click on cancel button in the alert
		boolean flag = driver.findElement(By.xpath("//span[text()='Cancel']")).isDisplayed();
		System.out.println("Is cancel message displayed : " + flag);

//		sending message to alert
		driver.findElement(By.id("promtButton")).click();

		String inputString = "SeleniumSDETJava";
		driver.switchTo().alert().sendKeys(inputString);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		System.out.println("Input string alert : "
				+ driver.findElement(By.xpath("//span[text()='" + inputString + "']")).isDisplayed());
		
		System.out.println("//span[text()='" + inputString + "']");
		driver.close();

	}

}