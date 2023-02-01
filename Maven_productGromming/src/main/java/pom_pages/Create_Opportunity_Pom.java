package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility_Methods_Product;

public class Create_Opportunity_Pom extends Utility_Methods_Product{
	
	public Create_Opportunity_Pom(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@href=\"index.php?module=Potentials&action=EditView&return_action=DetailView&parenttab=Sales\"])[1]")
	WebElement Create_Opportunity;
	
	@FindBy(xpath = "//input[@name=\"potentialname\"]")
	WebElement Opportunity_name;
	
	@FindBy(xpath = "//input[@id=\"related_to_display\"]")
	WebElement Relatedto_Textfield;
	
	
	@FindBy(xpath="//select[@id=\"related_to_type\"]")
	WebElement Related_To_Dropdown;
	
	@FindBy(xpath="(//input[@name=\"assigntype\"])[1]")
	WebElement User_Radiobutton;
	
	@FindBy(xpath="//input[@name=\"closingdate\"]")
	WebElement Closingdate;
	
	@FindBy(xpath="(//select[@class=\"small\"])[7]")
	WebElement Sales_stage;
	
	@FindBy(xpath="(//input[@class=\"crmbutton small save\"])[2]")
	WebElement Save_Opportunity;
	
	
	public void Create_opportunity() {
		click_Element(Create_Opportunity);
	}
	
	public void Opportunity_Name(String value) {
		Entervalue_In_Editfield(Opportunity_name, value);
	}
	
	public void Relatedto_Dropdown(String value) {
		Select_by_index(Related_To_Dropdown, value);
	}
	
	public void User_radiobutton() {
		click_Element(User_Radiobutton);
	}
	
	public void Closingdate_Textfield(String value) {
		Entervalue_In_Editfield(Closingdate, value);
	}
	
	public void SalesStage_Dropdown(String value) {
		Select_by_index(Sales_stage, value);
	}
	
	public void Save_Opportunity() {
		click_Element(Save_Opportunity);
	}
	public void related_textfield(String value) {
		Entervalue_In_Editfield(Relatedto_Textfield, value);
	}
}
