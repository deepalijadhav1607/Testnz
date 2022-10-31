package Cross_Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
WebDriver driver;
	@SuppressWarnings("deprecation")
	@Parameters("Browsername")
	@Test
	public void Login(String Browsername) throws InterruptedException {
		
		if(Browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(Browsername.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(3000);

		String ExpectedName = "Paul Collings";
		
		String ActualName = driver.findElement(By.xpath("//p[contains(text(),'Paul Collings')]")).getText();
		
		if(ActualName.equals(ExpectedName)) {
			System.out.println("Passed");
		}
		else {
			
			System.out.println("Failed");
		}
		
		driver.quit();
	}
}