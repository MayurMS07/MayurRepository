package Day4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMenu {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

//		Load a new web page in the current browser window. This is done using an HTTP GET operation, and the method will block until the load is complete
		driver.get("https://www.amazon.in/");

		List<WebElement> amazonMenuOptions = driver.findElements(By.cssSelector("#nav-xshop>a"));

		System.out.println(amazonMenuOptions.size());

		for (int i = 0; i < amazonMenuOptions.size(); i++) {
			System.out.println(amazonMenuOptions.get(i).getText());
		}
		driver.close();
	}

}


// difference between findElement() & findElements()

// findElement() will throw NoSuchElementPresent Exception if element is not found.
// findElements() will not throw any exception if element is not found, instead it will return zero