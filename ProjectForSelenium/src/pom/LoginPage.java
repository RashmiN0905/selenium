package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "username")
	private WebElement userNameTextField;

	@FindBy(name = "pwd")
	private WebElement passwordTextField;

	@FindBy(id = "loginButton")
	private WebElement loginButton;

	LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
