package Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementValidations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		

//		check webelement present or not
		WebElement userInputField = driver.findElement(By.cssSelector("input[name='username']"));
		System.out.println("User Name Input Field is displayed : " + userInputField.isDisplayed());

		WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));
		System.out.println("Login is displayed : " + loginBtn.isDisplayed());

//		check webelement editable/clickable or not
		System.out.println("User Name Input Field is editable : " + userInputField.isEnabled());

		WebElement passwordField = driver.findElement(By.cssSelector("input[name='password']"));
		System.out.println("Password field is editable : " + passwordField.isEnabled());

		System.out.println("Login btn is clickable : " + loginBtn.isEnabled());
	}

}