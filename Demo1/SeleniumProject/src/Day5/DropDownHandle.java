package Day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		maximize the browser
		driver.manage().window().maximize();

//		Apply implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		it will wait for 0-30 sec for any element to load with polling frequency of 500 milliseconds

		driver.get("https://demo.automationtesting.in/Register.html");

//		locate the dropdown element & usually it will have select html
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='Skills']"));

//		create instance of select class and pass the dropdown element as an argument to select class constructor
		Select s = new Select(dropDown);

//		in order to get the default selected value or option
//		s.getFirstSelectedOption(); // it will return default selected web element
		String defaultSelectedOption = s.getFirstSelectedOption().getText();
		System.out.println(defaultSelectedOption);

//		how to check dropdown is single select or multi select
		System.out.println("Is multiselect : " + s.isMultiple());

//		s.selectByIndex(int index);
//		s.selectByValue(String value);
//		s.selectByVisibleText(String text);

		s.selectByIndex(2);
		Thread.sleep(3000);

		s.selectByValue("Java");
		Thread.sleep(3000);

		s.selectByVisibleText("Microsoft Office");
		Thread.sleep(3000);

//		In order to retrieve all the options from the dropdown
		List<WebElement> list = s.getOptions();

//		in order to check number of options present in that dropdown
		System.out.println("No of options : " + list.size());

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getText());
//		}

		for (WebElement element : list) {
			System.out.println(element.getText());
		}

//		I order to verify dropdown option are in sorted(ascending) order or not
		List<String> list1 = new ArrayList<String>();
		for (WebElement element : list) {
			list1.add(element.getText());
		}

		list1.remove(0);

		List<String> list2 = new ArrayList<String>(list1);
		Collections.sort(list2);

//		System.out.println("Options are sorted : " + (list1 == list2));

//      check if dropdown contains any specific option
		for (WebElement element : list) {
			if (element.getText().equals("Data Analytics")) {
				System.out.println("Data Analytics options is present");
			}
		}

		driver.close();

	}

}