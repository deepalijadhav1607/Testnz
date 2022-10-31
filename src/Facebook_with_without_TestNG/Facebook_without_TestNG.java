package Facebook_with_without_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_without_TestNG {
	
public static void main(String[]args) {
	
	
		System.setProperty("webdriver.chrome.driver","public void Setup();");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
}
}
