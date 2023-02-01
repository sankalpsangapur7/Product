package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility_Methods_Product;

public class Createcontact_Pom extends Utility_Methods_Product {
	public Createcontact_Pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt=\"Create Contact...\"]")
	WebElement contact;
	
	@FindBy(xpath="//input[@name=\"lastname\"]")
	WebElement lastname;
	
	@FindBy(xpath="//input[@name=\"firstname\"]")
	WebElement firstname;
	
	@FindBy(xpath = "//select[@name=\"salutationtype\"]")
	WebElement namedropdown;
	
	@FindBy(xpath = "//textarea[@name=\"description\"]")
	WebElement description;
	
	@FindBy(xpath="//input[@id=\"assistant\"]")
	WebElement assistant_Textfield;
	
	@FindBy(xpath="(//input[@type=\"submit\"])[1]")
	WebElement Save;
	
	public void Save_Contact() {
		click_Element(Save);
	}
	
	@FindBy(xpath="(//input[@name=\"Delete\"])[1]")
	WebElement delete;
	
	public void Delete_contact() {
		click_Element(delete);
	}
	
	public void Assistant_Textfield(String value) {
		Entervalue_In_Editfield(assistant_Textfield, value);
	}
	
	public void descriptiontextfield(String value) {
		Entervalue_In_Editfield(description, value);
	}
	
	public void selectname_dropdown(String value) {
		Select_by_index(namedropdown, value);
	}
	public void enterfirstname(String value) {
		Entervalue_In_Editfield(firstname, value);
	}
	public void enterlastname(String value) {
		Entervalue_In_Editfield(lastname, value);
	}
	
	public void create_contacticon() {
		contact.click();
	}
}
