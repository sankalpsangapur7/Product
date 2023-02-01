package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility_Methods_Product;

public class Leads_pom_page extends Utility_Methods_Product {
	
	//Constructor
		public Leads_pom_page (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		//WebElement
		@FindBy(xpath = "//img[@alt=\"Create Lead...\"]")
		WebElement createleadsicon;
		
		@FindBy(xpath = "//select[@name=\"salutationtype\"]")
		WebElement namedropdown;
		
		@FindBy(xpath = "//input[@name=\"firstname\"]")
		WebElement firstname;
		
		@FindBy(xpath = "//input[@name=\"lastname\"]")
		WebElement lastname;
		
		@FindBy(xpath = "//input[@name=\"company\"]")
		WebElement companyname;
		
		@FindBy(xpath = "//input[@id=\"designation\"]")
		WebElement title;
		
		@FindBy(xpath = "//select[@name=\"leadsource\"]")
		WebElement leadsource_dropdown;
		
		@FindBy(xpath = "//select[@name=\"industry\"]")
		WebElement industry_dropdown;
		
		@FindBy(xpath = "//input[@type=\"radio\" and @value=\"U\"]")
		WebElement user_radiobtn;
		
		@FindBy(xpath = "(//input[@type=\"submit\"])[1]")
		WebElement save_btn;
		
		@FindBy(xpath = "(//input[@name=\"Delete\"])[2]")
		WebElement delete_btn;
		
	

		//methods
		public void createLeads() {
			createleadsicon.click();
		}
		
		public void selectnamedropdown(String value) {
			Select_by_index(namedropdown, value);
		}
		
		public void Enter_firstname(String value) {
			Entervalue_In_Editfield(firstname, value);
		}
		
		public void Enter_lastname(String value) {
			Entervalue_In_Editfield(lastname, value);
		}
		
		public void Enter_companyname(String value) {
			Entervalue_In_Editfield(companyname, value);
		}
		
		public void Enter_title(String value) {
			Entervalue_In_Editfield(title, value);
		}
		
		public void selectuser_radiobtn() {
			user_radiobtn.click();
		}
		
		public void selectindustry_dropdown(String value) {
			Select_by_index(industry_dropdown, value);
		}
		
		public void selectleadsource_dropdown(String value) {
			Select_by_index(leadsource_dropdown, value);
		}
		
		public void click_savebtn() {
			save_btn.click();
		}
		
		public void click_delete_btn() {
			delete_btn.click();
		}
		
		
			

	}
