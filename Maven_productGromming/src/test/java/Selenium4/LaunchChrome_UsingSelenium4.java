package Selenium4;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome_UsingSelenium4 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demowebshop.tricentis.com/register");
		String parentWindow=driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.switchTo().window(parentWindow);
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.quit();
	}

}
