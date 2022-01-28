package iframes_PradyumnaISir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NDTVhtml_pageByName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sande/Downloads/iframe.html");
		Thread.sleep(8000);
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//a[@class='allow']")).click();
		driver.findElement(By.xpath("//a[text()='BUSINESS']")).click();
	}

}
