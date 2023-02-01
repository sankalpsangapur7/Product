package Selenium4;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Utility.Base_test_ProductGromming;
import pom_pages.Create_Trouble_Tickets_Pom;
import pom_pages.pombasepage_vtiger;

public class Create_Trouble_Ticket_Test extends Base_test_ProductGromming {

	@Test
	
	public void Tc10() {
		pombasepage_vtiger pbv=new pombasepage_vtiger(driver);
		pbv.Click_Trouble_tickets();
		
		Create_Trouble_Tickets_Pom ctt=new Create_Trouble_Tickets_Pom(driver);
		ctt.Create_Ticket_Icon();
		ctt.Title_Textfield("Train ticket");
		ctt.Assign_Type_Checkbox();
		ctt.Ticket_Priories_Dropdown("2");
		ctt.Ticket_Status_Dropdown("1");
		ctt.Save_Ticket_Icon();
		ctt.Delete_Ticket_Icon();
		Alert al=driver.switchTo().alert();
		al.accept();
		
	}
}
