package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class RemoveAllCheckboxes{

WebDriver driver;
	
	public RemoveAllCheckboxes(WebDriver driver) {
		this.driver = driver;
	}
	
	  @FindBy(how = How.XPATH, using = "//*[@id=\"todos-content\"]/form/ul/li[1]/input") WebElement removeAllCheckboxdElement;
	 @FindBy(how = How.CSS, using = "input[value='Remove']") WebElement removeCheckButtonElement;
	 @FindBy(how = How.CSS, using = "input[name='allbox']")
	 WebElement toggleCheckboxdElement;
	 @FindBy(how = How.XPATH, using = "//input[@type='checkbox']") List<WebElement> checkboxList;

	 
	 public void removeSingleCheckBox() {
			int beforeDelete = checkboxList.size();
			for (int i = 0; i < checkboxList.size(); i++) {
				checkboxList.get(0).click();
				
				removeCheckButtonElement.click();
				
				int listNumbers = checkboxList.size();

				if (listNumbers < beforeDelete) {
					//toggleCheckboxdElement.click();
					System.out.println("Single checkbox is deleted");
				} 
				else {
					 
					Assert.fail("The Listitem is empty");

				}

				break;
			}

		}
		
	 

	public void removeAllCheckboxes() {

		int beforeDelete = checkboxList.size();
		for (int i = 0; i < checkboxList.size(); i++) {
			checkboxList.get(i).click();
			
			
			int listNumbers = checkboxList.size();
			
			if (listNumbers < beforeDelete) {
				
				toggleCheckboxdElement.click();
				removeCheckButtonElement.click();
				System.out.println("All checkboxes are deleted");
			} else {
				removeCheckButtonElement.click();
				Assert.fail(" The CheckBox Listitem is empty");

			}

			break;
		}

	}

	
	
		
}