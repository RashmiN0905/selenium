package automationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// RadioButton
		driver.findElement(By.xpath("//button[text()='Home']")).click();
//		//SuggestionBox
//		WebElement suggestionBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
//		suggestionBox.sendKeys("india");
//		Actions keyBoardAction = new Actions(driver);
//		keyBoardAction.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER);
	}

}
