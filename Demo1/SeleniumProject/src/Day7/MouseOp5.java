package Day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOp5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		maximize the browser
		driver.manage().window().maximize();

//		Apply implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		it will wait for 0-30 sec for any element to load with polling frequency of 500 milliseconds

		driver.get("https://jqueryui.com/draggable/");

		Actions act = new Actions(driver);
		WebElement frame = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frame);

		WebElement sourceElement = driver.findElement(By.cssSelector("div#draggable"));
		act.dragAndDropBy(sourceElement, 350, 200).perform();

	}

}