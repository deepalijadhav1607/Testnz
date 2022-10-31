package Data_Provider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Data_Provider1 {

WebDriver driver;	
@SuppressWarnings("deprecation")
@BeforeClass
public void setup() {
    System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
    @Test(dataProvider = "Logindata")
    public void LoginTest(String username,String password,String exp) {
    
    driver.get("https://admin-demo.nopcommerce.com/login");
	
}
}	
