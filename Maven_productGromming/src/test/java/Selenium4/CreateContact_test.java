package Selenium4;

import org.testng.annotations.Test;

import Utility.Base_test_ProductGromming;
import pom_pages.Createcontact_Pom;
import pom_pages.pombasepage_vtiger;

public class CreateContact_test extends Base_test_ProductGromming {

	@Test
	public void TC05() {
		pombasepage_vtiger pb=new pombasepage_vtiger(driver);
		pb.click_contact();
		
		Createcontact_Pom ccp=new Createcontact_Pom(driver);
		ccp.create_contacticon();
		ccp.selectname_dropdown("2");
		ccp.enterfirstname("rajaneesh");
		ccp.enterlastname("raj");
		ccp.descriptiontextfield("chethu saw big snake");
		ccp.Assistant_Textfield("sanku");
		ccp.Save_Contact();
		ccp.Delete_contact();
		
		
	}
	
	

}
