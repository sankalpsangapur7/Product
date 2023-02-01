package Selenium4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utility.Base_test_ProductGromming;
import Utility.Utility_Methods_Product;
import pom_pages.Create_Opportunity_Pom;
import pom_pages.pombasepage_vtiger;

public class Create_Opportunity_Test extends Base_test_ProductGromming{
	
	@Test
	
	public void Tc06() {
		pombasepage_vtiger pbv=new pombasepage_vtiger(driver);
		pbv.Opportunity_Icon();
		
		Create_Opportunity_Pom cop=new Create_Opportunity_Pom(driver);
		cop.Create_opportunity();
		cop.Opportunity_Name("senani");
		cop.related_textfield("TYSS");
		cop.Relatedto_Dropdown("1");
		cop .User_radiobutton();
		cop.Closingdate_Textfield("2023-01-28");
		cop.SalesStage_Dropdown("4");
		cop.Save_Opportunity();
		Alert ale= driver.switchTo().alert();
		ale.accept();
	}
}
