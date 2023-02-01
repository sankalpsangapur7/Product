package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility_Methods_Product;

public class Delete_Organization_Pom extends Utility_Methods_Product{
	
	//Constructor
	public Delete_Organization_Pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//WebElement
	@FindBy(xpath = "//input[@name=\"selectall\"]")
	WebElement orginizationcheckbox;
	
	@FindBy(xpath = "(//input[@value=\"Delete\"])[1]")
	WebElement delete_btn;
	
	
	//methods
	public void selectall_Org_checkbox() {
		orginizationcheckbox.click();
		}
	
	public void selectdelete_btn() {
		delete_btn.click();
		}
	

}
