package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility_Methods_Product;

public class Create_More_Pom extends Utility_Methods_Product{
public Create_More_Pom (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@name=\"Service Contracts\"]")
	WebElement Service_Contracts;
	
	@FindBy(xpath="//a[@name=\"Purchase Order\"]")
	WebElement Purchase_Order;
	
	@FindBy(xpath="//input[@name=\"search_text\"]")
	WebElement Search_Bar;
	
	@FindBy(xpath="(//select[@name=\"search_field\"])[1]")
	WebElement In_Dropdown;
	
	@FindBy(xpath="//input[@name=\"submit\"]")
	WebElement Search;
	
	public void Service_Contracts() {
		click_Element(Service_Contracts);
	}
	
	public void Purchase_Order() {
		click_Element(Purchase_Order);
	}
	
	public void Search_Bar_textfield(String value) {
		Entervalue_In_Editfield(Search_Bar, value);
	}
	public void In_Dropdown(String value) {
		Entervalue_In_Editfield(In_Dropdown, value);
	}
	public void Search_icon() {
		click_Element(Search);	
	}

}
