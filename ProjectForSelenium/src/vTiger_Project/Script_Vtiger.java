package vTiger_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script_Vtiger {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SeleniumLibrary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage_vTiger loginpage = new LoginPage_vTiger(driver);
		loginpage.getUserNameTextField().sendKeys("admin");
		loginpage.getPasswordTextField().sendKeys("root");
		loginpage.getLoginButton().click();
		
		HomePage_vTiger homepage = new HomePage_vTiger(driver);
		homepage.getOrganisationButton().click();
		
		Organisation_Page organisation = new Organisation_Page(driver);		
		organisation .getAddOrganisationDetails().click();	
		
		Create_Organisation_vTiger details = new Create_Organisation_vTiger(driver);
		
		//OrganizationInfo
		details.getOrganizationName().sendKeys("amakart");
		details.getWebsiteName().sendKeys("http://www.amakart.com/");
		details.getTickersymbol().sendKeys("+");
		details.getMembersOfTextField().sendKeys("ShoppingApplications");
		details.getEmployeesTextField().sendKeys("2500");
		details.getOtherEmailIdTextField().sendKeys("halebidu@gmail.com");
				
		WebElement industry = details.getIndustrySelectBox();
		Select selectIndustry = new Select(industry);
		selectIndustry.selectByValue("Shipping");
		
		WebElement type = details.getAccounttypeSelectBox();
		Select selectType = new Select(type);
		selectType.selectByValue("Partner");
		
		details.getEmailoptoutCheckBox().click();
		details.getUserRadioButton().click();
		
//		WebElement adminstrator = details.getAdministratorSelectBox();
//		Select selectAdminstrator = new Select(adminstrator);
//		selectAdminstrator.selectByValue("Adminstrator");
		
		details.getPhoneNumberTextField().sendKeys("1237894568");
		details.getFaxTextField().sendKeys("@efaxsend.com.");
		details.getOtherPhoneNumberTextField().sendKeys("1478529630");
		details.getEmailIdTextField().sendKeys("javagal@gamil.com");
		details.getOwnershipTextField().sendKeys("meOwner-GoldMember");
		
		WebElement ratings = details.getRatingsMultiSelectbox();
		Select selectRatings = new Select(ratings);
		selectRatings.selectByValue("Active");
		
		details.getSicCodeTextbox().sendKeys("0001122");
		details.getAnnual_revenueTextbox().sendKeys("122000000");
		details.getNotifyOwnerCheckbox().click();
		
		//Address information
		details.getCopyShippingRadioButton().click();
		details.getBillingAddressTextField().sendKeys("xyz-Road, Hassan");
		details.getShippingAddressTextField().sendKeys("Abc road javagl");
		details.getBillingPoBoxTextField().sendKeys("111111");
		details.getBillingCityTextField().sendKeys("Hassan");
		details.getShippingPoBoxTextField().sendKeys("222222");
		details.getShip_cityTextField().sendKeys("javagal");
		details.getBillingStateTextField().sendKeys("Karnatka");
		details.getShipstateTextField().sendKeys("Hyderabad");
		details.getBillingPostalCodeTextField().sendKeys("573125");
		details.getShipPostalCodeTextField().sendKeys("573225");
		details.getBillingCountryTextField().sendKeys("India");
		details.getShipCountryTextField().sendKeys("India");
		details.getDescriptionTextField().sendKeys("this is our Official website, please visit..........Thank you");
		
		details.getSaveButton().click();
		
		driver.close();
		


	}

}
