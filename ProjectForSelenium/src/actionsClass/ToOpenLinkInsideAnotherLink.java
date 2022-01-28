package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenLinkInsideAnotherLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]")).click();
		driver.findElement(By.xpath("(//a[@title='Show products in category Notebooks'])[1]")).click();
		
	}

}
