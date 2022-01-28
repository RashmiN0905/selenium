package vTiger_Project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Organization_Link {

	@FindBy(xpath="(//a[contains(text(),'Organizations')])[1]")
	private WebElement organisationButton;
	
	
}
