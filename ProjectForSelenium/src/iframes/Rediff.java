package iframes;



	import java.util.NoSuchElementException;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Rediff {



		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe/");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.rediff.com/");
			
			driver.findElement(By.linkText("Sign in")).click();
			driver.findElement(By.id("login1")).sendKeys("navgire.kartik");
			driver.findElement(By.id("password")).sendKeys("Rukartik@12");
			driver.findElement(By.name("proceed")).click();
			
			driver.findElement(By.linkText("Write mail")).click();
			WebElement Enter = driver.findElement(By.xpath("//input[@type=\"text\" and @placeholder=\"Enter name or email\" and @autocomplete=\"off\" ]"));
			Enter.sendKeys("navgire.kartik@rediffmail.com");
		
			
			driver.findElement(By.xpath("//input[@class=\"rd_inp_sub rd_subject_datacmp2\"] ")).sendKeys("Kartik");
			
			WebElement body = driver.findElement(By.xpath("//iframe[@title=\"Rich Text Editor, rdMailEditorcmp2\"]"));
			driver.switchTo().frame(body);
			driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hello GoodEvenig!");
			Thread.sleep(2000);
			
					driver.switchTo().defaultContent();
			
			driver.findElement(By.linkText("Send")).click();
			
			for(;;) {
				try {
					driver.findElement(By.xpath("//span[text()=\"kartik navgire\"]/..//cite[@title=\"Select mail\"]")).click();
					driver.findElement(By.xpath("//span[text()=\"Delete\" and @class=\"rd_fil_del\"]")).click();
					driver.findElement(By.xpath("//button[text()='Ok']")).click();
					break;
				}
				catch(NoSuchElementException e) {
					driver.navigate().refresh();
				}
			}
			
		

	}

}
