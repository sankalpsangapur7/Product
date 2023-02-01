package Selenium4;

import org.testng.annotations.Test;

import Utility.Base_test_ProductGromming;
import pom_pages.Create_Dashboard_Pom;
import pom_pages.pombasepage_vtiger;

public class Create_Dashboard_Test extends Base_test_ProductGromming {
	@Test
	
	public void Tc11(){
		pombasepage_vtiger pbv=new pombasepage_vtiger(driver);
		pbv.Click_Dashboard();
		
		Create_Dashboard_Pom cdp=new Create_Dashboard_Pom(driver);
		cdp.Dashboard_List_Dropdown("0");
		cdp.dashboard_Next_Page_icon();
		
		cdp.Dashboard_List_Dropdown("1");
		cdp.clock_Icon();
		
		
		 
		
	}

}
