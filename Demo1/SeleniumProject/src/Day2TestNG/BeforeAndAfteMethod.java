package Day2TestNG;

//testNG supports around 9 annotations

//following is the list of annotations based on their hierarchy of execution
//1. BeforeSuite
//2. BeforeTest   --> It will execute before all the @Test
//3. BeforeClass
//4. BeforeMethod --> It will execute each time before every @Test
//5. Test
//6. AfterMethod  --> It will execute each time after every @Test
//7. AfterClass
//8. AfterTest    --> It will execute after all the @Test
//9. AfterSuite
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BeforeAndAfteMethod {
	@Test(priority = 0)
	public void bookFlightTicket() {
		System.out.println("Book flight ticket");
	}

	@Test(priority = 1)
	public void cancleFlightTicket() {
		System.out.println("Cancel flight ticket");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Open browser and launch MMT");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Close the browser");
	}

}