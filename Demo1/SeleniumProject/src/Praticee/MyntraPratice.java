package Praticee;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraPratice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.myntra.com/shop/mds2menpage");
		Actions act = new Actions(driver);
		//find men option and click
		WebElement MenOption = driver.findElement(By.xpath("//div/a[text()='Men'][@data-group='men']"));
		act.moveToElement(MenOption).perform();
		
		// print Men List
		List<WebElement> MenList= driver.findElements(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/div/div/div")); 
		for(int i=0; i<MenList.size(); i++) {
			System.out.println(MenList.get(i).getText());
		}
		
		// find casual and click there
		MenOption = driver.findElement(By.xpath("//div/a[text()='Men'][@data-group='men']"));
		act.moveToElement(MenOption).perform();
		act.moveToElement(MenOption, 10, 92).click().perform();

		// Apply Filter
		WebElement blackfilter = driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/main/div[3]/div[1]/section/div/div[4]/ul/li[5]/label"));
		blackfilter.click();
		System.out.println("Filter Selected or Not : "+blackfilter.isSelected());
		System.out.println("**********");
		
		// Alert Handel
		//driver.switchTo().alert().dismiss();
		
		// Print Shirt List
		List<WebElement> ShirtList= driver.findElements(By.xpath("//ul[@class='results-base']"));
		for(int i = 0; i<ShirtList.size(); i++) {
			System.out.println("Shirt List : "+ShirtList.get(i).getText());
			System.out.println("**********");
		}
		
		// Select one Casual Shirt
		WebElement CasualShirt = driver.findElement(By.xpath("//img[@title='Roadster Men Black Pure Cotton Sustainable Casual Shirt']"));
		CasualShirt.click();
		
		// Print products Desc
		List <WebElement> ProDesc = driver.findElements(By.xpath("//div[@class='pdp-productDescriptorsContainer']"));
		for(int i =0; i<ProDesc.size(); i++) {
			System.out.println("Products Description : "+ProDesc.get(i).getText());
			System.out.println("**********");
		}
		driver.navigate().back();
		driver.navigate().back();
	}

}
