package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptActiTimePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.getUserNameTextField().sendKeys("admin");
		loginpage.getPasswordTextField().sendKeys("manager");
		loginpage.getLoginButton().click();
		
		HomePage_TaskLink homepage = new HomePage_TaskLink(driver);
		homepage.getTasklink().click();
		homepage.getlogout().click();
		

	}

}
