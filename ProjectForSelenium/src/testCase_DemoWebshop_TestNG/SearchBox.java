package testCase_DemoWebshop_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class SearchBox {
	@AfterSuite
	public void search_Box(){
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		driver.close();
	}
}
