package PropertyFileReading;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class VtigerLogin extends SeleniumUtility{

	@Test
	public void testcase() throws IOException {
//		1. first get the location of the property file
//		2. Create an instance of Properties class
//		3. Call the load() method of properties class and pass the file location in it
//		4. using properties class reference call the getProperty() method which will return the data from property file
		
		FileInputStream fis = new FileInputStream("./src/main/resources/StaticDataFiles/LoginData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		String appUrl = prop.getProperty("AUTUrl");
		System.out.println(appUrl);
		String userName = prop.getProperty("userName");
		System.out.println(userName);
		String password = prop.getProperty("password");
		System.out.println(password);
		System.out.println(prop.getProperty("pwd")); // returns null value if the provided key is not present in the
														// property file
		WebDriver driver = setUp(browser, appUrl);
		typeInput(driver.findElement(By.id("username")), userName);
		typeInput(driver.findElement(By.id("password")), password);
		clickOnElement(driver.findElement(By.xpath("//button[text()='Sign in']")));
		clickOnElement(driver.findElement(By.cssSelector("span[class='fa fa-user']")));
		clickOnElement(driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")));
		driver.close();
		
	}
}
