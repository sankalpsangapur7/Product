package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility_Methods_Product;

public class pombasepage_vtiger extends Utility_Methods_Product {

	//Constructor
	public pombasepage_vtiger (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//WebElement
	@FindBy(xpath = "//input[@type=\"text\"]")
	WebElement username;
	
	@FindBy(xpath = "//input[@name=\"user_password\"]")
	WebElement password;
	
	@FindBy(xpath = "//input[@id=\"submitButton\"]")
	WebElement login_btn;
	
	@FindBy(xpath = "//a[@href=\"index.php?module=Leads&action=index\"]")
	WebElement leads;
	
	@FindBy(xpath = "//a[text()='Organizations']")
	WebElement Organizations;
	
	@FindBy(xpath="//a[@href=\"index.php?module=Contacts&action=index\"]")
	WebElement contact;
	
	@FindBy(xpath="//a[@href=\"index.php?module=Potentials&action=index\"]")
	WebElement Opportunity;
	
	@FindBy(xpath="//a[@href=\"index.php?module=Products&action=index\"]")
	WebElement products;
	
	@FindBy(xpath="//a[@href=\"index.php?module=Documents&action=index\"]")
	WebElement Document;
	
	@FindBy(xpath="//a[@href=\"index.php?module=Emails&action=index\"]")
	WebElement Email;
	
	@FindBy(xpath="//a[@href=\"index.php?module=HelpDesk&action=index\"]")
	WebElement Trouble_Tickets;
	
	@FindBy(xpath="//a[@href=\"index.php?module=Dashboard&action=index\"]")
	WebElement Dashboard;
	
	@FindBy(xpath="(//a[@href=\"javascript:;\"])[1]")
	WebElement More;
	
	//Method
	public void Enter_username(String value) {
		username.sendKeys(value);
	}
	
	public void Enter_password(String value) {
		password.sendKeys(value);
		
	}
	
	public void Click_Login_button() {
		login_btn.click();
	}
	
	/*public  void login(WebDriver driver) {
		pombasepage_vtiger p= new pombasepage_vtiger(driver);
		p.Enter_username("admin");
		p.Enter_password("admin");
		p.Click_Login_button();
	}*/
	
	
	public void clickLeads() {
		leads.click();
	}
	
	public void Click_Organizations() {
		Organizations.click();
	}
	
	public void click_contact() {
	contact.click();
	}
	
	public void Opportunity_Icon() {
		click_Element(Opportunity);
	}
	
	public void Click_Product() {
		click_Element(products);
	}
	
	public void Click_Document() {
		click_Element(Document);
	}
	
	public void Click_Email() {
		click_Element(Email);
	}
	
	public void Click_Trouble_tickets() {
		click_Element(Trouble_Tickets);
	}
	
	public void Click_Dashboard() {
		click_Element(Dashboard);
	}
	
	public void Click_More_Icon( ) {
	    click_Element(More);	
		}
}



