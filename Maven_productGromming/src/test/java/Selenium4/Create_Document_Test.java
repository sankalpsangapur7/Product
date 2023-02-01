package Selenium4;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Utility.Base_test_ProductGromming;
import pom_pages.Create_Document_Pom;
import pom_pages.pombasepage_vtiger;

public class Create_Document_Test extends Base_test_ProductGromming{

		@Test
		
		public void Tc08() {
			pombasepage_vtiger pbv=new pombasepage_vtiger(driver);
			pbv.Click_Document();
			
			Create_Document_Pom cdp=new Create_Document_Pom(driver);
			cdp.Create_Document();
			cdp.Document_Name("Fireflink");
			cdp.Folder_Name_Dropdown("1");
			cdp.Save_Document();
			cdp.Delete_Document();
			Alert al=driver.switchTo().alert();
			al.accept();
		}
}
