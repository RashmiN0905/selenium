package popUpHandelling1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildWindowHandelling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://tutorialshut.com/demo-website-for-selenium-automation-practice/");

		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Actions actionPageDown = new Actions(driver);

		actionPageDown.sendKeys(Keys.PAGE_DOWN).build().perform();

		driver.findElement(By.xpath("//button[@id='button1']")).click();

		Set<String> childWindows = driver.getWindowHandles();

		for (String string : childWindows) {
			System.out.println(driver.switchTo().window(string));

		}
	}

}
