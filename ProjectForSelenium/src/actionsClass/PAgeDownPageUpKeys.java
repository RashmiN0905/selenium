package actionsClass;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PAgeDownPageUpKeys {

	public static void main(String[] args) throws InterruptedException {			
			System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");	
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		action.sendKeys(Keys.PAGE_DOWN).perform();
		WebElement searchBar = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		action.sendKeys(searchBar,"shoes").sendKeys(Keys.ENTER).perform();		
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement searchBar1 = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		 action.moveToElement(searchBar1).click().keyDown(Keys.SHIFT).sendKeys("shoes").keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).perform();
		
	}
}
