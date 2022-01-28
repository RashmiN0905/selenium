		package rahulShettyPageForPractice;

	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class PracticePageRahulSheet {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			driver.findElement(By.xpath("//input[@value='radio1']")).click();
			driver.findElement(By.xpath("//input[@value='radio2']")).click();
			driver.findElement(By.xpath("//input[@value='radio3']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("India");
			WebElement dropdonw = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
			Select select=new Select(dropdonw);
			select.selectByIndex(1);
			select.selectByValue("option2");
			select.selectByVisibleText("Option3");
			driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
			driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
			driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
			String parent = driver.getWindowHandle();
			System.out.println(parent);
			driver.findElement(By.xpath("//button[@id='openwindow']")).click();
			Set<String> windows = driver.getWindowHandles();
			System.out.println(windows);
			for(String s:windows) {
				if(!s.equals(parent)) { 
					driver.switchTo().window(s);
					driver.manage().window().maximize();
					driver.close();

				}
			}
			driver.switchTo().window(parent);
			driver.findElement(By.xpath("//a[@id='opentab']")).click();
			Set<String> windows1 = driver.getWindowHandles();
			for(String s:windows1) {
				if(!s.equals(parent)) {
					driver.switchTo().window(s);
					driver.close();
				}
			}
			driver.switchTo().window(parent);
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Santhosh");
			driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
			driver.switchTo().alert().accept();
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//button[@id='mousehover']"))).perform();		
			WebElement iframe = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
			driver.switchTo().frame(iframe);
			System.out.println(driver.getTitle());
			driver.switchTo().defaultContent();
			
			for(int i=3;i<=29;i++) {
				System.out.println(driver.findElement(By.xpath("(//td)["+i+"]")).getText());
			}

			System.out.println(driver.findElement(By.xpath("//tr[1]/td[1]")).getText());
				
			driver.close();
		}

	}

