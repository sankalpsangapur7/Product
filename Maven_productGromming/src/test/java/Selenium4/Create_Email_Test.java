package Selenium4;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Utility.Base_test_ProductGromming;
import pom_pages.Create_Email_Pom;
import pom_pages.pombasepage_vtiger;

public class Create_Email_Test extends Base_test_ProductGromming{

	@Test
	
	public void Tc09() {
		pombasepage_vtiger pbv=new pombasepage_vtiger(driver);
		pbv.Click_Email();
		
		Create_Email_Pom cep=new Create_Email_Pom(driver);
		cep.Search_Textfield("sankalp");
		cep.Subject_Dropdown("2");
		cep.Selectall_Checkbox();
		cep.Delete_icon();
		Alert al=driver.switchTo().alert();
		al.accept();
	}
}
