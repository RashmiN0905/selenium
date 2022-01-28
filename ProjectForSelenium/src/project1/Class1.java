package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.myntra.com/");
		driver.manage().window().maximize();
		boolean displayed = driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).isDisplayed();
		System.out.println("is it displayed :"+displayed);
		
		boolean Enabeled = driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).isEnabled();
		System.out.println("is it Enabled :"+Enabeled );
	}

}
