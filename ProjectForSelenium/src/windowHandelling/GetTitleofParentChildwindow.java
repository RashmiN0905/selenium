package windowHandelling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetTitleofParentChildwindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		String mainWindow = driver.getTitle();
		System.out.println(mainWindow);
		WebElement cursor = driver.findElement(By.xpath("//div[text()='Companies']"));
		Actions action = new Actions(driver);
		action.moveToElement(cursor).build().perform();
		driver.findElement(By.xpath("//a[@title='Unicorn']")).click();
		Set<String> windows = driver.getWindowHandles();
		for (String string : windows) {
			if (!string.equals(mainWindow)) {
				driver.switchTo().window(string);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}


	}

}
