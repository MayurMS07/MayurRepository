package Day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerPractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();// download required browser exe file add set it to system property
		WebDriver driver = new ChromeDriver();
		driver.close();

		WebDriverManager.edgedriver().setup();
		WebDriver driver1 = new EdgeDriver();
		driver.close();
	}

}