package Day4;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchListPrint {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Selenium Testing");

//		see the html hierachy of first element
//		see the html hierachy of second element

//		Identify their common parent uniquely using hierachy
//		parent>childElementtag

		List<WebElement> googleSearchList = driver
				.findElements(By.cssSelector("ul[class='G43f7e']>li>div>div>div.wM6W7d>span"));

		System.out.println("Number of elements : " + googleSearchList.size());

		for (int i = 0; i < googleSearchList.size(); i++) {
			System.out.println(googleSearchList.get(i).getText());
		}

	}
}
