package Day9;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

//		maximize the browser
		driver.manage().window().maximize();

//		Apply implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		it will wait for 0-30 sec for any element to load with polling frequency of 500 milliseconds

		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		Thread.sleep(5000);

		System.out.println("Home page title : " + driver.getTitle());
		String homeWindID = driver.getWindowHandle(); // it returns current window id
		System.out.println("Home window handle : " + homeWindID);

		driver.findElement(By.xpath("//button[@name='newbrowserwindow123']")).click(); // it opens now window

		// get window handles of all the windows
		Set<String> set = driver.getWindowHandles();
		System.out.println("All window handles : " + set);

		set.remove(homeWindID); // removing the home window handle
		String newWindowHandle = set.iterator().next();

//		how to switch into new window
		driver.switchTo().window(newWindowHandle); // control moves out of home window and swtich into new window

		driver.manage().window().maximize();
		System.out.println("Current window title is " + driver.getTitle());
		driver.close();

//		Again switch back the control to home window
		driver.switchTo().window(homeWindID);

		driver.findElement(By.cssSelector("button[name='newbrowsertab453']")).click();
		Set<String> set1 = driver.getWindowHandles();
		set1.remove(homeWindID);
		String anotherWindowHandle = set1.iterator().next();

//		switch the control to the new window
		driver.switchTo().window(anotherWindowHandle);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, Keys.END));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, Keys.HOME));
		Thread.sleep(2000);
		driver.quit();
	}

}