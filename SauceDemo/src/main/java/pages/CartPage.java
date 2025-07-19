package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.DriverFactory;

public class CartPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//button[text() ='Checkout']")
	WebElement checkoutButton;
	
	
	public CartPage(){
		this.driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	
	public void checkoutClick() {
		checkoutButton.click();
	}

}
