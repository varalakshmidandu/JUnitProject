package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.ToggleAllCheckboxesPage;
import util.BrowserFactory;

public class ToggleAllCheckboxesTest {

	WebDriver driver;
	
	 @Before
	public void browserLaunch() {
	driver = BrowserFactory.init();
	}
	
	@Test
	public void userShouldBeAbletoCheck()
	{
		
		ToggleAllCheckboxesPage checkboxpage = PageFactory.initElements(driver, ToggleAllCheckboxesPage.class);
        checkboxpage.checkOnToggleCheckbox();	
	   
	}
	@After
	public void browserClose() throws InterruptedException {
		
			Thread.sleep(2000);
		
		driver = BrowserFactory.tearDown();
	}
	
}