package Day1;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"E:\\Acceleration\\27 May\\workspace\\SeleniumPractice\\driver\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();

//		it will maximize the browser
		driver.manage().window().maximize();

//		how to open web-application {provided you have url}
//		Open amazon --> https://www.amazon.in/
		driver.get("https://www.amazon.in/");

//		get the webpage title
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

//		get the current url opened in the browser
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Thread.sleep(5000); // milli seconds --> 5000 = 5sec

//		how to close the browser
		driver.close();
	}

}