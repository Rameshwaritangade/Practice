package practice_mvn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Login_class;

public class Pratice_Class 
{
	public static WebDriver driver;
	public static ChromeOptions options;
	@BeforeSuite
	public static void lunchBrowser()
	{
		WebDriverManager.chromedriver().setup();	
		options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");  
//		options.addArguments("--disable-notifications");
//		options.addArguments("--disable-gpu");
//		options.addArguments("--disable-extensions");
//		options.addArguments("--no-sandbox");
//		options.addArguments("--disable-dev-shm-usage");
		
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//		options.merge(capabilities);
		
		driver = new ChromeDriver(options);
	}
	
	@Test
	public static void openWebsite()
	{
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Login_class lg = new Login_class(driver);
		lg.login();
		
	}

}
