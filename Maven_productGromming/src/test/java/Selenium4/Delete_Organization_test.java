package Selenium4;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Utility.Base_test_ProductGromming;
import pom_pages.Delete_Organization_Pom;
import pom_pages.create_Organizations_pom;
import pom_pages.pombasepage_vtiger;

public class Delete_Organization_test extends Base_test_ProductGromming {
	@Test
	public void TC04() {
		
		pombasepage_vtiger p= new pombasepage_vtiger(driver);
		p.Click_Organizations();
		
		Delete_Organization_Pom d= new Delete_Organization_Pom(driver);
		d.selectall_Org_checkbox();
		d.selectdelete_btn();
		Alert ale= driver.switchTo().alert();
		ale.accept();
		
		

	}
}
