package popUpHandelling1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopToFaceBookWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
	

		driver.findElement(By.xpath("//a[text()='Facebook']")).sendKeys(Keys.CONTROL+" "+Keys.ENTER);

		Set<String> Windows = driver.getWindowHandles();
		Iterator<String> iterate = Windows.iterator();
		Thread.sleep(2000);
		String mainWindow = iterate.next();
		String childWindow = iterate.next();
		driver.switchTo().window(childWindow);	
		Thread.sleep(2000);
		driver.close();		
	}
}
