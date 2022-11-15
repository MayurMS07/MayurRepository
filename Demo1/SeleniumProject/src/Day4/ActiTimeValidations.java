package Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/login.do");

		WebElement logo = driver.findElement(By.cssSelector(".atLogoImg"));
		WebElement userNameField = driver.findElement(By.name("username"));
		WebElement passwordField = driver.findElement(By.name("pwd"));
		WebElement loginBtn = driver.findElement(By.id("loginButton"));
		WebElement checkBox = driver.findElement(By.cssSelector("#keepLoggedInCheckBox"));

		System.out.println("Logo is displayed : " + logo.isDisplayed());
		System.out.println("Username is displayed : " + userNameField.isDisplayed());
		System.out.println("Password is displayed : " + passwordField.isDisplayed());
		System.out.println("LoginBtn is displayed : " + loginBtn.isDisplayed());
		System.out.println("Checkbox is displayed : " + checkBox.isDisplayed());

		System.out.println("Username is editable : " + userNameField.isEnabled());
		System.out.println("Password is editable : " + passwordField.isEnabled());
		System.out.println("LoginBtn is clickable : " + loginBtn.isEnabled());
		System.out.println("Checkbox is selected : " + checkBox.isSelected());

		checkBox.click();

		System.out.println("Checkbox is selected : " + checkBox.isSelected());

//		how to validate the position of element
		int logoXcoordinate = logo.getLocation().x;
		int logoYcoordinate = logo.getLocation().y;

		System.out.println("Logo coordinated : " + logoXcoordinate + " " + logoYcoordinate);

//		how to validate the size of element
		int logoHeight = logo.getSize().height;
		int logoWidth = logo.getSize().width;
		System.out.println("Logo dimensions : " + logoHeight + " " + logoWidth);

		driver.close();
	}

}