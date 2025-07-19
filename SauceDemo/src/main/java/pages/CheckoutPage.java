package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.DriverFactory;

public class CheckoutPage {
	WebDriver driver;
	
	@FindBy(id = "first-name")
	WebElement fName;
	
	@FindBy(id ="last-name")
	WebElement lName;
	
	@FindBy(css = "input[type = 'submit']")
	WebElement submit;
	
	@FindBy(id = "postal-code")
	WebElement postalCode;
	
	public CheckoutPage() {
		this.driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void enterFirstname(String firstName) {
		fName.sendKeys(firstName);
		
	}
	
	public void enterLastname(String lastName) {
		lName.sendKeys(lastName);
	}
	
	public void enterPostalcode(String pCode) {
		postalCode.sendKeys(pCode);
	}
	
	public void clickContinue() {
		submit.click();
	}

}
