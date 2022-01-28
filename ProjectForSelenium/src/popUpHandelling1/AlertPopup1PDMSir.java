package popUpHandelling1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopup1PDMSir {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");	
		WebElement RightClick = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions action = new Actions(driver);
		action.contextClick(RightClick).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Copy')]"))).click().perform();
		Alert PopUpAlert = driver.switchTo().alert();
		PopUpAlert.accept();
		
		WebElement RightClick1 = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions action1 = new Actions(driver);
		action.contextClick(RightClick1).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Edit')]"))).click().perform();
		Alert PopUpAlert1 = driver.switchTo().alert();
		System.out.println(PopUpAlert1.getText());
		PopUpAlert1.accept();
		
		
		WebElement RightClick2 = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions action2 = new Actions(driver);
		action2.contextClick(RightClick2).build().perform();
		Thread.sleep(2000);
		action2.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Cut')]"))).click().perform();
		Alert PopUpAlert2 = driver.switchTo().alert();
		System.out.println(PopUpAlert2.getText());
		PopUpAlert2.accept();
		
	}

}
