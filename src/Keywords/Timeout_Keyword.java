package Keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Timeout_Keyword {

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
// Timeout Method 
	@Test(timeOut = 10000)
	public void infiniteloop() {
		
		for(;;) {
			
			System.out.println("hello");
		}
	}
	@AfterMethod
	public void Teardown() {
		driver.quit();
}
}
	


