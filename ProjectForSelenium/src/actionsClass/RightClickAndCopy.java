package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAndCopy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");	
		WebElement rightClickButton = driver.findElement(By.xpath("//span[(text()='right click me')]"));
		Actions  button = new Actions(driver);
		button.contextClick(rightClickButton).build().perform();
		Thread.sleep(2000);
		   button.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Copy')]"))).click().perform();
		   Alert ok = driver.switchTo().alert();
		   ok.accept();
	
		
	}

}
