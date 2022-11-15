package Praticee;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts();
		driver.get("https://www.amazon.in/ref=nav_logo");
		List <WebElement> menu = driver.findElements(By.cssSelector("div[id='nav-xshop']>a"));
		for(int i = 0; i<menu.size(); i++) {
			System.out.println(menu.get(i).getText());
		}
	
	}

}
