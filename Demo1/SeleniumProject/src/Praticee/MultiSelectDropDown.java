package Praticee;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		// Create New Tab
		WebDriver driver = new ChromeDriver();
		// Maximize Tab
		driver.manage().window().maximize();
		// Apply implicitly Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Open new WebSite
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

		WebElement options = driver.findElement(By.xpath("//select[@id='second']"));

		// options convert into Selected
		Select multiselect = new Select(options);

		// Check DropDown is MultiSelect or Not
		System.out.println("Check DropDown is MultiSelect Or Not : " + multiselect.isMultiple());

		// Options select
		// 1
		multiselect.selectByIndex(0);
		Thread.sleep(3000);
		// 2
		multiselect.selectByValue("donut");
		Thread.sleep(3000);
		// 3
		multiselect.selectByVisibleText("Burger");
		Thread.sleep(3000);

		// Validate selected options
		List<WebElement> SelectedOptions = multiselect.getAllSelectedOptions();
		for (WebElement s : SelectedOptions) {
			System.out.println(s.getText());
		}
		// Options deselect
		// 1
		multiselect.deselectByIndex(0);
		Thread.sleep(3000);
		// 2
		multiselect.deselectByValue("donut");
		Thread.sleep(3000);
		// 3
		multiselect.deselectByVisibleText("Burger");
		Thread.sleep(3000);

		driver.close();

	}

}
