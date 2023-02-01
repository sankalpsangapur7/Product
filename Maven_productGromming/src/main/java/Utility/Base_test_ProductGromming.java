package Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_test_ProductGromming {
public WebDriver driver;
	
	@BeforeClass
	public void Browsersetup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		String url=Utility_Methods_Product.Test_configuration();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
		/*String uname=Utility_Methods_Product.Test_configuration();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(uname);
		String pwd=Utility_Methods_Product.Test_configuration();		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(pwd);*/
	}
	
	@AfterClass
	public void Turndown() {
	driver.quit();
	}

}
