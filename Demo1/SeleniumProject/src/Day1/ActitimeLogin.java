package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Acceleration\\27 May\\workspace\\SeleniumPractice\\driver\\chromedriver.exe");
//		launching the browser
		WebDriver driver = new ChromeDriver();

//		maximize the browser
		driver.manage().window().maximize();

//		open the Actitime application
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("Login Page title matched : " + driver.getTitle().equals("actiTIME - Login"));

//		locating the username field
		WebElement userNameField = driver.findElement(By.name("username"));

		Thread.sleep(3000);
//		Enter user name in the username field
		userNameField.sendKeys("admin");

//		locating the password field
		WebElement passwordField = driver.findElement(By.name("pwd"));

		Thread.sleep(3000);
//		Enter the password in the password field
		passwordField.sendKeys("manager");

//		locating the login button
		WebElement loginBtn = driver.findElement(By.id("loginButton"));

		Thread.sleep(3000);
//		click on the login button
		loginBtn.click();

		Thread.sleep(5000);

		System.out.println("Home Page title matched : " + driver.getTitle().equals("actiTIME - Enter Time-Track"));

		Thread.sleep(3000);
//		close the browser
		driver.close();
	}

}