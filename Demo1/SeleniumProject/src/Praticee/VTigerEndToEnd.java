package Praticee;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VTigerEndToEnd {

	public static void main(String [] Mayur) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);// Create Act obj
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.clear();
		user.sendKeys("admin");
		Thread.sleep(3000);
		
		/*WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.clear();
		pass.sendKeys("");
		Thread.sleep(3000);*/
		
		WebElement logbtn = driver.findElement(By.xpath("//button[@class='button buttonBlue']"));
		logbtn.click();
		Thread.sleep(3000);
		
		WebElement burgerMenu = driver.findElement(By.xpath("//div[@data-app-class='fa-dashboard']"));
		burgerMenu.click();
		
		WebElement Marketing = driver.findElement(By.xpath("//span[text()=' MARKETING']"));
		act.moveToElement(Marketing).click().perform();
		
		WebElement Leads = driver.findElement(By.xpath(" //span[text()=' Leads']"));
		act.moveToElement(Leads).click().perform();
		
		WebElement AddBtn = driver.findElement(By.xpath("//button[@id='Leads_listView_basicAction_LBL_ADD_RECORD']"));
		AddBtn.click();
		Thread.sleep(3000);
		
		// driver.findElement(By.xpath("id=\"select2-result-label-21\"")).click();
		// Ms. Not Selected
		
		WebElement Name = driver.findElement(By.xpath("// input[@id='Leads_editView_fieldName_firstname']"));
		Name.sendKeys("Mayur");
		
		WebElement Surname = driver.findElement(By.xpath("//input[@id='Leads_editView_fieldName_lastname']"));
		Surname.sendKeys("Satpute");
		
		WebElement Company = driver.findElement(By.xpath("//input[@id='Leads_editView_fieldName_company']"));
		Company.sendKeys("MS");
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='Leads_editView_fieldName_email']"));
		Email.sendKeys("Mayur07@gmail.com");
		
		WebElement SaveBtn = driver.findElement(By.xpath("//button[text()='Save']"));
		SaveBtn.click();
		
		WebElement AllOpn = driver.findElement(By.xpath("//p[@title='All']"));
		AllOpn.click();
		Thread.sleep(2000);
		
		WebElement CheckBox = driver.findElement(By.xpath("//input [@class='listViewEntriesCheckBox']"));
		CheckBox.click();
		System.out.println("Check Box is selected Or Not : "+CheckBox.isSelected());
		Thread.sleep(2000);
		
		WebElement deleteBtn = driver.findElement(By.xpath("//button[@id='Leads_listView_massAction_LBL_DELETE']"));
		deleteBtn.click();
		Thread.sleep(2000);
		
		WebElement deleteConfirm = driver.findElement(By.xpath("//button[@data-bb-handler='confirm']"));
		deleteConfirm.click();
		
		WebElement ID = driver.findElement(By.xpath("//span[@class='fa fa-user']"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(ID));
		ID.click();
		Thread.sleep(2000);
		
		WebElement SignOut = driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"));
		Thread.sleep(2000);
		
		WebElement body = driver.findElement(By.xpath("//body"));
		body.sendKeys(Keys.F5);
		
		driver.close();
	}
}
