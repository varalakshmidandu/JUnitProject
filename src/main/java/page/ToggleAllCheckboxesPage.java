package page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToggleAllCheckboxesPage {

	
WebDriver driver;
	
	public ToggleAllCheckboxesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.CSS, using = "input[name='allbox']")
	 WebElement toggleCheckboxdElement;
	@FindBy(how = How.CSS, using = "input[name='todo[0]']") List<WebElement> checkboxList;
	@FindBy(how = How.CSS, using ="div:nth-child(2) form:nth-child(1) ul:nth-child(2) li") List<WebElement> checkListBox;
	@FindBy(how = How.CSS, using ="input[value='Add']") WebElement clickAddItem;
	@FindBy(how = How.CSS, using = "input[name='data']") WebElement addCheckboxes;
	
	public void checkOnToggleCheckbox() 
{

	if(checkboxList.isEmpty())
	{
	 System.out.println(" If CheckboxList is empty so new checkboxes are added");
		addCheckboxes.sendKeys("CheckBox1");
		clickAddItem.click();
		addCheckboxes.sendKeys("CheckBox2");
		clickAddItem.click();
		addCheckboxes.sendKeys("CheckBox3");
		clickAddItem.click();
		addCheckboxes.sendKeys("CheckBox4");
		clickAddItem.click();
//		System.out.println("New checkboxes are added so Toggle checkbox is checked");
		toggleCheckboxdElement.click();
		
	for(int i=0;i<checkboxList.size();i++)	
	{
		   System.out.println("New checkboxes are added so Toggle checkbox is checked");
			Assert.assertTrue (checkboxList.get(i).isSelected());
			
			
		}
		
	}
	else
	{
		toggleCheckboxdElement.click();
		for(int i=0;i<checkboxList.size();i++)
		{
			System.out.println("All checkboxes are checked so Toggle checkbox is checked");
			Assert.assertTrue (checkboxList.get(i).isSelected());
			
		}
	
	}
	
}
}
