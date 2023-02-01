package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility_Methods_Product;

public class Create_Document_Pom extends Utility_Methods_Product{
	public Create_Document_Pom (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title=\"Create Document...\"]")
	WebElement Create_Document;
	
	@FindBy(xpath="//input[@name=\"notes_title\"]")
	WebElement Document_Name;
	
	@FindBy(xpath="//select[@name=\"folderid\"]")
	WebElement Folder_Name_Dropdown;
	
	@FindBy(xpath="(//input[@name=\"assigntype\"])[1]")
	WebElement Assigned_RadioButton;
	
	@FindBy(xpath="(//input[@class=\"crmbutton small save\"])[2]")
	WebElement Save_Document;
	
	@FindBy(xpath="(//input[@title=\"Delete [Alt+D]\"])[1]")
	WebElement Delete_Document;
	
	public void Create_Document() {
		click_Element(Create_Document);
	 }
	public void Document_Name(String value) {
		Entervalue_In_Editfield(Document_Name, value);
	 }
	public void Folder_Name_Dropdown(String value) {
	Select_by_index(Folder_Name_Dropdown, value);
	 }
	public void Assigned_RadioButton() {
		click_Element(Assigned_RadioButton);
		 }
	
	public void Save_Document() {
		click_Element(Save_Document);
	}
	public void Delete_Document() {
		click_Element(Delete_Document);
	}
}
