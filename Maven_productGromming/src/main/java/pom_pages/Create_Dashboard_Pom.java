package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility_Methods_Product;

public class Create_Dashboard_Pom extends Utility_Methods_Product{

	public Create_Dashboard_Pom (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//select[@name=\"dashordlists\"])[1]")
	WebElement dashboard_List;
	
	@FindBy(xpath="(//a[@class=\"dash_href\"])[2]")
	WebElement dashboard_Next_Page;
	
	
	@FindBy(xpath="//img[@src=\"themes/softed/images/btnL3Clock.gif\"]")
	WebElement clock;
	

	
	public void dashboard_Next_Page_icon( ) {
		click_Element(dashboard_Next_Page);	
		}
	
	public void Dashboard_List_Dropdown(String value) {
		Select_by_index(dashboard_List, value);
	}
	
	public void clock_Icon( ) {
    click_Element(clock);	
    
	}
	
}

