package popUpHandelling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://omayo.blogspot.com/");
driver.findElement(By.xpath("//input[@id='alert1']")).click();
Alert alertButton = driver.switchTo().alert();
System.out.println(alertButton.getText());
alertButton.accept();
driver.close();
	}

}
