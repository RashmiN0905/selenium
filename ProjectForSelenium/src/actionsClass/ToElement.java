package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/");
	WebElement image = driver.findElement(By.xpath("//img[@src='https://images-static.nykaa.com/uploads/19a726a3-e19c-47dd-a97a-1881ff7f479d.jpg?tr=w-1200,cm-pad_resize']"));
	Actions takeCursor = new Actions(driver);
	
	
	}

}
