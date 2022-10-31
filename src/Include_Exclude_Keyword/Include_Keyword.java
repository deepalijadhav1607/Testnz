package Include_Exclude_Keyword;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Include_Keyword {

	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		ChromeOptions options =new ChromeOptions();

		options.addArguments("--disable-notifications");
	}

	@Test(priority=3)
	public void Forgotten() {
		boolean b = driver.findElement(By.xpath("//a[contains(text(),\"Forgotten password?\")]")).isDisplayed();
		System.out.println("Forgotten Link :"+b);
	}

	@Test(priority=1)
	public void Logo() {
	boolean b1 = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]")).isDisplayed();
	System.out.println("Logo of the Facebook :" +b1);
	}
	
	@Test(priority=2)
	public void Title() {
		String FB = driver.getTitle();
		System.out.println("Title of the Page :"+FB);
	}
		@AfterMethod
		public void Teardown() {
			driver.quit();
			
		}
	}
	

