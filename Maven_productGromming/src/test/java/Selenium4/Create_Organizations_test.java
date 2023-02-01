package Selenium4;

import org.testng.annotations.Test;

import Utility.Base_test_ProductGromming;
import pom_pages.create_Organizations_pom;
import pom_pages.pombasepage_vtiger;

public class Create_Organizations_test extends Base_test_ProductGromming {
	
	@Test
	public void TC03() {
		create_Organizations_pom o=new create_Organizations_pom(driver);
		o.Click_Organizations();
		o.Click_createOrganizationsicon();
		o.enter_org_name("tyss");
		o.enter_websitename("helloworld");
		o.select_user_rdiobtn();
		o.click_savebtn();
		
	}
	
}
