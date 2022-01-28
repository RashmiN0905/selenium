package vTiger_Project;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organisation_Page {

	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement addOrganisationDetails;

	Organisation_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddOrganisationDetails() {
		return addOrganisationDetails;
	}
}
