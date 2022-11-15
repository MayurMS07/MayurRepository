package Day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

//		maximize the browser
		driver.manage().window().maximize();

//		Apply implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		it will wait for 0-30 sec for any element to load with polling frequency of 500 milliseconds

		driver.get("https://jqueryui.com/");
		Actions act = new Actions(driver);
		WebElement draggableBtn = driver.findElement(By.xpath("//a[text()='Draggable']"));
		draggableBtn.click();

//		to switch into frame
//		driver.switchTo().frame(index);  // pass the frame index
//		driver.switchTo().frame(nameOrId) // pass the frame name or id attribute
//		driver.switchTo().frame(frameElement) // locate the frame as webelement and pass it here

		driver.switchTo().frame(0);
		act.dragAndDropBy(driver.findElement(By.cssSelector("div#draggable")), 250, 150).perform();

//		once you complete the operations in frame we have to switch the control back to DefaultContent
		driver.switchTo().defaultContent();
		WebElement droppableBtn = driver.findElement(By.xpath("//a[text()='Droppable']"));
		droppableBtn.click();
	}

}