package popUpHandelling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertNotificationPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345Rashmi");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert deletePopup = driver.switchTo().alert();
		deletePopup.accept();
		deletePopup.accept();
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345Rashmi");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert deletePopup1 = driver.switchTo().alert();
		deletePopup1.dismiss();
		
	}

}
