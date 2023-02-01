package Selenium4;

import org.testng.annotations.Test;

import Utility.Base_test_ProductGromming;
import pom_pages.Create_More_Pom;
import pom_pages.pombasepage_vtiger;

public class Create_More_Test extends Base_test_ProductGromming {
	
	@Test
	
	public void Tc12() throws InterruptedException {
		pombasepage_vtiger pbv=new pombasepage_vtiger(driver);
		pbv.Click_More_Icon();
		
		Create_More_Pom cmp=new Create_More_Pom(driver);
		cmp.Service_Contracts();
		cmp.Search_Bar_textfield("fireflink");
		cmp.In_Dropdown("2");
		cmp.Search_icon();
		//cmp.Purchase_Order();
		
	}

}
