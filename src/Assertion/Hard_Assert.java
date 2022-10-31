package Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Hard_Assert {
WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void LoginTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
	}
	
	@Test(priority = 1)
	public void Username() {
		WebElement username = driver.findElement(By.xpath("//input[@id=\"userid\"]"));
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));

		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("GP8097");
		
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys("gms@0110");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
	     // Assertfalse		
		//	Assert.asserttrue(Username.isDisplayed());
		//	Username.sendKeys("GP8097");
			
		//	Thread.sleep(2000);
		//	Assert.assertFalse(Paswword.isDisplayed());
		//	Paswword.sendKeys("gms@0110");
		//	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			
	//	AssertEquals
		}
		
		    @Test (priority =2)
			public void Kitelogin() {			
			boolean b = driver.findElement(By.xpath("//h2[contains(text(),'Login to Kite')]")).isDisplayed();
			Assert.assertTrue(b);
			Assert.assertEquals(b, true);  //passed  //failed
		}
		@AfterMethod
		public void Teardown() {
			
			driver.quit();
		}
	

	}

