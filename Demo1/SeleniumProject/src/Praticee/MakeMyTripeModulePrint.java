package Praticee;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripeModulePrint {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		// create new tab
		WebDriver driver = new ChromeDriver();
		// maximize window
		driver.manage().window().maximize();
		// apply impilictly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// open Website
		driver.get("https://www.makemytrip.com/");
		// make list of module
		List<WebElement> module = driver.findElements(By.cssSelector("div[class='chHeaderContainer']"));
		// print module
		for(int i=0; i<module.size(); i++) {
			System.out.println("Module List Below Print");
			System.out.println(module.get(i).getText());
		}
		// wait for 3 sec
		Thread.sleep(3000);
		// close driver
		driver.close();
	}

}
