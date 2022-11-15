package Praticee;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		// Create new tab
		WebDriver driver = new ChromeDriver();
		// Maximize Driver
		driver.manage().window().maximize();
		// apply implicitly Wait for sec
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// open webpage
		driver.get("https://demo.automationtesting.in/Register.html");
		// locate webelement
		WebElement DOB = driver.findElement(By.xpath("//select[@placeholder='Year']"));
		// create instance of select class
		Select s = new Select(DOB);
		// Convert to String
		String DefaultDOB = s.getFirstSelectedOption().getText();
		// Print Default String
		System.out.println(DefaultDOB);
		// Check DOB is MultiSelect OR not
		System.out.println("DOB is multiSelect OR not :" + s.isMultiple());
		// Pass Value is DOB
		s.selectByIndex(20);
		// Wait for 3 Sec
		Thread.sleep(3000);
		// Pass Value is DOB
		s.selectByValue("1950");
		// Wait for 3 Sec
		Thread.sleep(3000);
		// Pass Value is DOB
		s.selectByVisibleText("1999");
		// Wait for 3 Sec
		Thread.sleep(3000);
		// Make a list and Print avaiable list
		List <WebElement> DOBOptions = s.getOptions();
		// Print the list
		for (int i = 0; i<DOBOptions.size(); i++) {
			System.out.println(DOBOptions.get(i).getText());
		}
		System.out.println("Number of Element : "+DOBOptions.size());
		// wait for 5 sec
		Thread.sleep(5000);
		// close driver
		driver.close();

	}

}
