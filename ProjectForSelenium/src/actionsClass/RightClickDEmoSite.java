package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDEmoSite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");	
		WebElement doubleClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions  button = new Actions(driver);
		System.out.println(doubleClickButton.getText());
		Thread.sleep(2000);
		button.doubleClick(doubleClickButton).build().perform();
		Thread.sleep(2000);
	}

}
