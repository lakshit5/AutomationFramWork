package zz.com.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Day1 {

	//WebDriver driver =new ChromeDriver();
	//@Test
	@Test
	public void Day1() {
		WebDriver driver;
	String BROWSER=System.getProperty("browser");
	String URL=System.getProperty("url");
	
 	//Pull request 1 
	//Push request 1 
	 
		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}	
		driver.get("https://www.flipkart.com/");
		System.out.println("Browser launch sucessfully ");
	}
}
	
