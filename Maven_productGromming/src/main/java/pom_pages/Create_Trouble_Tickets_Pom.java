package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility_Methods_Product;

public class Create_Trouble_Tickets_Pom extends Utility_Methods_Product{
	
	public Create_Trouble_Tickets_Pom (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt=\"Create Ticket...\"]")
	WebElement Create_Ticket;
	
	@FindBy(xpath="//textarea[@name=\"ticket_title\"]")
	WebElement Title;
	
	@FindBy(xpath="(//input[@name=\"assigntype\"])[1]")
	WebElement Assign_Type;
	
	@FindBy(xpath="//select[@name=\"ticketpriorities\"]")
	WebElement Ticket_Priories;
	
	@FindBy(xpath="//select[@name=\"ticketstatus\"]")
	WebElement Ticket_Status;
	
	@FindBy(xpath="(//input[@title=\"Save [Alt+S]\"])[2]")
	WebElement Save_Ticket;
	
	@FindBy(xpath="(//input[@title=\"Delete [Alt+D]\"])[1]")
	WebElement Delete_Ticket;
	
	public void Create_Ticket_Icon() {
		click_Element(Create_Ticket);
	}
	
	public void Title_Textfield(String value) {
		Entervalue_In_Editfield(Title, value);
	}
	
	public void Assign_Type_Checkbox( ) {
		click_Element(Assign_Type);
	}
	
	public void Ticket_Priories_Dropdown(String value) {
		Select_by_index(Ticket_Priories, value);
	}
	public void Ticket_Status_Dropdown(String value) {
		Select_by_index(Ticket_Status, value);
	}
	
	public void Save_Ticket_Icon() {
		click_Element(Save_Ticket);
	}
	
	public void Delete_Ticket_Icon() {
		click_Element(Delete_Ticket);
	}
}
