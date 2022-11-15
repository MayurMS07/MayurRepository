package Day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetriveDataFromDOM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		maximize the browser
		driver.manage().window().maximize();

//		Apply implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		it will wait for 0-30 sec for any element to load

		driver.get("https://www.agoda.com/deals?pcs=1&cid=1907165&hl=en-us");

		WebElement hotelAndHome = driver.findElement(By.cssSelector("span[data-selenium='header-hotels-links-text']"));
		System.out.println("Hotal & Home Inner text : " + hotelAndHome.getText());

		String appartment = driver.findElement(By.cssSelector("span[data-selenium='header-apartments-links-text']"))
				.getText();
		System.out.println("Appartment Inner Text : " + appartment);

		WebElement createAccBtn = driver.findElement(By.cssSelector("#sign-up-btn"));
		System.out.println("Create acc btn ID : " + createAccBtn.getAttribute("id"));
		System.out.println("Create acc btn data-popup : " + createAccBtn.getAttribute("data-popup"));

		System.out.println("Create acc btn Tag name : " + createAccBtn.getTagName());

	}

}

// getTitle()
// getCurrentUrl()
// getPageSource()

// getText()  // it will get inner text --> text present between html tags
// getAttribute("attribute_name")
// getTagName()
