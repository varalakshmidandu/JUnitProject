package util;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
  
	static WebDriver driver;
	static String browser = "chrome";
	
	static String url = "http://techfios.com/test/102/";

	public static WebDriver init() {

		
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
	
	public static WebDriver tearDown() {
		driver.close();
		driver.quit();
		return driver;
	}

	
	
}
