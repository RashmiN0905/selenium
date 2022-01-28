package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://f5mail.rediff.com/");
		
	/*	TakesScreenshot image = (TakesScreenshot)driver;
		File source = image.getScreenshotAs(OutputType.FILE);
		File Destination = new File("./screenShots/omayo.png");
		FileUtils.copyFile(source, Destination);*/
		
		TakesScreenshot image =(TakesScreenshot)driver;
		File source = image.getScreenshotAs(OutputType.FILE);
		File Destination = new File("./screenShots/rediff.png");
		FileUtils.copyFile(source, Destination);
		driver.close();					
			}
		
	}


