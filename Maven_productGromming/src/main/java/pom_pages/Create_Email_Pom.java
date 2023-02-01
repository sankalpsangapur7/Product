package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility_Methods_Product;

public class Create_Email_Pom extends Utility_Methods_Product{
	public Create_Email_Pom (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class=\"importBox\"]")
	WebElement Search_Textfield;
	
	@FindBy(xpath="//select[@id=\"search_field\"]")
	WebElement Subject;
	
	@FindBy(xpath="//input[@name=\"selectall\"]")
	WebElement Selectall;
	
	@FindBy(xpath="//input[@value=\" Delete\"]")
	WebElement Delete;
	
	public void Search_Textfield(String value) {
		Entervalue_In_Editfield(Search_Textfield, value);
	}
	
	public void Subject_Dropdown(String value) {
		Select_by_index(Subject, value);
	}
	
	public void Selectall_Checkbox( ) {
		click_Element(Selectall);
	}
	
	public void Delete_icon( ) {
		click_Element(Delete);
	}
}
