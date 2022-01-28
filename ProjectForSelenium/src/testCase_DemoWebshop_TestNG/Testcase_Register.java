package testCase_DemoWebshop_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase_Register {
	@BeforeSuite
	public void Register() {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("RashmiN");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Nags");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("nerligerashmi@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("nerlige123");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("nerlige123");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.close();
	}

	}


