package Selenium4;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Utility.Base_test_ProductGromming;
import pom_pages.Leads_pom_page;
import pom_pages.pombasepage_vtiger;

public class leads_test extends Base_test_ProductGromming{

	@Test
	public void TC02() {
		pombasepage_vtiger v= new pombasepage_vtiger(driver);
		
		v.clickLeads();
		
		Leads_pom_page l=new Leads_pom_page(driver);
		l.createLeads();
		l.selectnamedropdown("3");
		l.Enter_firstname("Sanku");
		l.Enter_lastname("TYSS");
		l.Enter_companyname("TestYantra");
		l.Enter_title("software Engineer");
		l.selectleadsource_dropdown("2");
		l.selectindustry_dropdown("2");
		l.click_savebtn();
		l.click_delete_btn();
		
		Alert ele= driver.switchTo().alert();
		ele.accept();
	
		
	}
}
