package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_TaskLink {

	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement Tasklink;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	HomePage_TaskLink(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getTasklink() {
		return Tasklink;
	}
	public WebElement getlogout() {
		return logout;
	}
	
}
