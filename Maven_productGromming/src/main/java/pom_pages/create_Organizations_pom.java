package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility_Methods_Product;

public class create_Organizations_pom extends Utility_Methods_Product{
	
	//Constructor
	public create_Organizations_pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//WebElement
	@FindBy(xpath = "//img[@title=\"Create Organization...\"]")
	WebElement createOrganizationsicon;
	
	@FindBy(xpath = "//a[text()='Organizations']")
	WebElement Organizations;
	
	@FindBy(xpath = "//input[@name=\"accountname\"]")
	WebElement org_name;
	
	@FindBy(xpath = "//input[@name=\"website\"]")
	WebElement website;
	
	@FindBy(xpath = "//input[@type=\"radio\" and @value=\"U\"]")
	WebElement user_radiobtn;
	
	@FindBy(xpath = "(//input[@type=\"button\"])[1]")
	WebElement save_btn;
	
	@FindBy(xpath = "//input[@id=\"phone\"]")
	WebElement mobile_no;
	
	
	
	public void Entermobile_no(String value) {
	Entervalue_In_Editfield(mobile_no, value);
	}
	
	
	//methods
	public void Click_createOrganizationsicon() {
		createOrganizationsicon.click();
	}
	
	public void Click_Organizations() {
		Organizations.click();
	}
	
	public void enter_org_name(String value) {
		Entervalue_In_Editfield(org_name, value);
		}
		
		public void enter_websitename(String value) {
			Entervalue_In_Editfield(website, value);
			}
		
		public void select_user_rdiobtn() {
			user_radiobtn.click();
			}
		
		public void click_savebtn() {
			save_btn.click();
		}

}
