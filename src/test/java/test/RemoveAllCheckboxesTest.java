package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveAllCheckboxes;
import util.BrowserFactory;

public class RemoveAllCheckboxesTest {

	
	WebDriver driver;
	@Before
	public void browserLaunch()
	{
		driver = BrowserFactory.init();
	}
	
	@Test
	public void userShouldBeAbletoRemoveSingleCheckboxes() {
		
		RemoveAllCheckboxes removeCheckboxpage = PageFactory.initElements(driver, RemoveAllCheckboxes.class);
        removeCheckboxpage.removeSingleCheckBox();
	    
    }
	@Test
	public void userShouldBeAbletoRemoveAllCheckboxes() {
		
		RemoveAllCheckboxes removeAllCheckboxpage = PageFactory.initElements(driver, RemoveAllCheckboxes.class);
         removeAllCheckboxpage.removeAllCheckboxes();

	    
    }
	
	@After
	public void browserClos() throws InterruptedException {
		Thread.sleep(2000);
		driver = BrowserFactory.tearDown();
	}
}
