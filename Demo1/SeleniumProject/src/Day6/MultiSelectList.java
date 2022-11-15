package Day6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		maximize the browser
		driver.manage().window().maximize();

//		Apply implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		it will wait for 0-30 sec for any element to load with polling frequency of 500 milliseconds

		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

//		locate the drop down element
		WebElement dropDown = driver.findElement(By.cssSelector("select#second"));

//		create instance of Select class
		Select multiSelect = new Select(dropDown);

//		validate the list is multiselect or not
		System.out.println("List  or dropdown is multiselect or not : " + multiSelect.isMultiple());

//		to select the options from the multiselect list / dropdown methods are

		multiSelect.selectByIndex(1);
		Thread.sleep(2000);

		multiSelect.selectByValue("burger");
		Thread.sleep(2000);

		multiSelect.selectByVisibleText("Bonda");
		Thread.sleep(2000);

//		To validate the selected options
		List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
		System.out.println("Selected Options");
		for (WebElement element : selectedOptions) {
			System.out.println(element.getText());
		}

//		to deselect any option
//		multiSelect.deselectAll(); 
		multiSelect.deselectByIndex(1);
		multiSelect.deselectByValue("burger");
		multiSelect.deselectByVisibleText("Bonda");

		Thread.sleep(2000);
		driver.close();
	}

}