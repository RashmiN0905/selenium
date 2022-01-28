package popUpHandelling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SenKeysAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='prompt']")).click();
		Alert sendSomeValue = driver.switchTo().alert();
		Thread.sleep(3000);
		sendSomeValue.sendKeys("My name is Rashmi");
		Thread.sleep(3000);
		sendSomeValue.accept();
	}

}
