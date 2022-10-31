package Facebook_with_without_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_with_TestNG {

	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
}

