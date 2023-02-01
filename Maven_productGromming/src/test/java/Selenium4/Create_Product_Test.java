package Selenium4;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Utility.Base_test_ProductGromming;
import pom_pages.Create_Product_Pom;
import pom_pages.pombasepage_vtiger;

public class Create_Product_Test extends Base_test_ProductGromming{
	@Test
	
	public void TC07() {
		pombasepage_vtiger pbv=new pombasepage_vtiger(driver);
		pbv.Click_Product();
		
		Create_Product_Pom cpp=new Create_Product_Pom(driver);
		cpp.Create_Product();
		cpp.Product_Name("Fireflink");
		cpp.Vendor_Name("Sankalp");
		cpp.Vendor_Part_No("9741");
		cpp.Part_No("12345");
		cpp.Serial_No("9876");
		cpp.Save_Product();
		cpp.Delete_Product();
		Alert al=driver.switchTo().alert();
		al.accept();
	}
	
}
