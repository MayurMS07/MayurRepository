package Day8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

//		maximize the browser
		driver.manage().window().maximize();

//		Apply implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		it will wait for 0-30 sec for any element to load with polling frequency of 500 milliseconds

		driver.get("https://demoqa.com/frames");
		Thread.sleep(5000);

		List<WebElement> frames = driver.findElements(By.xpath("//iframe"));
		System.out.println("Number of frames are : " + frames.size());

		driver.findElement(By.xpath("//span[text()='Nested Frames']")).click();
//		swithched into parent frame
		driver.switchTo().frame("frame1");
		WebElement parentText = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		System.out.println(parentText.getText());

//		switched into child frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		System.out.println(driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText());

//		switch back to parent frame
		driver.switchTo().defaultContent();
// 		Selects either the first frame on the page, or the main document when a page contains iframes.

		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		
		driver.close();
	}

}