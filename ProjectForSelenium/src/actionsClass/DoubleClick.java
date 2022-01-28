package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[contains(text(),'Double click Here')]"));
		Actions  button = new Actions(driver);
		System.out.println(doubleClickButton.getText());
		Thread.sleep(2000);
		button.doubleClick(doubleClickButton).build().perform();
		Thread.sleep(2000);
		Alert doubleClickAlert = driver.switchTo().alert();
		doubleClickAlert.accept();
		Thread.sleep(2000);
		driver.close();
		

	}

}
