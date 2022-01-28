package webdriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait_By_PradyumnaSir {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("com");
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		

	}

}
