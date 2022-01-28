package webdriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait_Case2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");

		driver.findElement(By.id("small-searchterms")).sendKeys("com");
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();

		driver.findElement(By.name("As")).click();

//		WebElement catagorySelectBox = driver.findElement(By.id("Cid"));
//		Select selectCatagory = new Select(catagorySelectBox);
//		selectCatagory.selectByValue("4");
//	
//		driver.findElement(By.id("Isc")).click();
//		WebElement manufacturerSelectBox = driver.findElement(By.id("Mid"));
//		Select selectmanufacturer = new Select(manufacturerSelectBox);
//		selectmanufacturer.selectByValue("3");
//		
//		driver.findElement(By.id("Pf")).sendKeys("800");
//		driver.findElement(By.name("Pt")).sendKeys("2500");
//		driver.findElement(By.id("Sid")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//input[@class='button-1 search-button']"))))
				.click();

		WebElement positionSelectBox = driver.findElement(By.id("products-orderby"));
		Select selectposition = new Select(positionSelectBox);
		selectposition.selectByVisibleText("Price: Low to High");

		WebElement pageSize = driver.findElement(By.id("products-pagesize"));
		Select selectPAgeSize = new Select(pageSize);
		selectPAgeSize.selectByVisibleText("12");

		WebElement viewType = driver.findElement(By.name("products-viewmode"));
		Select selectView = new Select(viewType);
		selectView.selectByVisibleText("List");

		driver.findElement(By.xpath("//a[text()='Build your own expensive computer']")).click();

		driver.findElement(By.xpath("//input[@id='product_attribute_74_5_26_82']")).click();
		driver.findElement(By.xpath("//input[@id='product_attribute_74_6_27_84']")).click();
		driver.findElement(By.xpath("//input[@id='product_attribute_74_3_28_87']")).click();
		driver.findElement(By.xpath("//input[@id='product_attribute_74_8_29_88']")).click();
		driver.findElement(By.xpath("//input[@id='product_attribute_74_8_29_89']")).click();
		driver.findElement(By.xpath("//input[@id='product_attribute_74_8_29_90']")).click();
		driver.findElement(By.id("add-to-cart-button-74")).click();

	}

}
