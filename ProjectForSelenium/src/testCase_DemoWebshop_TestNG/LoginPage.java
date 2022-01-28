package testCase_DemoWebshop_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class LoginPage {
	
	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("nerligerashmi@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("nerlige123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();	
		driver.close();
	}
}
