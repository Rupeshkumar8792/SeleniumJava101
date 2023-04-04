package Lambda.SeleniumJava101.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass
{
	protected static WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser_URL()
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.lambdatest.com/selenium-playground/input-form-demo");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}
