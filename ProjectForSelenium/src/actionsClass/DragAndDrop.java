package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement Block1 = driver.findElement(By.xpath("//h1[contains(text(),'Block 1')]"));
		WebElement Block2 = driver.findElement(By.xpath("//h1[contains(text(),'Block 2')]"));
		System.out.println(Block2.getText());
		Actions Drag = new Actions(driver);
		Thread.sleep(2000);
		Drag.dragAndDrop(Block2, Block1).build().perform();		
	}
}
