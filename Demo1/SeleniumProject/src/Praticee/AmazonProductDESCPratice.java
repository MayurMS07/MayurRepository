package Praticee;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonProductDESCPratice {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayur\\OneDrive\\Desktop\\Program\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement mobile = driver.findElement(By.cssSelector("div>a[data-csa-c-id='9r7h7i-sgx4ho-r1p64p-70ljjx']"));
		mobile.click();
		Thread.sleep(2000);
		WebElement MStore = driver.findElement(By.cssSelector("img[alt='5G Store']"));
		MStore.click();
		Thread.sleep(2000);
		WebElement iQoo = driver.findElement(By.cssSelector("img[alt = '1']"));
		Thread.sleep(2000);
		List <WebElement> MobileDesc = driver.findElements(By.cssSelector("ul[class = 'a-unordered-list a-vertical a-spacing-mini']>li"));
		for(int i = 0; i<MobileDesc.size(); i++) {
			System.out.println("Mobile Description "+MobileDesc.get(i).getText());
		}
		driver.close();
	}

}
