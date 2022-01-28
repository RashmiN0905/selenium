package webdriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_By_PradyumnaSir {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Rashmi");
		driver.findElement(By.id("LastName")).sendKeys("N Nagaraj");
		driver.findElement(By.id("Email")).sendKeys("rashmi$3@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("rashmi123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("rashmi123");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("register-button")))).click();
		
		driver.close();
	}

}
