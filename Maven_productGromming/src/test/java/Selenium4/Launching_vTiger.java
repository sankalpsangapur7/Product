package Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utility.Base_test_ProductGromming;
import Utility.Utility_Methods_Product;
import pom_pages.DWS_HomePage;
import pom_pages.DWS_LoginPage;
import pom_pages.pombasepage_vtiger;

public class Launching_vTiger extends Base_test_ProductGromming {
	
	
		@Test
		public void TC01() {
			pombasepage_vtiger v= new pombasepage_vtiger(driver);
			
				/*v.Enter_username("admin");
				v.Enter_password("admin");
				v.Click_Login_button();*/
		}
		}
