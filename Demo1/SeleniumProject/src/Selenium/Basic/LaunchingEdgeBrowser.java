package Selenium.Basic;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// for Launching Edge Browser
		System.setProperty("webdriver.edge.driver", "C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\msedgedriver.exe");
		// Create the object of Edge driver class.
		EdgeDriver driver = new EdgeDriver();
		// Maximize webpage
		driver.manage().window().maximize();
		// open any webpage
		driver.get("https://www.javatpoint.com/array-in-java");
		// Wait for 6 sec
		Thread.sleep(6000);
		// Close automatically web page
		driver.close();
	}

}
