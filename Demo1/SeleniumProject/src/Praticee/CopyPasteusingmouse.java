package Praticee;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPasteusingmouse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		Actions action = new Actions(driver);
		WebElement firsttextbox = driver.findElement(By.xpath("//textarea[@id='ta1']"));
		firsttextbox.sendKeys("MayurSatpute");
		action.moveToElement(firsttextbox).doubleClick().perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform(); // copy text
		WebElement secondtextbox = driver.findElement(By.className("gsc-input"));
		action.moveToElement(secondtextbox).click().perform();;
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();// paste text
		driver.close();
	}

}
