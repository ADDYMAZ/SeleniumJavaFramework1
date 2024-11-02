package Tests;

import Pages.GoogleSearchPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
	static WebDriver driver = null;

	public static void main (String[] args) throws InterruptedException {
		googlesearch();
		
	}
	
public static void googlesearch() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Adnan US Automation\\SeleniumJavaFramework\\Drivers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://google.com/");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("CNN");
		
	//	GoogleSearchPage.textbox_search(driver).sendKeys(Keys.RETURN);
		
		Thread.sleep(3000);

		
		GoogleSearchPage.textbox_search(driver).sendKeys(Keys.ESCAPE);	
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.ENTER);
		
		driver.close();
		
		System.out.println("Test Completed Successfully");
	}
}
