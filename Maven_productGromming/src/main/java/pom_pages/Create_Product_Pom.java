package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility_Methods_Product;

public class Create_Product_Pom extends Utility_Methods_Product{
	public Create_Product_Pom (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title=\"Create Product...\"]")
	WebElement Create_Product;
	
	@FindBy(xpath="//input[@name=\"productname\"]")
	WebElement Product_Name;
	
	@FindBy(xpath="//input[@name=\"vendor_name\"]")
	WebElement Vendor_Name;
	
	@FindBy(xpath="//input[@id=\"vendor_part_no\"]")
	WebElement Vendor_Part_No;
	
	@FindBy(xpath="//input[@name=\"productcode\"]")
	WebElement Part_No;
	
	@FindBy(xpath="//input[@id=\"serial_no\"]")
	WebElement Serial_No;
	
	@FindBy(xpath="(//input[@class=\"crmbutton small save\"])[2]")
	WebElement Save_Product;
	
	@FindBy(xpath="(//input[@title=\"Delete [Alt+D]\"])[1]")
	WebElement Delete_Product;
	
	public void Create_Product() {
		click_Element(Create_Product);
	}
	
	public void Product_Name(String value) {
		Entervalue_In_Editfield(Product_Name, value);
	}
	
	public void Vendor_Name(String value) {
		Entervalue_In_Editfield(Vendor_Name, value);
	}
	
	public void Part_No(String value) {
		Entervalue_In_Editfield(Part_No, value);
	}
	 
	public void Vendor_Part_No(String value) {
		Entervalue_In_Editfield(Vendor_Part_No, value);
	}
	
	public void Serial_No(String value) {
		Entervalue_In_Editfield(Serial_No, value);
	}
	
	public void Save_Product() {
		click_Element(Save_Product);
	}
	
	public void Delete_Product() {
		click_Element(Delete_Product);
	}
}	
