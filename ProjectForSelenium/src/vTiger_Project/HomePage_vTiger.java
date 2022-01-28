package vTiger_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_vTiger {
	@FindBy(xpath="(//a[contains(text(),'Organizations')])[1]")
	private WebElement organisationButton;
	
	HomePage_vTiger(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrganisationButton() {
		return organisationButton;
	}
	
}
