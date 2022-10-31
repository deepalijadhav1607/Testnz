package Data_Provider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

	WebDriver driver;
	//@BeforeClass
	@SuppressWarnings("deprecation")
	@Test(dataProvider = "Logintest")
	public void LoginTest(String Username,String Password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	  driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(Username);
	
      driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Password);
	
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
	Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),\"Paul Collings\")]")).isDisplayed());
	
	Thread.sleep(2000);
	
	driver.quit();
	}
	
	@DataProvider(name = "Logintest")
	public Object[][]logindata(){
		
		Object[][]data = new Object[4][2];
		
		//Correct Username & Password
		
		data[0][0] = "Admin";
		data[0][1] = "admin123"	;
				
		//Correct Username & Wrong password
				
		data[1][0] = "Admin";
		data[1][1] = "admin122";
		
		//Correct Username & Wrong password
		
		data[2][0] = "Admin";
		data[2][1]= "admin122";
	
		//Correct Username & Wrong password
				
		data[3][0] = "Admin";
		data[3][1] = "admin122";
		
		
		
		
		return data;
		
		
		
		
	}
	
	
}
