package rahulShettyPageForPractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@class='radioButton' and @value='radio1']")).click();
		driver.findElement(By.xpath("//input[@class='radioButton' and @value='radio2']")).click();
		driver.findElement(By.xpath("//input[@class='radioButton' and @value='radio3']")).click();
		
		WebElement country = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		country.sendKeys("India");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select option= new Select(dropdown);
		option.selectByValue("option3");
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
			
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		for (String string : windows) {
			if(!string.equals(parentWindow)) {			
			driver.switchTo().window(string);
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			driver.close();
			}	
		}
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		driver.close();
		
		
		
		

		
//		Actions countrySelect = new Actions(driver);
//		countrySelect.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN);
//	

	}

}
